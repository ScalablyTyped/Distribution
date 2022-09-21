package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSchemasGet
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable ID of the Google Workspace account.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Name or immutable ID of the schema.
    */
  var schemaKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceSchemasGet {
  
  inline def apply(): ParamsResourceSchemasGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSchemasGet]
  }
  
  extension [Self <: ParamsResourceSchemasGet](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setSchemaKey(value: String): Self = StObject.set(x, "schemaKey", value.asInstanceOf[js.Any])
    
    inline def setSchemaKeyUndefined: Self = StObject.set(x, "schemaKey", js.undefined)
  }
}
