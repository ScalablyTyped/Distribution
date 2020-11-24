package typings.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundleOptions extends js.Object {
  
  var intro: js.UndefOr[String] = js.native
  
  var separator: js.UndefOr[String] = js.native
}
object BundleOptions {
  
  @scala.inline
  def apply(): BundleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleOptions]
  }
  
  @scala.inline
  implicit class BundleOptionsOps[Self <: BundleOptions] (val x: Self) extends AnyVal {
    
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
    def setIntro(value: String): Self = this.set("intro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntro: Self = this.set("intro", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
