package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFieldMetadata extends StObject {
  
  /**
    * Output only. True if the field is the primary field for all sources in the person. Each person will have at most one field with `primary` set to true.
    */
  var primary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The source of the field.
    */
  var source: js.UndefOr[SchemaSource] = js.undefined
  
  /**
    * True if the field is the primary field for the source. Each source must have at most one field with `source_primary` set to true.
    */
  var sourcePrimary: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. True if the field is verified; false if the field is unverified. A verified field is typically a name, email address, phone number, or website that has been confirmed to be owned by the person.
    */
  var verified: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaFieldMetadata {
  
  inline def apply(): SchemaFieldMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFieldMetadata]
  }
  
  extension [Self <: SchemaFieldMetadata](x: Self) {
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryNull: Self = StObject.set(x, "primary", null)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSource(value: SchemaSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourcePrimary(value: Boolean): Self = StObject.set(x, "sourcePrimary", value.asInstanceOf[js.Any])
    
    inline def setSourcePrimaryNull: Self = StObject.set(x, "sourcePrimary", null)
    
    inline def setSourcePrimaryUndefined: Self = StObject.set(x, "sourcePrimary", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedNull: Self = StObject.set(x, "verified", null)
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
