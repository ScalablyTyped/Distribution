package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedResource extends StObject {
  
  /** The type of the asset. Example: `compute.googleapis.com/Instance` */
  var assetType: js.UndefOr[String] = js.undefined
  
  /** The full resource name of the related resource. Example: `//compute.googleapis.com/projects/my_proj_123/zones/instance/instance123` */
  var fullResourceName: js.UndefOr[String] = js.undefined
}
object RelatedResource {
  
  inline def apply(): RelatedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelatedResource] (val x: Self) extends AnyVal {
    
    inline def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAssetTypeUndefined: Self = StObject.set(x, "assetType", js.undefined)
    
    inline def setFullResourceName(value: String): Self = StObject.set(x, "fullResourceName", value.asInstanceOf[js.Any])
    
    inline def setFullResourceNameUndefined: Self = StObject.set(x, "fullResourceName", js.undefined)
  }
}
