package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSchemaRequest extends StObject {
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.native
  
  /** The new schema for the source. */
  var schema: js.UndefOr[Schema] = js.native
  
  /** If true, the schema will be checked for validity, but will not be registered with the data source, even if valid. */
  var validateOnly: js.UndefOr[Boolean] = js.native
}
object UpdateSchemaRequest {
  
  @scala.inline
  def apply(): UpdateSchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSchemaRequest]
  }
  
  @scala.inline
  implicit class UpdateSchemaRequestMutableBuilder[Self <: UpdateSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
    
    @scala.inline
    def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
