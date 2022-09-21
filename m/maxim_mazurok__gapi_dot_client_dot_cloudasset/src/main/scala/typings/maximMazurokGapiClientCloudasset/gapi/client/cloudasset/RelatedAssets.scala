package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedAssets extends StObject {
  
  /** The peer resources of the relationship. */
  var assets: js.UndefOr[js.Array[RelatedAsset]] = js.undefined
  
  /** The detailed relationship attributes. */
  var relationshipAttributes: js.UndefOr[RelationshipAttributes] = js.undefined
}
object RelatedAssets {
  
  inline def apply(): RelatedAssets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedAssets]
  }
  
  extension [Self <: RelatedAssets](x: Self) {
    
    inline def setAssets(value: js.Array[RelatedAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: RelatedAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setRelationshipAttributes(value: RelationshipAttributes): Self = StObject.set(x, "relationshipAttributes", value.asInstanceOf[js.Any])
    
    inline def setRelationshipAttributesUndefined: Self = StObject.set(x, "relationshipAttributes", js.undefined)
  }
}
