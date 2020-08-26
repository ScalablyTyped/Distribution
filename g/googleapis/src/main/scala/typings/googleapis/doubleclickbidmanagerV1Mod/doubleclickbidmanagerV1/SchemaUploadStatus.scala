package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the status of upload.
  */
@js.native
trait SchemaUploadStatus extends js.Object {
  /**
    * Reasons why upload can&#39;t be completed.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
  /**
    * Per-row upload status.
    */
  var rowStatus: js.UndefOr[js.Array[SchemaRowStatus]] = js.native
}

object SchemaUploadStatus {
  @scala.inline
  def apply(): SchemaUploadStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadStatus]
  }
  @scala.inline
  implicit class SchemaUploadStatusOps[Self <: SchemaUploadStatus] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setRowStatusVarargs(value: SchemaRowStatus*): Self = this.set("rowStatus", js.Array(value :_*))
    @scala.inline
    def setRowStatus(value: js.Array[SchemaRowStatus]): Self = this.set("rowStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowStatus: Self = this.set("rowStatus", js.undefined)
  }
  
}

