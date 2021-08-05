package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In case of multi-dimensional data (such as an accelerometer with x, y, and
  * z axes) each field represents one dimension. Each data type field has a
  * unique name which identifies it. The field also defines the format of the
  * data (int, float, etc.).  This message is only instantiated in code and not
  * used for wire comms or stored in any way.
  */
trait SchemaDataTypeField extends StObject {
  
  /**
    * The different supported formats for each field in a data type.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the name and format of data. Unlike data type names, field names
    * are not namespaced, and only need to be unique within the data type.
    */
  var name: js.UndefOr[String] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
}
object SchemaDataTypeField {
  
  inline def apply(): SchemaDataTypeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataTypeField]
  }
  
  extension [Self <: SchemaDataTypeField](x: Self) {
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
