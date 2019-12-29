package typings.instabugDashReactnative.instabugDashReactnativeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait dismissType extends js.Object

@JSImport("instabug-reactnative", "dismissType")
@js.native
object dismissType extends js.Object {
  @js.native
  sealed trait addAttachment extends dismissType
  
  @js.native
  sealed trait cancel extends dismissType
  
  @js.native
  sealed trait submit extends dismissType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[dismissType with Double] = js.native
  /* 2 */ @js.native
  object addAttachment extends TopLevel[addAttachment with Double]
  
  /* 1 */ @js.native
  object cancel extends TopLevel[cancel with Double]
  
  /* 0 */ @js.native
  object submit extends TopLevel[submit with Double]
  
}

