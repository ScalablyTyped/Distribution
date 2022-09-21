package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBirthday extends StObject {
  
  /**
    * The structured date of the birthday.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Metadata about the birthday.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * Prefer to use the `date` field if set. A free-form string representing the user's birthday. This value is not validated.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaBirthday {
  
  inline def apply(): SchemaBirthday = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBirthday]
  }
  
  extension [Self <: SchemaBirthday](x: Self) {
    
    inline def setDate(value: SchemaDate): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
