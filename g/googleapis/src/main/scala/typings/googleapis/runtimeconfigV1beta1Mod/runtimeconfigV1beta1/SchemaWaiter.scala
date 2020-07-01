package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Waiter resource waits for some end condition within a RuntimeConfig
  * resource to be met before it returns. For example, assume you have a
  * distributed system where each node writes to a Variable resource indicating
  * the node&#39;s readiness as part of the startup process.  You then
  * configure a Waiter resource with the success condition set to wait until
  * some number of nodes have checked in. Afterwards, your application runs
  * some arbitrary code after the condition has been met and the waiter returns
  * successfully.  Once created, a Waiter resource is immutable.  To learn more
  * about using waiters, read the [Creating a
  * Waiter](/deployment-manager/runtime-configurator/creating-a-waiter)
  * documentation.
  */
@js.native
trait SchemaWaiter extends js.Object {
  /**
    * Output only. The instant at which this Waiter resource was created.
    * Adding the value of `timeout` to this instant yields the timeout deadline
    * for the waiter.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. If the value is `false`, it means the waiter is still
    * waiting for one of its conditions to be met.  If true, the waiter has
    * finished. If the waiter finished due to a timeout or failure, `error`
    * will be set.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * Output only. If the waiter ended due to a failure or timeout, this value
    * will be set.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * [Optional] The failure condition of this waiter. If this condition is
    * met, `done` will be set to `true` and the `error` code will be set to
    * `ABORTED`. The failure condition takes precedence over the success
    * condition. If both conditions are met, a failure will be indicated. This
    * value is optional; if no failure condition is set, the only failure
    * scenario will be a timeout.
    */
  var failure: js.UndefOr[SchemaEndCondition] = js.native
  /**
    * The name of the Waiter resource, in the format:
    * projects/[PROJECT_ID]/configs/[CONFIG_NAME]/waiters/[WAITER_NAME]  The
    * `[PROJECT_ID]` must be a valid Google Cloud project ID, the
    * `[CONFIG_NAME]` must be a valid RuntimeConfig resource, the
    * `[WAITER_NAME]` must match RFC 1035 segment specification, and the length
    * of `[WAITER_NAME]` must be less than 64 bytes.  After you create a Waiter
    * resource, you cannot change the resource name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Required] The success condition. If this condition is met, `done` will
    * be set to `true` and the `error` value will remain unset. The failure
    * condition takes precedence over the success condition. If both conditions
    * are met, a failure will be indicated.
    */
  var success: js.UndefOr[SchemaEndCondition] = js.native
  /**
    * [Required] Specifies the timeout of the waiter in seconds, beginning from
    * the instant that `waiters().create` method is called. If this time
    * elapses before the success or failure conditions are met, the waiter
    * fails and sets the `error` code to `DEADLINE_EXCEEDED`.
    */
  var timeout: js.UndefOr[String] = js.native
}

object SchemaWaiter {
  @scala.inline
  def apply(
    createTime: String = null,
    done: js.UndefOr[Boolean] = js.undefined,
    error: SchemaStatus = null,
    failure: SchemaEndCondition = null,
    name: String = null,
    success: SchemaEndCondition = null,
    timeout: String = null
  ): SchemaWaiter = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWaiter]
  }
}

