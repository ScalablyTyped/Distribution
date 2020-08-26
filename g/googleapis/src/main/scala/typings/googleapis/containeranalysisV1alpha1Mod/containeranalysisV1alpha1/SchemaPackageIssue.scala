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
  def apply(): SchemaPackageIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageIssue]
  }
  @scala.inline
  implicit class SchemaPackageIssueOps[Self <: SchemaPackageIssue] (val x: Self) extends AnyVal {
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
    def setAffectedLocation(value: SchemaVulnerabilityLocation): Self = this.set("affectedLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAffectedLocation: Self = this.set("affectedLocation", js.undefined)
    @scala.inline
    def setFixedLocation(value: SchemaVulnerabilityLocation): Self = this.set("fixedLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedLocation: Self = this.set("fixedLocation", js.undefined)
    @scala.inline
    def setSeverityName(value: String): Self = this.set("severityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverityName: Self = this.set("severityName", js.undefined)
  }
  
}

