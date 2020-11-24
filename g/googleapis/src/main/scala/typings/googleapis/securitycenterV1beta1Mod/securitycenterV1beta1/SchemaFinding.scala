package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Security Command Center (Cloud SCC) finding.  A finding is a record
  * of assessment data (security, risk, health or privacy) ingested into Cloud
  * SCC for presentation, notification, analysis, policy testing, and
  * enforcement. For example, an XSS vulnerability in an App Engine application
  * is a finding.
  */
@js.native
trait SchemaFinding extends js.Object {
  
  /**
    * The additional taxonomy group within findings from a given source. This
    * field is immutable after creation time. Example:
    * &quot;XSS_FLASH_INJECTION&quot;
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * The time at which the finding was created in Cloud SCC.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The time at which the event took place. For example, if the finding
    * represents an open firewall it would capture the time the open firewall
    * was detected.
    */
  var eventTime: js.UndefOr[String] = js.native
  
  /**
    * The URI that, if available, points to a web page outside of Cloud SCC
    * where additional information about the finding can be found. This field
    * is guaranteed to be either empty or a well formed URL.
    */
  var externalUri: js.UndefOr[String] = js.native
  
  /**
    * The relative resource name of this finding. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/sources/456/findings/789&quot;
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The relative resource name of the source the finding belongs to. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * This field is immutable after creation time. For example:
    * &quot;organizations/123/sources/456&quot;
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The full resource name of the Google Cloud Platform (GCP) resource this
    * finding is for. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    * This field is immutable after creation time.
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /**
    * Output only. User specified security marks. These marks are entirely
    * managed by the user and come from the SecurityMarks resource that belongs
    * to the finding.
    */
  var securityMarks: js.UndefOr[SchemaSecurityMarks] = js.native
  
  /**
    * Source specific properties. These properties are managed by the source
    * that writes the finding. The key names in the source_properties map must
    * be between 1 and 255 characters, and must start with a letter and contain
    * alphanumeric characters or underscores only.
    */
  var sourceProperties: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * The state of the finding.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaFinding {
  
  @scala.inline
  def apply(): SchemaFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFinding]
  }
  
  @scala.inline
  implicit class SchemaFindingOps[Self <: SchemaFinding] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEventTime(value: String): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("eventTime", js.undefined)
    
    @scala.inline
    def setExternalUri(value: String): Self = this.set("externalUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalUri: Self = this.set("externalUri", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setSecurityMarks(value: SchemaSecurityMarks): Self = this.set("securityMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityMarks: Self = this.set("securityMarks", js.undefined)
    
    @scala.inline
    def setSourceProperties(value: StringDictionary[js.Any]): Self = this.set("sourceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceProperties: Self = this.set("sourceProperties", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
