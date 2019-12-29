package typings.jsprintmanager.jsprintmanagerMod.JSPM

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintOrientation with Double] = js.native
  /* 1 */ @js.native
  object Landscape extends TopLevel[Landscape with Double]
  
  /* 0 */ @js.native
  object Portrait extends TopLevel[Portrait with Double]
  
}

