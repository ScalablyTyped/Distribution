package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Exports data from the specified DICOM store. If a given resource (e.g., a
  * DICOM object with the same SOPInstance UID) already exists in the output,
  * it is overwritten with the version in the source dataset. Exported DICOM
  * data will persist when the DICOM store from which it was exported is
  * deleted.
  */
@js.native
trait SchemaExportDicomDataRequest extends js.Object {
  /**
    * Specifies where the exported data should be placed.
    */
  var outputConfig: js.UndefOr[SchemaOutputConfig] = js.native
}

object SchemaExportDicomDataRequest {
  @scala.inline
  def apply(outputConfig: SchemaOutputConfig = null): SchemaExportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExportDicomDataRequest]
  }
}

