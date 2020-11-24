package typings.jsonEditor.anon

import typings.jsonEditor.JSONEditorArrayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsJSONEditorArrayOptions extends js.Object {
  
  var options: JSONEditorArrayOptions = js.native
}
object OptionsJSONEditorArrayOptions {
  
  @scala.inline
  def apply(options: JSONEditorArrayOptions): OptionsJSONEditorArrayOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsJSONEditorArrayOptions]
  }
  
  @scala.inline
  implicit class OptionsJSONEditorArrayOptionsOps[Self <: OptionsJSONEditorArrayOptions] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: JSONEditorArrayOptions): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
