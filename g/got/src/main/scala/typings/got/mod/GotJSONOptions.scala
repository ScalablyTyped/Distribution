package typings.got.mod

import typings.got.gotBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GotJSONOptions extends GotOptions[String | Null] {
  
  // Body must be an object or array. See https://github.com/sindresorhus/got/issues/511
  var body: js.UndefOr[js.Object] = js.native
  
  var form: js.UndefOr[Boolean] = js.native
  
  var hooks: js.UndefOr[Hooks[GotJSONOptions, js.Object]] = js.native
  
  var json: `true` = js.native
}
object GotJSONOptions {
  
  @scala.inline
  def apply(json: `true`): GotJSONOptions = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotJSONOptions]
  }
  
  @scala.inline
  implicit class GotJSONOptionsOps[Self <: GotJSONOptions] (val x: Self) extends AnyVal {
    
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
    def setJson(value: `true`): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: js.Object): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setForm(value: Boolean): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    
    @scala.inline
    def setHooks(value: Hooks[GotJSONOptions, js.Object]): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
  }
}
