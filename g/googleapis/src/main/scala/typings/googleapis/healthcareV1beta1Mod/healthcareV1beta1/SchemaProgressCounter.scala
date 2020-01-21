package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ProgressCounter provides counters to describe an operation&#39;s progress.
  */
@js.native
trait SchemaProgressCounter extends js.Object {
  /**
    * The number of units that failed in the operation.
    */
  var failure: js.UndefOr[String] = js.native
  /**
    * The number of units that are pending in the operation.
    */
  var pending: js.UndefOr[String] = js.native
  /**
    * The number of units that succeeded in the operation.
    */
  var success: js.UndefOr[String] = js.native
}

object SchemaProgressCounter {
  @scala.inline
  def apply(failure: String = null, pending: String = null, success: String = null): SchemaProgressCounter = {
    val __obj = js.Dynamic.literal()
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (pending != null) __obj.updateDynamic("pending")(pending.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProgressCounter]
  }
}

