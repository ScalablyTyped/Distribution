package typings.jsreportScripts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateScript extends js.Object {
  
  var content: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var shortid: js.UndefOr[String] = js.native
}
object TemplateScript {
  
  @scala.inline
  def apply(): TemplateScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateScript]
  }
  
  @scala.inline
  implicit class TemplateScriptOps[Self <: TemplateScript] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setShortid(value: String): Self = this.set("shortid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortid: Self = this.set("shortid", js.undefined)
  }
}
