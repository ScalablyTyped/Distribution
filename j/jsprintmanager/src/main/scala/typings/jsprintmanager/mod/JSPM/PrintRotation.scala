package typings.jsprintmanager.mod.JSPM

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintRotation extends js.Object
@JSImport("jsprintmanager", "JSPM.PrintRotation")
@js.native
object PrintRotation extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrintRotation with Double] = js.native
  
  @js.native
  sealed trait None extends PrintRotation
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Rot180 extends PrintRotation
  /* 6 */ @js.native
  object Rot180 extends TopLevel[Rot180 with Double]
  
  @js.native
  sealed trait Rot270 extends PrintRotation
  /* 4 */ @js.native
  object Rot270 extends TopLevel[Rot270 with Double]
  
  @js.native
  sealed trait Rot90 extends PrintRotation
  /* 5 */ @js.native
  object Rot90 extends TopLevel[Rot90 with Double]
}
