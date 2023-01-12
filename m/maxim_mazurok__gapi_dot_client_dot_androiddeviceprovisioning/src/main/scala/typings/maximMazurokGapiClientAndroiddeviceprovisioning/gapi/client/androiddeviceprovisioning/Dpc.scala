package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dpc extends StObject {
  
  /** Output only. The title of the DPC app in Google Play. For example, _Google Apps Device Policy_. Useful in an application's user interface. */
  var dpcName: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The API resource name in the format `customers/[CUSTOMER_ID]/dpcs/[DPC_ID]`. Assigned by the server. To maintain a reference to a DPC across customer accounts, persist
    * and match the last path component (`DPC_ID`).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The DPC's Android application ID that looks like a Java package name. Zero-touch enrollment installs the DPC app onto a device using this identifier. */
  var packageName: js.UndefOr[String] = js.undefined
}
object Dpc {
  
  inline def apply(): Dpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dpc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dpc] (val x: Self) extends AnyVal {
    
    inline def setDpcName(value: String): Self = StObject.set(x, "dpcName", value.asInstanceOf[js.Any])
    
    inline def setDpcNameUndefined: Self = StObject.set(x, "dpcName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
