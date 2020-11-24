package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSchemaRequest extends js.Object {
  
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
  implicit class UpdateSchemaRequestOps[Self <: UpdateSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebugOptions(value: DebugOptions): Self = this.set("debugOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugOptions: Self = this.set("debugOptions", js.undefined)
    
    @scala.inline
    def setSchema(value: Schema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setValidateOnly(value: Boolean): Self = this.set("validateOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateOnly: Self = this.set("validateOnly", js.undefined)
  }
}
