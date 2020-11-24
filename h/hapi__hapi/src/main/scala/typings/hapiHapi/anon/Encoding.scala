package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiStrings.base64
import typings.hapiHapi.hapiHapiStrings.base64json
import typings.hapiHapi.hapiHapiStrings.form
import typings.hapiHapi.hapiHapiStrings.iron
import typings.hapiHapi.hapiHapiStrings.none_
import typings.hapiHapi.mod.SameSitePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoding extends js.Object {
  
  var encoding: js.UndefOr[none_ | base64 | base64json | form | iron] = js.native
  
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  
  var isHttpOnly: js.UndefOr[Boolean] = js.native
  
  var isSameSite: js.UndefOr[SameSitePolicy] = js.native
  
  var isSecure: js.UndefOr[Boolean] = js.native
  
  var strictHeader: js.UndefOr[Boolean] = js.native
}
object Encoding {
  
  @scala.inline
  def apply(): Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encoding]
  }
  
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
    
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
    def setEncoding(value: none_ | base64 | base64json | form | iron): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    
    @scala.inline
    def setIsHttpOnly(value: Boolean): Self = this.set("isHttpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHttpOnly: Self = this.set("isHttpOnly", js.undefined)
    
    @scala.inline
    def setIsSameSite(value: SameSitePolicy): Self = this.set("isSameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSameSite: Self = this.set("isSameSite", js.undefined)
    
    @scala.inline
    def setIsSecure(value: Boolean): Self = this.set("isSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSecure: Self = this.set("isSecure", js.undefined)
    
    @scala.inline
    def setStrictHeader(value: Boolean): Self = this.set("strictHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictHeader: Self = this.set("strictHeader", js.undefined)
  }
}
