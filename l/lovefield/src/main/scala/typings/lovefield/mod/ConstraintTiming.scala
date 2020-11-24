package typings.lovefield.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConstraintTiming extends js.Object
@JSImport("lovefield", "ConstraintTiming")
@js.native
object ConstraintTiming extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstraintTiming with Double] = js.native
  
  @js.native
  sealed trait DEFERRABLE extends ConstraintTiming
  /* 1 */ @js.native
  object DEFERRABLE extends TopLevel[DEFERRABLE with Double]
  
  @js.native
  sealed trait IMMEDIATE extends ConstraintTiming
  /* 0 */ @js.native
  object IMMEDIATE extends TopLevel[IMMEDIATE with Double]
}
