package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSchemaRequest extends StObject {
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.undefined
  
  /** The new schema for the source. */
  var schema: js.UndefOr[Schema] = js.undefined
  
  /** If true, the schema will be checked for validity, but will not be registered with the data source, even if valid. */
  var validateOnly: js.UndefOr[Boolean] = js.undefined
}
object UpdateSchemaRequest {
  
  inline def apply(): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSchemaRequest] (val x: Self) extends AnyVal {
    
    inline def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
