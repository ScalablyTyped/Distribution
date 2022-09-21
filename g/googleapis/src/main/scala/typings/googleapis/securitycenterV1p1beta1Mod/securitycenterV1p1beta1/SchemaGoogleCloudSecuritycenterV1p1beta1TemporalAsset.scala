package typings.googleapis.securitycenterV1p1beta1Mod.securitycenterV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1p1beta1TemporalAsset extends StObject {
  
  /**
    * Asset data that includes attributes, properties and marks about the asset.
    */
  var asset: js.UndefOr[SchemaGoogleCloudSecuritycenterV1p1beta1Asset] = js.undefined
  
  /**
    * Represents if the asset was created/updated/deleted.
    */
  var changeType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1p1beta1TemporalAsset {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1p1beta1TemporalAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1p1beta1TemporalAsset]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1p1beta1TemporalAsset](x: Self) {
    
    inline def setAsset(value: SchemaGoogleCloudSecuritycenterV1p1beta1Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeNull: Self = StObject.set(x, "changeType", null)
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
  }
}
