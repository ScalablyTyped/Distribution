package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductPolicy extends StObject {
  
  /** The auto-install policy for the product. */
  var autoInstallPolicy: js.UndefOr[AutoInstallPolicy] = js.undefined
  
  /** The auto-update mode for the product. */
  var autoUpdateMode: js.UndefOr[String] = js.undefined
  
  /** The managed configuration for the product. */
  var managedConfiguration: js.UndefOr[ManagedConfiguration] = js.undefined
  
  /** The ID of the product. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
  
  /** Grants the device visibility to the specified product release track(s), identified by trackIds. The list of release tracks of a product can be obtained by calling Products.Get. */
  var trackIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Deprecated. Use trackIds instead. */
  var tracks: js.UndefOr[js.Array[String]] = js.undefined
}
object ProductPolicy {
  
  inline def apply(): ProductPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPolicy]
  }
  
  extension [Self <: ProductPolicy](x: Self) {
    
    inline def setAutoInstallPolicy(value: AutoInstallPolicy): Self = StObject.set(x, "autoInstallPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoInstallPolicyUndefined: Self = StObject.set(x, "autoInstallPolicy", js.undefined)
    
    inline def setAutoUpdateMode(value: String): Self = StObject.set(x, "autoUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateModeUndefined: Self = StObject.set(x, "autoUpdateMode", js.undefined)
    
    inline def setManagedConfiguration(value: ManagedConfiguration): Self = StObject.set(x, "managedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationUndefined: Self = StObject.set(x, "managedConfiguration", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    inline def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    inline def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value :_*))
    
    inline def setTracks(value: js.Array[String]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: String*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
