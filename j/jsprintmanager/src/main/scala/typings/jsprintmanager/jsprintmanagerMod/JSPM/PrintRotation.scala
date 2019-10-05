package typings.jsprintmanager.jsprintmanagerMod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintRotation extends js.Object

@JSImport("jsprintmanager", "JSPM.PrintRotation")
@js.native
object PrintRotation extends js.Object {
  @js.native
  sealed trait None extends PrintRotation
  
  @js.native
  sealed trait Rot180 extends PrintRotation
  
  @js.native
  sealed trait Rot270 extends PrintRotation
  
  @js.native
  sealed trait Rot90 extends PrintRotation
  
  /* 3 */ val None: typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintRotation.None with Double = js.native
  /* 6 */ val Rot180: typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintRotation.Rot180 with Double = js.native
  /* 4 */ val Rot270: typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintRotation.Rot270 with Double = js.native
  /* 5 */ val Rot90: typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintRotation.Rot90 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintRotation with Double] = js.native
}

