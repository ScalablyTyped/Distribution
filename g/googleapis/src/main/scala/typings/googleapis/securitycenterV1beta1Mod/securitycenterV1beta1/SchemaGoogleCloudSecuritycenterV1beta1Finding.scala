package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1beta1Finding extends StObject {
  
  /**
    * The additional taxonomy group within findings from a given source. This field is immutable after creation time. Example: "XSS_FLASH_INJECTION"
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the finding was created in Security Command Center.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the event took place, or when an update to the finding occurred. For example, if the finding represents an open firewall it would capture the time the detector believes the firewall became open. The accuracy is determined by the detector. If the finding were to be resolved afterward, this time would reflect when the finding was resolved.
    */
  var eventTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI that, if available, points to a web page outside of Security Command Center where additional information about the finding can be found. This field is guaranteed to be either empty or a well formed URL.
    */
  var externalUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The relative resource name of this finding. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: "organizations/{organization_id\}/sources/{source_id\}/findings/{finding_id\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The relative resource name of the source the finding belongs to. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is immutable after creation time. For example: "organizations/{organization_id\}/sources/{source_id\}"
    */
  var parent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For findings on Google Cloud resources, the full resource name of the Google Cloud resource this finding is for. See: https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for a non-Google Cloud resource, the resourceName can be a customer or partner defined string. This field is immutable after creation time.
    */
  var resourceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. User specified security marks. These marks are entirely managed by the user and come from the SecurityMarks resource that belongs to the finding.
    */
  var securityMarks: js.UndefOr[SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks] = js.undefined
  
  /**
    * Source specific properties. These properties are managed by the source that writes the finding. The key names in the source_properties map must be between 1 and 255 characters, and must start with a letter and contain alphanumeric characters or underscores only.
    */
  var sourceProperties: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The state of the finding.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1beta1Finding {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1beta1Finding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1beta1Finding]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1beta1Finding](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeNull: Self = StObject.set(x, "eventTime", null)
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setExternalUri(value: String): Self = StObject.set(x, "externalUri", value.asInstanceOf[js.Any])
    
    inline def setExternalUriNull: Self = StObject.set(x, "externalUri", null)
    
    inline def setExternalUriUndefined: Self = StObject.set(x, "externalUri", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameNull: Self = StObject.set(x, "resourceName", null)
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setSecurityMarks(value: SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks): Self = StObject.set(x, "securityMarks", value.asInstanceOf[js.Any])
    
    inline def setSecurityMarksUndefined: Self = StObject.set(x, "securityMarks", js.undefined)
    
    inline def setSourceProperties(value: StringDictionary[Any]): Self = StObject.set(x, "sourceProperties", value.asInstanceOf[js.Any])
    
    inline def setSourcePropertiesNull: Self = StObject.set(x, "sourceProperties", null)
    
    inline def setSourcePropertiesUndefined: Self = StObject.set(x, "sourceProperties", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
