package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssetV1p7beta1RelatedAssets extends StObject {
  
  /** The peer resources of the relationship. */
  var assets: js.UndefOr[js.Array[GoogleCloudAssetV1p7beta1RelatedAsset]] = js.undefined
  
  /** The detailed relation attributes. */
  var relationshipAttributes: js.UndefOr[GoogleCloudAssetV1p7beta1RelationshipAttributes] = js.undefined
}
object GoogleCloudAssetV1p7beta1RelatedAssets {
  
  inline def apply(): GoogleCloudAssetV1p7beta1RelatedAssets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssetV1p7beta1RelatedAssets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudAssetV1p7beta1RelatedAssets] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: js.Array[GoogleCloudAssetV1p7beta1RelatedAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: GoogleCloudAssetV1p7beta1RelatedAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setRelationshipAttributes(value: GoogleCloudAssetV1p7beta1RelationshipAttributes): Self = StObject.set(x, "relationshipAttributes", value.asInstanceOf[js.Any])
    
    inline def setRelationshipAttributesUndefined: Self = StObject.set(x, "relationshipAttributes", js.undefined)
  }
}
