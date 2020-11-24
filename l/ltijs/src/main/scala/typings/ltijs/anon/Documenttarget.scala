package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Documenttarget extends js.Object {
  
  var document_target: String = js.native
  
  var locale: String = js.native
  
  var return_url: String = js.native
}
object Documenttarget {
  
  @scala.inline
  def apply(document_target: String, locale: String, return_url: String): Documenttarget = {
    val __obj = js.Dynamic.literal(document_target = document_target.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documenttarget]
  }
  
  @scala.inline
  implicit class DocumenttargetOps[Self <: Documenttarget] (val x: Self) extends AnyVal {
    
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
    def setDocument_target(value: String): Self = this.set("document_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_url(value: String): Self = this.set("return_url", value.asInstanceOf[js.Any])
  }
}
