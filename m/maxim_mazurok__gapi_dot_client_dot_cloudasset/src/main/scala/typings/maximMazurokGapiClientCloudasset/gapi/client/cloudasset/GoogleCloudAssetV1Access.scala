package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1Access extends StObject {
  
  /** The analysis state of this access. */
  var analysisState: js.UndefOr[IamPolicyAnalysisState] = js.undefined
  
  /** The permission. */
  var permission: js.UndefOr[String] = js.undefined
  
  /** The role. */
  var role: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssetV1Access {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1Access = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Access]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1AccessMutableBuilder[Self <: GoogleCloudAssetV1Access] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisState(value: IamPolicyAnalysisState): Self = StObject.set(x, "analysisState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisStateUndefined: Self = StObject.set(x, "analysisState", js.undefined)
    
    @scala.inline
    def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
