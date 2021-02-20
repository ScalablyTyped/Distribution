package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromptToInstall extends StObject {
  
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
  implicit class PromptToInstallMutableBuilder[Self <: PromptToInstall] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromptToInstall(value: Boolean): Self = StObject.set(x, "promptToInstall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptToInstallRefusalMsg(value: String): Self = StObject.set(x, "promptToInstallRefusalMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptToInstallRefusalMsgUndefined: Self = StObject.set(x, "promptToInstallRefusalMsg", js.undefined)
    
    @scala.inline
    def setPromptToInstallUndefined: Self = StObject.set(x, "promptToInstall", js.undefined)
  }
}
