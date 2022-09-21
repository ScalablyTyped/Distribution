package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1TagFieldEnumValue extends StObject {
  
  /**
    * The display name of the enum value.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1TagFieldEnumValue {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1TagFieldEnumValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1TagFieldEnumValue]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1TagFieldEnumValue](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
