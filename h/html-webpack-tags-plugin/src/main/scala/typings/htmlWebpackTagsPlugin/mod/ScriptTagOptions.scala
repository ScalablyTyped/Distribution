package typings.htmlWebpackTagsPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptTagOptions extends BaseTagOptions {
  
  var attributes: js.UndefOr[AttributesObject] = js.native
  
  var external: js.UndefOr[ExternalObject] = js.native
  
  var path: String = js.native
}
object ScriptTagOptions {
  
  @scala.inline
  def apply(path: String): ScriptTagOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptTagOptions]
  }
  
  @scala.inline
  implicit class ScriptTagOptionsOps[Self <: ScriptTagOptions] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: AttributesObject): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setExternal(value: ExternalObject): Self = this.set("external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal: Self = this.set("external", js.undefined)
  }
}
