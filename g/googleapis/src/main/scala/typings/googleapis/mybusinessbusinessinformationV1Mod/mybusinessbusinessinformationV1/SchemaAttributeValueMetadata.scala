package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttributeValueMetadata extends StObject {
  
  /**
    * The display name for this value, localized where available; otherwise, in English. The value display name is intended to be used in context with the attribute display name. For example, for a "WiFi" enum attribute, this could contain "Paid" to represent paid Wi-Fi.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The attribute value.
    */
  var value: js.UndefOr[Any | Null] = js.undefined
}
object SchemaAttributeValueMetadata {
  
  inline def apply(): SchemaAttributeValueMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributeValueMetadata]
  }
  
  extension [Self <: SchemaAttributeValueMetadata](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
