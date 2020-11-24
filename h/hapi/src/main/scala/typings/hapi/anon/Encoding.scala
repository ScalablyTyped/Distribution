package typings.hapi.anon

import typings.hapi.hapiBooleans.`false`
import typings.hapi.hapiStrings.Lax
import typings.hapi.hapiStrings.Strict
import typings.hapi.hapiStrings.base64
import typings.hapi.hapiStrings.base64json
import typings.hapi.hapiStrings.form
import typings.hapi.hapiStrings.iron
import typings.hapi.hapiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encoding extends js.Object {
  
  var encoding: js.UndefOr[none | base64 | base64json | form | iron] = js.native
  
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  
  var isHttpOnly: js.UndefOr[Boolean] = js.native
  
  var isSameSite: js.UndefOr[`false` | Strict | Lax] = js.native
  
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
    def setEncoding(value: none | base64 | base64json | form | iron): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
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
    def setIsSameSite(value: `false` | Strict | Lax): Self = this.set("isSameSite", value.asInstanceOf[js.Any])
    
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
