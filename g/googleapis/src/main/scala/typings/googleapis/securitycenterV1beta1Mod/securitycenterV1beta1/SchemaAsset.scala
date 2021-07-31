package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Security Command Center&#39;s (Cloud SCC) representation of a Google
  * Cloud Platform (GCP) resource.  The Asset is a Cloud SCC resource that
  * captures information about a single GCP resource. All modifications to an
  * Asset are only within the context of Cloud SCC and don&#39;t affect the
  * referenced GCP resource.
  */
trait SchemaAsset extends StObject {
  
  /**
    * The time at which the asset was created in Cloud SCC.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The relative resource name of this asset. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/assets/456&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Resource managed properties. These properties are managed and defined by
    * the GCP resource and cannot be modified by the user.
    */
  var resourceProperties: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Cloud SCC managed properties. These properties are managed by Cloud SCC
    * and cannot be modified by the user.
    */
  var securityCenterProperties: js.UndefOr[SchemaSecurityCenterProperties] = js.undefined
  
  /**
    * User specified security marks. These marks are entirely managed by the
    * user and come from the SecurityMarks resource that belongs to the asset.
    */
  var securityMarks: js.UndefOr[SchemaSecurityMarks] = js.undefined
  
  /**
    * The time at which the asset was last updated, added, or deleted in Cloud
    * SCC.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaAsset {
  
  @scala.inline
  def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  
  @scala.inline
  implicit class SchemaAssetMutableBuilder[Self <: SchemaAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceProperties(value: StringDictionary[js.Any]): Self = StObject.set(x, "resourceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcePropertiesUndefined: Self = StObject.set(x, "resourceProperties", js.undefined)
    
    @scala.inline
    def setSecurityCenterProperties(value: SchemaSecurityCenterProperties): Self = StObject.set(x, "securityCenterProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityCenterPropertiesUndefined: Self = StObject.set(x, "securityCenterProperties", js.undefined)
    
    @scala.inline
    def setSecurityMarks(value: SchemaSecurityMarks): Self = StObject.set(x, "securityMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityMarksUndefined: Self = StObject.set(x, "securityMarks", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
