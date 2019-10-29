package typings.instabugDashReactnative.instabugDashReactnativeMod

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
  
  /* 2 */ val addAttachment: typings.instabugDashReactnative.instabugDashReactnativeMod.dismissType.addAttachment with Double = js.native
  /* 1 */ val cancel: typings.instabugDashReactnative.instabugDashReactnativeMod.dismissType.cancel with Double = js.native
  /* 0 */ val submit: typings.instabugDashReactnative.instabugDashReactnativeMod.dismissType.submit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[dismissType with Double] = js.native
}

