package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPhoneNumber extends StObject {
  
  /**
    * Output only. The canonicalized [ITU-T E.164](https://law.resource.org/pub/us/cfr/ibr/004/itu-t.E.164.1.2008.pdf) form of the phone number.
    */
  var canonicalForm: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of the phone number translated and formatted in the viewer's account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the phone number.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The type of the phone number. The type can be custom or one of these predefined values: * `home` * `work` * `mobile` * `homeFax` * `workFax` * `otherFax` * `pager` * `workMobile` * `workPager` * `main` * `googleVoice` * `other`
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The phone number.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaPhoneNumber {
  
  inline def apply(): SchemaPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPhoneNumber]
  }
  
  extension [Self <: SchemaPhoneNumber](x: Self) {
    
    inline def setCanonicalForm(value: String): Self = StObject.set(x, "canonicalForm", value.asInstanceOf[js.Any])
    
    inline def setCanonicalFormNull: Self = StObject.set(x, "canonicalForm", null)
    
    inline def setCanonicalFormUndefined: Self = StObject.set(x, "canonicalForm", js.undefined)
    
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
