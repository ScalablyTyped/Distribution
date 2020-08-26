package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the error status for values that were not written.
  */
@js.native
trait SchemaCollectdValueError extends js.Object {
  /**
    * Records the error status for the value.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  /**
    * The zero-based index in CollectdPayload.values within the parent
    * CreateCollectdTimeSeriesRequest.collectd_payloads.
    */
  var index: js.UndefOr[Double] = js.native
}

object SchemaCollectdValueError {
  @scala.inline
  def apply(): SchemaCollectdValueError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectdValueError]
  }
  @scala.inline
  implicit class SchemaCollectdValueErrorOps[Self <: SchemaCollectdValueError] (val x: Self) extends AnyVal {
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
    def setError(value: SchemaStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

