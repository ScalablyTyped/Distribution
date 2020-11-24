package typings.loginWithAmazonSdkBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Essential extends js.Object {
  
  var essential: Boolean = js.native
}
object Essential {
  
  @scala.inline
  def apply(essential: Boolean): Essential = {
    val __obj = js.Dynamic.literal(essential = essential.asInstanceOf[js.Any])
    __obj.asInstanceOf[Essential]
  }
  
  @scala.inline
  implicit class EssentialOps[Self <: Essential] (val x: Self) extends AnyVal {
    
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
    def setEssential(value: Boolean): Self = this.set("essential", value.asInstanceOf[js.Any])
  }
}
