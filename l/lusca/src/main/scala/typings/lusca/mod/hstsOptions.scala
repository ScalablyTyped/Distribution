package typings.lusca.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hstsOptions extends js.Object {
  
  var includeSubDomains: js.UndefOr[Boolean] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var preload: js.UndefOr[Boolean] = js.native
}
object hstsOptions {
  
  @scala.inline
  def apply(): hstsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hstsOptions]
  }
  
  @scala.inline
  implicit class hstsOptionsOps[Self <: hstsOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeSubDomains(value: Boolean): Self = this.set("includeSubDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeSubDomains: Self = this.set("includeSubDomains", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setPreload(value: Boolean): Self = this.set("preload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreload: Self = this.set("preload", js.undefined)
  }
}
