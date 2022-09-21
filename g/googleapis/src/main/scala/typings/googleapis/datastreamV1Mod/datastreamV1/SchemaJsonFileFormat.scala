package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJsonFileFormat extends StObject {
  
  /**
    * Compression of the loaded JSON file.
    */
  var compression: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The schema file format along JSON data files.
    */
  var schemaFileFormat: js.UndefOr[String | Null] = js.undefined
}
object SchemaJsonFileFormat {
  
  inline def apply(): SchemaJsonFileFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJsonFileFormat]
  }
  
  extension [Self <: SchemaJsonFileFormat](x: Self) {
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionNull: Self = StObject.set(x, "compression", null)
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setSchemaFileFormat(value: String): Self = StObject.set(x, "schemaFileFormat", value.asInstanceOf[js.Any])
    
    inline def setSchemaFileFormatNull: Self = StObject.set(x, "schemaFileFormat", null)
    
    inline def setSchemaFileFormatUndefined: Self = StObject.set(x, "schemaFileFormat", js.undefined)
  }
}
