package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaWaiter extends StObject {
  
  /**
    * Output only. The instant at which this Waiter resource was created.
    * Adding the value of `timeout` to this instant yields the timeout deadline
    * for the waiter.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. If the value is `false`, it means the waiter is still
    * waiting for one of its conditions to be met.  If true, the waiter has
    * finished. If the waiter finished due to a timeout or failure, `error`
    * will be set.
    */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. If the waiter ended due to a failure or timeout, this value
    * will be set.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * [Optional] The failure condition of this waiter. If this condition is
    * met, `done` will be set to `true` and the `error` code will be set to
    * `ABORTED`. The failure condition takes precedence over the success
    * condition. If both conditions are met, a failure will be indicated. This
    * value is optional; if no failure condition is set, the only failure
    * scenario will be a timeout.
    */
  var failure: js.UndefOr[SchemaEndCondition] = js.undefined
  
  /**
    * The name of the Waiter resource, in the format:
    * projects/[PROJECT_ID]/configs/[CONFIG_NAME]/waiters/[WAITER_NAME]  The
    * `[PROJECT_ID]` must be a valid Google Cloud project ID, the
    * `[CONFIG_NAME]` must be a valid RuntimeConfig resource, the
    * `[WAITER_NAME]` must match RFC 1035 segment specification, and the length
    * of `[WAITER_NAME]` must be less than 64 bytes.  After you create a Waiter
    * resource, you cannot change the resource name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] The success condition. If this condition is met, `done` will
    * be set to `true` and the `error` value will remain unset. The failure
    * condition takes precedence over the success condition. If both conditions
    * are met, a failure will be indicated.
    */
  var success: js.UndefOr[SchemaEndCondition] = js.undefined
  
  /**
    * [Required] Specifies the timeout of the waiter in seconds, beginning from
    * the instant that `waiters().create` method is called. If this time
    * elapses before the success or failure conditions are met, the waiter
    * fails and sets the `error` code to `DEADLINE_EXCEEDED`.
    */
  var timeout: js.UndefOr[String] = js.undefined
}
object SchemaWaiter {
  
  @scala.inline
  def apply(): SchemaWaiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWaiter]
  }
  
  @scala.inline
  implicit class SchemaWaiterMutableBuilder[Self <: SchemaWaiter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setFailure(value: SchemaEndCondition): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSuccess(value: SchemaEndCondition): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
