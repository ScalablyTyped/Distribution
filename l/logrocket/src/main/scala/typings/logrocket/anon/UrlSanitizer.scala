package typings.logrocket.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlSanitizer extends js.Object {
  
  var urlSanitizer: js.UndefOr[js.Function1[/* url */ String, Null | String]] = js.native
}
object UrlSanitizer {
  
  @scala.inline
  def apply(): UrlSanitizer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlSanitizer]
  }
  
  @scala.inline
  implicit class UrlSanitizerOps[Self <: UrlSanitizer] (val x: Self) extends AnyVal {
    
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
    def setUrlSanitizer(value: /* url */ String => Null | String): Self = this.set("urlSanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUrlSanitizer: Self = this.set("urlSanitizer", js.undefined)
  }
}
