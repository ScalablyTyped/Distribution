package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message wraps a location affected by a vulnerability and its
  * associated fix (if one is available).
  */
@js.native
trait SchemaPackageIssue extends js.Object {
  /**
    * The location of the vulnerability.
    */
  var affectedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.native
  /**
    * The location of the available fix for vulnerability.
    */
  var fixedLocation: js.UndefOr[SchemaVulnerabilityLocation] = js.native
  var severityName: js.UndefOr[String] = js.native
}

object SchemaPackageIssue {
  @scala.inline
  def apply(
    affectedLocation: SchemaVulnerabilityLocation = null,
    fixedLocation: SchemaVulnerabilityLocation = null,
    severityName: String = null
  ): SchemaPackageIssue = {
    val __obj = js.Dynamic.literal()
    if (affectedLocation != null) __obj.updateDynamic("affectedLocation")(affectedLocation.asInstanceOf[js.Any])
    if (fixedLocation != null) __obj.updateDynamic("fixedLocation")(fixedLocation.asInstanceOf[js.Any])
    if (severityName != null) __obj.updateDynamic("severityName")(severityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPackageIssue]
  }
}

