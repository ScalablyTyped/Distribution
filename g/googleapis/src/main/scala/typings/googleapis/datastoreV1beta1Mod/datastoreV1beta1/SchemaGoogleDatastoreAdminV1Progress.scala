package typings.googleapis.datastoreV1beta1Mod.datastoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Measures the progress of a particular metric.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1Progress extends js.Object {
  /**
    * The amount of work that has been completed. Note that this may be greater
    * than work_estimated.
    */
  var workCompleted: js.UndefOr[String] = js.native
  /**
    * An estimate of how much work needs to be performed. May be zero if the
    * work estimate is unavailable.
    */
  var workEstimated: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1Progress {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1Progress]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1ProgressOps[Self <: SchemaGoogleDatastoreAdminV1Progress] (val x: Self) extends AnyVal {
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
    def setWorkCompleted(value: String): Self = this.set("workCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkCompleted: Self = this.set("workCompleted", js.undefined)
    @scala.inline
    def setWorkEstimated(value: String): Self = this.set("workEstimated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkEstimated: Self = this.set("workEstimated", js.undefined)
  }
  
}

