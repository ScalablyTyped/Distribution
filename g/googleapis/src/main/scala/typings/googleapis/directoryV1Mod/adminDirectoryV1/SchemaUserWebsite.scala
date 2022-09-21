package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserWebsite extends StObject {
  
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If this is user's primary website or not.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Each entry can have a type which indicates standard types of that entry. For example website could be of home work blog etc. In addition to the standard type an entry can have a custom type and can give it any name. Such types should have the CUSTOM value as type and also have a customType value.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Website.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserWebsite {
  
  inline def apply(): SchemaUserWebsite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserWebsite]
  }
  
  extension [Self <: SchemaUserWebsite](x: Self) {
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeNull: Self = StObject.set(x, "customType", null)
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
