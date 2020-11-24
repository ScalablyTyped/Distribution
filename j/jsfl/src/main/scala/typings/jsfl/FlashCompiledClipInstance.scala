package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashCompiledClipInstance extends js.Object {
  
  var accName: String = js.native
  
  var actionScript: String = js.native
  
  var description: String = js.native
  
  var forceSimple: Boolean = js.native
  
  var shortcut: String = js.native
  
  var silent: Boolean = js.native
  
  var tabIndex: Double = js.native
}
object FlashCompiledClipInstance {
  
  @scala.inline
  def apply(
    accName: String,
    actionScript: String,
    description: String,
    forceSimple: Boolean,
    shortcut: String,
    silent: Boolean,
    tabIndex: Double
  ): FlashCompiledClipInstance = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], actionScript = actionScript.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], forceSimple = forceSimple.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashCompiledClipInstance]
  }
  
  @scala.inline
  implicit class FlashCompiledClipInstanceOps[Self <: FlashCompiledClipInstance] (val x: Self) extends AnyVal {
    
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
    def setAccName(value: String): Self = this.set("accName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionScript(value: String): Self = this.set("actionScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSimple(value: Boolean): Self = this.set("forceSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcut(value: String): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
  }
}
