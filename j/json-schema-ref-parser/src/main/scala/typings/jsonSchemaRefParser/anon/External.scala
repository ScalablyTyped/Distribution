package typings.jsonSchemaRefParser.anon

import typings.jsonSchemaRefParser.mod.HTTPResolverOptions
import typings.jsonSchemaRefParser.mod.ResolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait External extends js.Object {
  
  /**
    * Determines whether external $ref pointers will be resolved. If this option is disabled, then external `$ref` pointers will simply be ignored.
    */
  var external: js.UndefOr[Boolean] = js.native
  
  var file: js.UndefOr[ResolverOptions | Boolean] = js.native
  
  var http: js.UndefOr[HTTPResolverOptions | Boolean] = js.native
}
object External {
  
  @scala.inline
  def apply(): External = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[External]
  }
  
  @scala.inline
  implicit class ExternalOps[Self <: External] (val x: Self) extends AnyVal {
    
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
    def setExternal(value: Boolean): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
    
    @scala.inline
    def setFile(value: ResolverOptions | Boolean): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    
    @scala.inline
    def setHttp(value: HTTPResolverOptions | Boolean): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
  }
}
