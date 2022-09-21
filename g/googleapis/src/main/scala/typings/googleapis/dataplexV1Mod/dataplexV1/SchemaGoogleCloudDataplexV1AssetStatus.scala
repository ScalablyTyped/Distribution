package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDataplexV1AssetStatus extends StObject {
  
  /**
    * Number of active assets.
    */
  var activeAssets: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of assets that are in process of updating the security policy on attached resources.
    */
  var securityPolicyApplyingAssets: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Last update time of the status.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDataplexV1AssetStatus {
  
  inline def apply(): SchemaGoogleCloudDataplexV1AssetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDataplexV1AssetStatus]
  }
  
  extension [Self <: SchemaGoogleCloudDataplexV1AssetStatus](x: Self) {
    
    inline def setActiveAssets(value: Double): Self = StObject.set(x, "activeAssets", value.asInstanceOf[js.Any])
    
    inline def setActiveAssetsNull: Self = StObject.set(x, "activeAssets", null)
    
    inline def setActiveAssetsUndefined: Self = StObject.set(x, "activeAssets", js.undefined)
    
    inline def setSecurityPolicyApplyingAssets(value: Double): Self = StObject.set(x, "securityPolicyApplyingAssets", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyApplyingAssetsNull: Self = StObject.set(x, "securityPolicyApplyingAssets", null)
    
    inline def setSecurityPolicyApplyingAssetsUndefined: Self = StObject.set(x, "securityPolicyApplyingAssets", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
