package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpdateSchemaRequest extends StObject {
  
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[SchemaDebugOptions] = js.undefined
  
  /**
    * The new schema for the source.
    */
  var schema: js.UndefOr[SchemaSchema] = js.undefined
  
  /**
    * If true, the schema will be checked for validity, but will not be registered with the data source, even if valid.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaUpdateSchemaRequest {
  
  inline def apply(): SchemaUpdateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateSchemaRequest]
  }
  
  extension [Self <: SchemaUpdateSchemaRequest](x: Self) {
    
    inline def setDebugOptions(value: SchemaDebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setSchema(value: SchemaSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
