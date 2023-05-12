package typings.hapiHoek

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFlattenMod {
  
  inline def apply[T](array: ArrayLike[T | js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def apply[T](array: ArrayLike[T | js.Array[T]], target: ArrayLike[T | js.Array[T]]): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("@hapi/hoek/lib/flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
