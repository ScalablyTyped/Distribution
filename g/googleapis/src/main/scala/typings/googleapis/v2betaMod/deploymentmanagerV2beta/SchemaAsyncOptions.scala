package typings.googleapis.v2betaMod.deploymentmanagerV2beta

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
  def apply(): SchemaAsyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsyncOptions]
  }
  @scala.inline
  implicit class SchemaAsyncOptionsOps[Self <: SchemaAsyncOptions] (val x: Self) extends AnyVal {
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
    def setMethodMatch(value: String): Self = this.set("methodMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethodMatch: Self = this.set("methodMatch", js.undefined)
    @scala.inline
    def setPollingOptions(value: SchemaPollingOptions): Self = this.set("pollingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollingOptions: Self = this.set("pollingOptions", js.undefined)
  }
  
}

