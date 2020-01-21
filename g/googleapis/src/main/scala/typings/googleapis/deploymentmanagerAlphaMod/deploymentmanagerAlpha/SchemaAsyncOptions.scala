package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Async options that determine when a resource should finish.
  */
@js.native
trait SchemaAsyncOptions extends js.Object {
  /**
    * Method regex where this policy will apply.
    */
  var methodMatch: js.UndefOr[String] = js.native
  /**
    * Deployment manager will poll instances for this API resource setting a
    * RUNNING state, and blocking until polling conditions tell whether the
    * resource is completed or failed.
    */
  var pollingOptions: js.UndefOr[SchemaPollingOptions] = js.native
}

object SchemaAsyncOptions {
  @scala.inline
  def apply(methodMatch: String = null, pollingOptions: SchemaPollingOptions = null): SchemaAsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (methodMatch != null) __obj.updateDynamic("methodMatch")(methodMatch.asInstanceOf[js.Any])
    if (pollingOptions != null) __obj.updateDynamic("pollingOptions")(pollingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsyncOptions]
  }
}

