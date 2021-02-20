package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssetV1Resource extends StObject {
  
  /** The analysis state of this resource. */
  var analysisState: js.UndefOr[IamPolicyAnalysisState] = js.native
  
  /** The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format) */
  var fullResourceName: js.UndefOr[String] = js.native
}
object GoogleCloudAssetV1Resource {
  
  @scala.inline
  def apply(): GoogleCloudAssetV1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1Resource]
  }
  
  @scala.inline
  implicit class GoogleCloudAssetV1ResourceMutableBuilder[Self <: GoogleCloudAssetV1Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisState(value: IamPolicyAnalysisState): Self = StObject.set(x, "analysisState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisStateUndefined: Self = StObject.set(x, "analysisState", js.undefined)
    
    @scala.inline
    def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
