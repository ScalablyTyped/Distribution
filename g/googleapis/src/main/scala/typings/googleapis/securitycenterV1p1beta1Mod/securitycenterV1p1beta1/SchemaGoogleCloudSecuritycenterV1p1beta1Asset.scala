package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1p1beta1Asset extends StObject {
  
  /**
    * The time at which the asset was created in Security Command Center.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud IAM Policy information associated with the Google Cloud resource described by the Security Command Center asset. This information is managed and defined by the Google Cloud resource and cannot be modified by the user.
    */
  var iamPolicy: js.UndefOr[SchemaGoogleCloudSecuritycenterV1p1beta1IamPolicy] = js.undefined
  
  /**
    * The relative resource name of this asset. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Example: &quot;organizations/{organization_id}/assets/{asset_id}&quot;.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource managed properties. These properties are managed and defined by the Google Cloud resource and cannot be modified by the user.
    */
  var resourceProperties: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Security Command Center managed properties. These properties are managed by Security Command Center and cannot be modified by the user.
    */
  var securityCenterProperties: js.UndefOr[SchemaGoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties] = js.undefined
  
  /**
    * User specified security marks. These marks are entirely managed by the user and come from the SecurityMarks resource that belongs to the asset.
    */
  var securityMarks: js.UndefOr[SchemaGoogleCloudSecuritycenterV1p1beta1SecurityMarks] = js.undefined
  
  /**
    * The time at which the asset was last updated, added, or deleted in Cloud SCC.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1p1beta1Asset {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1p1beta1Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1p1beta1Asset]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1p1beta1Asset](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setIamPolicy(value: SchemaGoogleCloudSecuritycenterV1p1beta1IamPolicy): Self = StObject.set(x, "iamPolicy", value.asInstanceOf[js.Any])
    
    inline def setIamPolicyUndefined: Self = StObject.set(x, "iamPolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceProperties(value: StringDictionary[Any]): Self = StObject.set(x, "resourceProperties", value.asInstanceOf[js.Any])
    
    inline def setResourcePropertiesNull: Self = StObject.set(x, "resourceProperties", null)
    
    inline def setResourcePropertiesUndefined: Self = StObject.set(x, "resourceProperties", js.undefined)
    
    inline def setSecurityCenterProperties(value: SchemaGoogleCloudSecuritycenterV1p1beta1SecurityCenterProperties): Self = StObject.set(x, "securityCenterProperties", value.asInstanceOf[js.Any])
    
    inline def setSecurityCenterPropertiesUndefined: Self = StObject.set(x, "securityCenterProperties", js.undefined)
    
    inline def setSecurityMarks(value: SchemaGoogleCloudSecuritycenterV1p1beta1SecurityMarks): Self = StObject.set(x, "securityMarks", value.asInstanceOf[js.Any])
    
    inline def setSecurityMarksUndefined: Self = StObject.set(x, "securityMarks", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
