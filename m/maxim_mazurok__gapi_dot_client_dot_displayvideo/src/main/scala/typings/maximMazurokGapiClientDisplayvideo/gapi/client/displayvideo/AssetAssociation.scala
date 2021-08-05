package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetAssociation extends StObject {
  
  /** The associated asset. */
  var asset: js.UndefOr[Asset] = js.undefined
  
  /** The role of this asset for the creative. */
  var role: js.UndefOr[String] = js.undefined
}
object AssetAssociation {
  
  inline def apply(): AssetAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetAssociation]
  }
  
  extension [Self <: AssetAssociation](x: Self) {
    
    inline def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
