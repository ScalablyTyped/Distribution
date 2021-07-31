package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Security Command Center (Cloud SCC) finding.  A finding is a record
  * of assessment data (security, risk, health or privacy) ingested into Cloud
  * SCC for presentation, notification, analysis, policy testing, and
  * enforcement. For example, an XSS vulnerability in an App Engine application
  * is a finding.
  */
trait SchemaFinding extends StObject {
  
  /**
    * The additional taxonomy group within findings from a given source. This
    * field is immutable after creation time. Example:
    * &quot;XSS_FLASH_INJECTION&quot;
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the finding was created in Cloud SCC.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the event took place. For example, if the finding
    * represents an open firewall it would capture the time the open firewall
    * was detected.
    */
  var eventTime: js.UndefOr[String] = js.undefined
  
  /**
    * The URI that, if available, points to a web page outside of Cloud SCC
    * where additional information about the finding can be found. This field
    * is guaranteed to be either empty or a well formed URL.
    */
  var externalUri: js.UndefOr[String] = js.undefined
  
  /**
    * The relative resource name of this finding. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/sources/456/findings/789&quot;
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The relative resource name of the source the finding belongs to. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * This field is immutable after creation time. For example:
    * &quot;organizations/123/sources/456&quot;
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The full resource name of the Google Cloud Platform (GCP) resource this
    * finding is for. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    * This field is immutable after creation time.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. User specified security marks. These marks are entirely
    * managed by the user and come from the SecurityMarks resource that belongs
    * to the finding.
    */
  var securityMarks: js.UndefOr[SchemaSecurityMarks] = js.undefined
  
  /**
    * Source specific properties. These properties are managed by the source
    * that writes the finding. The key names in the source_properties map must
    * be between 1 and 255 characters, and must start with a letter and contain
    * alphanumeric characters or underscores only.
    */
  var sourceProperties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The state of the finding.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaFinding {
  
  @scala.inline
  def apply(): SchemaFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFinding]
  }
  
  @scala.inline
  implicit class SchemaFindingMutableBuilder[Self <: SchemaFinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    @scala.inline
    def setExternalUri(value: String): Self = StObject.set(x, "externalUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUriUndefined: Self = StObject.set(x, "externalUri", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setSecurityMarks(value: SchemaSecurityMarks): Self = StObject.set(x, "securityMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityMarksUndefined: Self = StObject.set(x, "securityMarks", js.undefined)
    
    @scala.inline
    def setSourceProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "sourceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePropertiesUndefined: Self = StObject.set(x, "sourceProperties", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
