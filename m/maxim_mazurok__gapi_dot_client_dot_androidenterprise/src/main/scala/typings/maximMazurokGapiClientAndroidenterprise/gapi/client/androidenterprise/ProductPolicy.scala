package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductPolicy extends StObject {
  
  /** The auto-install policy for the product. */
  var autoInstallPolicy: js.UndefOr[AutoInstallPolicy] = js.native
  
  /** The auto-update mode for the product. */
  var autoUpdateMode: js.UndefOr[String] = js.native
  
  /** The managed configuration for the product. */
  var managedConfiguration: js.UndefOr[ManagedConfiguration] = js.native
  
  /** The ID of the product. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.native
  
  /** Grants the device visibility to the specified product release track(s), identified by trackIds. The list of release tracks of a product can be obtained by calling Products.Get. */
  var trackIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Deprecated. Use trackIds instead. */
  var tracks: js.UndefOr[js.Array[String]] = js.native
}
object ProductPolicy {
  
  @scala.inline
  def apply(): ProductPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPolicy]
  }
  
  @scala.inline
  implicit class ProductPolicyMutableBuilder[Self <: ProductPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoInstallPolicy(value: AutoInstallPolicy): Self = StObject.set(x, "autoInstallPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoInstallPolicyUndefined: Self = StObject.set(x, "autoInstallPolicy", js.undefined)
    
    @scala.inline
    def setAutoUpdateMode(value: String): Self = StObject.set(x, "autoUpdateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateModeUndefined: Self = StObject.set(x, "autoUpdateMode", js.undefined)
    
    @scala.inline
    def setManagedConfiguration(value: ManagedConfiguration): Self = StObject.set(x, "managedConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationUndefined: Self = StObject.set(x, "managedConfiguration", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setTrackIds(value: js.Array[String]): Self = StObject.set(x, "trackIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackIdsUndefined: Self = StObject.set(x, "trackIds", js.undefined)
    
    @scala.inline
    def setTrackIdsVarargs(value: String*): Self = StObject.set(x, "trackIds", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[String]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: String*): Self = StObject.set(x, "tracks", js.Array(value :_*))
  }
}
