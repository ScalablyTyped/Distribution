package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAssetAssociation extends StObject {
  
  /**
    * The associated asset.
    */
  var asset: js.UndefOr[SchemaAsset] = js.undefined
  
  /**
    * The role of this asset for the creative.
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaAssetAssociation {
  
  inline def apply(): SchemaAssetAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssetAssociation]
  }
  
  extension [Self <: SchemaAssetAssociation](x: Self) {
    
    inline def setAsset(value: SchemaAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
