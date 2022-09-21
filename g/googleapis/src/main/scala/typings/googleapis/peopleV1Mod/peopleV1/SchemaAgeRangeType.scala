package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAgeRangeType extends StObject {
  
  /**
    * The age range.
    */
  var ageRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the age range.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
}
object SchemaAgeRangeType {
  
  inline def apply(): SchemaAgeRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAgeRangeType]
  }
  
  extension [Self <: SchemaAgeRangeType](x: Self) {
    
    inline def setAgeRange(value: String): Self = StObject.set(x, "ageRange", value.asInstanceOf[js.Any])
    
    inline def setAgeRangeNull: Self = StObject.set(x, "ageRange", null)
    
    inline def setAgeRangeUndefined: Self = StObject.set(x, "ageRange", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
