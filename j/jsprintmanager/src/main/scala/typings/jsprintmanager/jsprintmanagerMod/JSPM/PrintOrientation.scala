package typings.jsprintmanager.jsprintmanagerMod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintOrientation extends js.Object

@JSImport("jsprintmanager", "JSPM.PrintOrientation")
@js.native
object PrintOrientation extends js.Object {
  @js.native
  sealed trait Landscape extends PrintOrientation
  
  @js.native
  sealed trait Portrait extends PrintOrientation
  
  /* 1 */ val Landscape: typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintOrientation.Landscape with Double = js.native
  /* 0 */ val Portrait: typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintOrientation.Portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOrientation with Double] = js.native
}

