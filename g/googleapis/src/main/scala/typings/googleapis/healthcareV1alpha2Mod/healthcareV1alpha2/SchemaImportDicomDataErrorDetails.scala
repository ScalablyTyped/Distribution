package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returns the errors encountered during DICOM store import.
  */
@js.native
trait SchemaImportDicomDataErrorDetails extends js.Object {
  /**
    * Deprecated. Use only for debugging purposes.  Contains sample errors
    * encountered in imports of individual resources (for example, a Cloud
    * Storage object).
    */
  var sampleErrors: js.UndefOr[js.Array[SchemaErrorDetail]] = js.native
}

object SchemaImportDicomDataErrorDetails {
  @scala.inline
  def apply(): SchemaImportDicomDataErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportDicomDataErrorDetails]
  }
  @scala.inline
  implicit class SchemaImportDicomDataErrorDetailsOps[Self <: SchemaImportDicomDataErrorDetails] (val x: Self) extends AnyVal {
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
    def setSampleErrorsVarargs(value: SchemaErrorDetail*): Self = this.set("sampleErrors", js.Array(value :_*))
    @scala.inline
    def setSampleErrors(value: js.Array[SchemaErrorDetail]): Self = this.set("sampleErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleErrors: Self = this.set("sampleErrors", js.undefined)
  }
  
}

