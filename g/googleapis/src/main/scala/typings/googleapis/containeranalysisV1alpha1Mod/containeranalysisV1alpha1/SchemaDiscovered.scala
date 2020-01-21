package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about the scan status of a discovered resource.
  */
@js.native
trait SchemaDiscovered extends js.Object {
  /**
    * The status of discovery for the resource.
    */
  var analysisStatus: js.UndefOr[String] = js.native
  /**
    * When an error is encountered this will contain a LocalizedMessage under
    * details to show to the user. The LocalizedMessage output only and
    * populated by the API.
    */
  var analysisStatusError: js.UndefOr[SchemaStatus] = js.native
  /**
    * Whether the resource is continuously analyzed.
    */
  var continuousAnalysis: js.UndefOr[String] = js.native
  /**
    * Output only. An operation that indicates the status of the current scan.
    * This field is deprecated, do not use.
    */
  var operation: js.UndefOr[SchemaOperation] = js.native
}

object SchemaDiscovered {
  @scala.inline
  def apply(
    analysisStatus: String = null,
    analysisStatusError: SchemaStatus = null,
    continuousAnalysis: String = null,
    operation: SchemaOperation = null
  ): SchemaDiscovered = {
    val __obj = js.Dynamic.literal()
    if (analysisStatus != null) __obj.updateDynamic("analysisStatus")(analysisStatus.asInstanceOf[js.Any])
    if (analysisStatusError != null) __obj.updateDynamic("analysisStatusError")(analysisStatusError.asInstanceOf[js.Any])
    if (continuousAnalysis != null) __obj.updateDynamic("continuousAnalysis")(continuousAnalysis.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiscovered]
  }
}

