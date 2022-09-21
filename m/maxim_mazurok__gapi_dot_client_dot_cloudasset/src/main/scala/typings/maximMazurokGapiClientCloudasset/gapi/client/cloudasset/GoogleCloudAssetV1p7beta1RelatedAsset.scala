package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1p7beta1RelatedAsset extends StObject {
  
  /**
    * The ancestors of an asset in Google Cloud [resource hierarchy](https://cloud.google.com/resource-manager/docs/cloud-platform-resource-hierarchy), represented as a list of relative
    * resource names. An ancestry path starts with the closest ancestor in the hierarchy and ends at root. Example: `["projects/123456789", "folders/5432", "organizations/1234"]`
    */
  var ancestors: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The full name of the asset. Example: `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1` See [Resource
    * names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for more information.
    */
  var asset: js.UndefOr[String] = js.undefined
  
  /** The type of the asset. Example: `compute.googleapis.com/Disk` See [Supported asset types](https://cloud.google.com/asset-inventory/docs/supported-asset-types) for more information. */
  var assetType: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssetV1p7beta1RelatedAsset {
  
  inline def apply(): GoogleCloudAssetV1p7beta1RelatedAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1p7beta1RelatedAsset]
  }
  
  extension [Self <: GoogleCloudAssetV1p7beta1RelatedAsset](x: Self) {
    
    inline def setAncestors(value: js.Array[String]): Self = StObject.set(x, "ancestors", value.asInstanceOf[js.Any])
    
    inline def setAncestorsUndefined: Self = StObject.set(x, "ancestors", js.undefined)
    
    inline def setAncestorsVarargs(value: String*): Self = StObject.set(x, "ancestors", js.Array(value*))
    
    inline def setAsset(value: String): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
  }
}
