package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEmailAddress extends StObject {
  
  /**
    * The display name of the email.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of the email address translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the email address.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The type of the email address. The type can be custom or one of these predefined values: * `home` * `work` * `other`
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email address.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaEmailAddress {
  
  inline def apply(): SchemaEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmailAddress]
  }
  
  extension [Self <: SchemaEmailAddress](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    inline def setFormattedTypeNull: Self = StObject.set(x, "formattedType", null)
    
    inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
