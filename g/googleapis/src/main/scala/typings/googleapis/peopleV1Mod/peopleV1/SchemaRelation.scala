package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelation extends StObject {
  
  /**
    * Output only. The type of the relation translated and formatted in the viewer's account locale or the locale specified in the Accept-Language HTTP header.
    */
  var formattedType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the relation.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The name of the other person this relation refers to.
    */
  var person: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The person's relation to the other person. The type can be custom or one of these predefined values: * `spouse` * `child` * `mother` * `father` * `parent` * `brother` * `sister` * `friend` * `relative` * `domesticPartner` * `manager` * `assistant` * `referredBy` * `partner`
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelation {
  
  inline def apply(): SchemaRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelation]
  }
  
  extension [Self <: SchemaRelation](x: Self) {
    
    inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    inline def setFormattedTypeNull: Self = StObject.set(x, "formattedType", null)
    
    inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonNull: Self = StObject.set(x, "person", null)
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
