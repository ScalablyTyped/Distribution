package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1TagFieldEnumValue extends StObject {
  
  /** The display name of the enum value. */
  var displayName: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatacatalogV1TagFieldEnumValue {
  
  inline def apply(): GoogleCloudDatacatalogV1TagFieldEnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1TagFieldEnumValue]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1TagFieldEnumValue](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
