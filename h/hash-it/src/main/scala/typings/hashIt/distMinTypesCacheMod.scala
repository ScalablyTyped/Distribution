package typings.hashIt

import typings.hashIt.distMinTypesConstantsMod.Class
import typings.std.Generator
import typings.std.WeakMap
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMinTypesCacheMod {
  
  @JSImport("hash-it/dist/min/types/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hash-it/dist/min/types/cache", "NON_ENUMERABLE_CLASS_CACHE")
  @js.native
  val NON_ENUMERABLE_CLASS_CACHE: WeakMap[NonEnumerableObject, String] = js.native
  
  inline def getUnsupportedHash(value: NonEnumerableObject, classType: Class): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnsupportedHash")(value.asInstanceOf[js.Any], classType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type NonEnumerableObject = (Generator[Any, Any, Any]) | js.Promise[Any] | (WeakMap[Any, Any]) | WeakSet[Any]
}
