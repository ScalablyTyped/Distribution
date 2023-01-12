package typings.ionic.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptToInstall extends StObject {
  
  var promptToInstall: js.UndefOr[Boolean] = js.undefined
  
  var promptToInstallRefusalMsg: js.UndefOr[String] = js.undefined
}
object PromptToInstall {
  
  inline def apply(): PromptToInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptToInstall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromptToInstall] (val x: Self) extends AnyVal {
    
    inline def setPromptToInstall(value: Boolean): Self = StObject.set(x, "promptToInstall", value.asInstanceOf[js.Any])
    
    inline def setPromptToInstallRefusalMsg(value: String): Self = StObject.set(x, "promptToInstallRefusalMsg", value.asInstanceOf[js.Any])
    
    inline def setPromptToInstallRefusalMsgUndefined: Self = StObject.set(x, "promptToInstallRefusalMsg", js.undefined)
    
    inline def setPromptToInstallUndefined: Self = StObject.set(x, "promptToInstall", js.undefined)
  }
}
