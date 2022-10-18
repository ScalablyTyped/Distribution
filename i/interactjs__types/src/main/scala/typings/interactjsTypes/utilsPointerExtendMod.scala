package typings.interactjsTypes

import typings.interactjsTypes.anon.Set
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsPointerExtendMod {
  
  @JSImport("@interactjs/utils/pointerExtend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](dest: Partial[T & Set[T]], source: T): Partial[T & Set[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dest.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Partial[T & Set[T]]]
}
