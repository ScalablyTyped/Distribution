package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamPolicyAnalysisResult extends StObject {
  
  /** The access control lists derived from the iam_binding that match or potentially match resource and access selectors specified in the request. */
  var accessControlLists: js.UndefOr[js.Array[GoogleCloudAssetV1AccessControlList]] = js.undefined
  
  /** The [full resource name](https://cloud.google.com/asset-inventory/docs/resource-name-format) of the resource to which the iam_binding policy attaches. */
  var attachedResourceFullName: js.UndefOr[String] = js.undefined
  
  /** Represents whether all analyses on the iam_binding have successfully finished. */
  var fullyExplored: js.UndefOr[Boolean] = js.undefined
  
  /** The Cloud IAM policy binding under analysis. */
  var iamBinding: js.UndefOr[Binding] = js.undefined
  
  /** The identity list derived from members of the iam_binding that match or potentially match identity selector specified in the request. */
  var identityList: js.UndefOr[GoogleCloudAssetV1IdentityList] = js.undefined
}
object IamPolicyAnalysisResult {
  
  inline def apply(): IamPolicyAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicyAnalysisResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IamPolicyAnalysisResult] (val x: Self) extends AnyVal {
    
    inline def setAccessControlLists(value: js.Array[GoogleCloudAssetV1AccessControlList]): Self = StObject.set(x, "accessControlLists", value.asInstanceOf[js.Any])
    
    inline def setAccessControlListsUndefined: Self = StObject.set(x, "accessControlLists", js.undefined)
    
    inline def setAccessControlListsVarargs(value: GoogleCloudAssetV1AccessControlList*): Self = StObject.set(x, "accessControlLists", js.Array(value*))
    
    inline def setAttachedResourceFullName(value: String): Self = StObject.set(x, "attachedResourceFullName", value.asInstanceOf[js.Any])
    
    inline def setAttachedResourceFullNameUndefined: Self = StObject.set(x, "attachedResourceFullName", js.undefined)
    
    inline def setFullyExplored(value: Boolean): Self = StObject.set(x, "fullyExplored", value.asInstanceOf[js.Any])
    
    inline def setFullyExploredUndefined: Self = StObject.set(x, "fullyExplored", js.undefined)
    
    inline def setIamBinding(value: Binding): Self = StObject.set(x, "iamBinding", value.asInstanceOf[js.Any])
    
    inline def setIamBindingUndefined: Self = StObject.set(x, "iamBinding", js.undefined)
    
    inline def setIdentityList(value: GoogleCloudAssetV1IdentityList): Self = StObject.set(x, "identityList", value.asInstanceOf[js.Any])
    
    inline def setIdentityListUndefined: Self = StObject.set(x, "identityList", js.undefined)
  }
}
