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
  def apply(): SchemaWaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaiter]
  }
  @scala.inline
  implicit class SchemaWaiterOps[Self <: SchemaWaiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setError(value: SchemaStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFailure(value: SchemaEndCondition): Self = this.set("failure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSuccess(value: SchemaEndCondition): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

