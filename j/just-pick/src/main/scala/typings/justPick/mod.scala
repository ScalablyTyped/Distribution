package typings.justPick

import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-pick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, U /* <: /* keyof T */ String */](obj: T, select1: U, selectn: U*): Pick[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")((scala.List(obj.asInstanceOf[js.Any], select1.asInstanceOf[js.Any])).`++`(selectn.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Pick[T, U]]
  inline def default[T, U /* <: /* keyof T */ String */](obj: T, select: js.Array[U]): Pick[T, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obj.asInstanceOf[js.Any], select.asInstanceOf[js.Any])).asInstanceOf[Pick[T, U]]
}
