package typings.lovefield.lovefieldMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConstraintTiming extends js.Object

@JSImport("lovefield", "ConstraintTiming")
@js.native
object ConstraintTiming extends js.Object {
  @js.native
  sealed trait DEFERRABLE extends ConstraintTiming
  
  @js.native
  sealed trait IMMEDIATE extends ConstraintTiming
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstraintTiming with Double] = js.native
  /* 1 */ @js.native
  object DEFERRABLE extends TopLevel[DEFERRABLE with Double]
  
  /* 0 */ @js.native
  object IMMEDIATE extends TopLevel[IMMEDIATE with Double]
  
}

