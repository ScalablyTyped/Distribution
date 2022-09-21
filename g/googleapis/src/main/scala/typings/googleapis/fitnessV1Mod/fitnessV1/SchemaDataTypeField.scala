package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataTypeField extends StObject {
  
  /**
    * The different supported formats for each field in a data type.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines the name and format of data. Unlike data type names, field names are not namespaced, and only need to be unique within the data type.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var optional: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaDataTypeField {
  
  inline def apply(): SchemaDataTypeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTypeField]
  }
  
  extension [Self <: SchemaDataTypeField](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
