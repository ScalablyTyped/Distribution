package typings.justPick

import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-pick", JSImport.Namespace)
  @js.native
  def apply[T, U /* <: /* keyof T */ String */](obj: T, select1: U, selectn: U*): Pick[T, U] = js.native
  @JSImport("just-pick", JSImport.Namespace)
  @js.native
  def apply[T, U /* <: /* keyof T */ String */](obj: T, select: js.Array[U]): Pick[T, U] = js.native
}
