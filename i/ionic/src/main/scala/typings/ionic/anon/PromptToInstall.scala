package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptToInstall extends js.Object {
  
  var promptToInstall: js.UndefOr[Boolean] = js.native
  
  var promptToInstallRefusalMsg: js.UndefOr[String] = js.native
}
object PromptToInstall {
  
  @scala.inline
  def apply(): PromptToInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptToInstall]
  }
  
  @scala.inline
  implicit class PromptToInstallOps[Self <: PromptToInstall] (val x: Self) extends AnyVal {
    
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
    def setPromptToInstall(value: Boolean): Self = this.set("promptToInstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromptToInstall: Self = this.set("promptToInstall", js.undefined)
    
    @scala.inline
    def setPromptToInstallRefusalMsg(value: String): Self = this.set("promptToInstallRefusalMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromptToInstallRefusalMsg: Self = this.set("promptToInstallRefusalMsg", js.undefined)
  }
}
