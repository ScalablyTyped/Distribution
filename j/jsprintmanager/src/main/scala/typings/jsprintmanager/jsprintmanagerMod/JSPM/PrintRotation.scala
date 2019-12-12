package typings.jsprintmanager.jsprintmanagerMod.JSPM

import org.scalablytyped.runtime.TopLevel
import typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintRotation.None
import typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintRotation.Rot180
import typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintRotation.Rot270
import typings.jsprintmanager.jsprintmanagerMod.JSPM.PrintRotation.Rot90
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintRotation with Double] = js.native
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 6 */ @js.native
  object Rot180 extends TopLevel[Rot180 with Double]
  
  /* 4 */ @js.native
  object Rot270 extends TopLevel[Rot270 with Double]
  
  /* 5 */ @js.native
  object Rot90 extends TopLevel[Rot90 with Double]
  
}

