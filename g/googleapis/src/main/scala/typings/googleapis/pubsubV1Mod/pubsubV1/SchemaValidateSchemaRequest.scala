package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaValidateSchemaRequest extends StObject {
  
  /**
    * Required. The schema object to validate.
    */
  var schema: js.UndefOr[SchemaSchema] = js.undefined
}
object SchemaValidateSchemaRequest {
  
  inline def apply(): SchemaValidateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValidateSchemaRequest]
  }
  
  extension [Self <: SchemaValidateSchemaRequest](x: Self) {
    
    inline def setSchema(value: SchemaSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
