package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s birthday. At least one of the `date` and `text` fields are
  * specified. The `date` and `text` fields typically represent the same date,
  * but are not guaranteed to.
  */
trait SchemaBirthday extends StObject {
  
  /**
    * The date of the birthday.
    */
  var date: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Metadata about the birthday.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * A free-form string representing the user&#39;s birthday.
    */
  var text: js.UndefOr[String] = js.undefined
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
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
