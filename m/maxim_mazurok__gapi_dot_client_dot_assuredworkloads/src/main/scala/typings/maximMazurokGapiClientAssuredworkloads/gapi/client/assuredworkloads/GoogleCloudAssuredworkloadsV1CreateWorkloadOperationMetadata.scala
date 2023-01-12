package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata extends StObject {
  
  /** Optional. Compliance controls that should be applied to the resources managed by the workload. */
  var complianceRegime: js.UndefOr[String] = js.undefined
  
  /** Optional. Time when the operation was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. The display name of the workload. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Optional. The parent of the workload. */
  var parent: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata {
  
  inline def apply(): GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudAssuredworkloadsV1CreateWorkloadOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setComplianceRegime(value: String): Self = StObject.set(x, "complianceRegime", value.asInstanceOf[js.Any])
    
    inline def setComplianceRegimeUndefined: Self = StObject.set(x, "complianceRegime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
