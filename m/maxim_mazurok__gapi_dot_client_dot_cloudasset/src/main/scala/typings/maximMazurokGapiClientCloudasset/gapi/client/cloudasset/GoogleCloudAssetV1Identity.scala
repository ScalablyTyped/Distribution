package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1Identity extends StObject {
  
  /** The analysis state of this identity. */
  var analysisState: js.UndefOr[IamPolicyAnalysisState] = js.undefined
  
  /**
    * The identity name in any form of members appear in [IAM policy binding](https://cloud.google.com/iam/reference/rest/v1/Binding), such as: - user:foo@google.com -
    * group:group1@google.com - serviceAccount:s1@prj1.iam.gserviceaccount.com - projectOwner:some_project_id - domain:google.com - allUsers - etc.
    */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssetV1Identity {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Identity]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1IdentityMutableBuilder[Self <: GoogleCloudAssetV1Identity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisState(value: IamPolicyAnalysisState): Self = StObject.set(x, "analysisState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisStateUndefined: Self = StObject.set(x, "analysisState", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
