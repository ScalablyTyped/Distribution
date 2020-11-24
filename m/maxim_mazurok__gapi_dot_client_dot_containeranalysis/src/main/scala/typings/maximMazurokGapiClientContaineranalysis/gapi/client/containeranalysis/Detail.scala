package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detail extends js.Object {
  
  /** Required. The name of the package where the vulnerability was found. */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  
  /** Required. The CPE URI in [cpe format](https://cpe.mitre.org/specification/) in which the vulnerability manifests. Examples include distro or storage location for vulnerable jar. */
  var cpeUri: js.UndefOr[String] = js.native
  
  /** A vendor-specific description of this note. */
  var description: js.UndefOr[String] = js.native
  
  /** The fix for this specific package version. */
  var fixedLocation: js.UndefOr[VulnerabilityLocation] = js.native
  
  /** Whether this detail is obsolete. Occurrences are expected not to point to obsolete details. */
  var isObsolete: js.UndefOr[Boolean] = js.native
  
  /** The max version of the package in which the vulnerability exists. */
  var maxAffectedVersion: js.UndefOr[Version] = js.native
  
  /** The min version of the package in which the vulnerability exists. */
  var minAffectedVersion: js.UndefOr[Version] = js.native
  
  /** The type of package; whether native or non native(ruby gems, node.js packages etc). */
  var packageType: js.UndefOr[String] = js.native
  
  /** The severity (eg: distro assigned severity) for this vulnerability. */
  var severityName: js.UndefOr[String] = js.native
  
  /** The time this information was last changed at the source. This is an upstream timestamp from the underlying information source - e.g. Ubuntu security tracker. */
  var sourceUpdateTime: js.UndefOr[String] = js.native
}
object Detail {
  
  @scala.inline
  def apply(): Detail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detail]
  }
  
  @scala.inline
  implicit class DetailOps[Self <: Detail] (val x: Self) extends AnyVal {
    
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
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    
    @scala.inline
    def setCpeUri(value: String): Self = this.set("cpeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpeUri: Self = this.set("cpeUri", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFixedLocation(value: VulnerabilityLocation): Self = this.set("fixedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedLocation: Self = this.set("fixedLocation", js.undefined)
    
    @scala.inline
    def setIsObsolete(value: Boolean): Self = this.set("isObsolete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsObsolete: Self = this.set("isObsolete", js.undefined)
    
    @scala.inline
    def setMaxAffectedVersion(value: Version): Self = this.set("maxAffectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAffectedVersion: Self = this.set("maxAffectedVersion", js.undefined)
    
    @scala.inline
    def setMinAffectedVersion(value: Version): Self = this.set("minAffectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAffectedVersion: Self = this.set("minAffectedVersion", js.undefined)
    
    @scala.inline
    def setPackageType(value: String): Self = this.set("packageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageType: Self = this.set("packageType", js.undefined)
    
    @scala.inline
    def setSeverityName(value: String): Self = this.set("severityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverityName: Self = this.set("severityName", js.undefined)
    
    @scala.inline
    def setSourceUpdateTime(value: String): Self = this.set("sourceUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUpdateTime: Self = this.set("sourceUpdateTime", js.undefined)
  }
}
