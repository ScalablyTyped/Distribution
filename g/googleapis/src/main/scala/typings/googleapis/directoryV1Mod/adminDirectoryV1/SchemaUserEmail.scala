package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserEmail extends StObject {
  
  /**
    * Email id of the user.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this is user's primary email. Only one entry could be marked as primary.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Each entry can have a type which indicates standard types of that entry. For example email could be of home, work etc. In addition to the standard type, an entry can have a custom type and can take any value Such types should have the CUSTOM value as type and also have a customType value.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserEmail {
  
  inline def apply(): SchemaUserEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserEmail]
  }
  
  extension [Self <: SchemaUserEmail](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeNull: Self = StObject.set(x, "customType", null)
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
