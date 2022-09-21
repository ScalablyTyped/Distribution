package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParserConfig extends StObject {
  
  /**
    * Determines whether messages with no header are allowed.
    */
  var allowNullHeader: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Schemas used to parse messages in this store, if schematized parsing is desired.
    */
  var schema: js.UndefOr[SchemaSchemaPackage] = js.undefined
  
  /**
    * Byte(s) to use as the segment terminator. If this is unset, '\r' is used as segment terminator, matching the HL7 version 2 specification.
    */
  var segmentTerminator: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Determines the version of both the default parser to be used when `schema` is not given, as well as the schematized parser used when `schema` is specified. This field is immutable after HL7v2 store creation.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaParserConfig {
  
  inline def apply(): SchemaParserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParserConfig]
  }
  
  extension [Self <: SchemaParserConfig](x: Self) {
    
    inline def setAllowNullHeader(value: Boolean): Self = StObject.set(x, "allowNullHeader", value.asInstanceOf[js.Any])
    
    inline def setAllowNullHeaderNull: Self = StObject.set(x, "allowNullHeader", null)
    
    inline def setAllowNullHeaderUndefined: Self = StObject.set(x, "allowNullHeader", js.undefined)
    
    inline def setSchema(value: SchemaSchemaPackage): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSegmentTerminator(value: String): Self = StObject.set(x, "segmentTerminator", value.asInstanceOf[js.Any])
    
    inline def setSegmentTerminatorNull: Self = StObject.set(x, "segmentTerminator", null)
    
    inline def setSegmentTerminatorUndefined: Self = StObject.set(x, "segmentTerminator", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
