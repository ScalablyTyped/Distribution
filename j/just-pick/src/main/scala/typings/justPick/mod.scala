package typings.justPick

import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T, U /* <: /* keyof T */ String */](obj: T, select1: U, selectn: U*): Pick[T, U] = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], select1.asInstanceOf[js.Any], selectn.asInstanceOf[js.Any])).asInstanceOf[Pick[T, U]]
  inline def apply[T, U /* <: /* keyof T */ String */](obj: T, select: js.Array[U]): Pick[T, U] = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], select.asInstanceOf[js.Any])).asInstanceOf[Pick[T, U]]
  
  @JSImport("just-pick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
