package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Install extends StObject {
  
  /**
    * Install state. The state "installPending" means that an install request has recently been made and download to the device is in progress. The state "installed" means that the app
    * has been installed. This field is read-only.
    */
  var installState: js.UndefOr[String] = js.undefined
  
  /** The ID of the product that the install is for. For example, "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The version of the installed product. Guaranteed to be set only if the install state is "installed". */
  var versionCode: js.UndefOr[Double] = js.undefined
}
object Install {
  
  inline def apply(): Install = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Install]
  }
  
  extension [Self <: Install](x: Self) {
    
    inline def setInstallState(value: String): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
    
    inline def setInstallStateUndefined: Self = StObject.set(x, "installState", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    inline def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
