package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashCompiledClipInstance extends StObject {
  
  var accName: String
  
  var actionScript: String
  
  var description: String
  
  var forceSimple: Boolean
  
  var shortcut: String
  
  var silent: Boolean
  
  var tabIndex: Double
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
  implicit class FlashCompiledClipInstanceMutableBuilder[Self <: FlashCompiledClipInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccName(value: String): Self = StObject.set(x, "accName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionScript(value: String): Self = StObject.set(x, "actionScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSimple(value: Boolean): Self = StObject.set(x, "forceSimple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcut(value: String): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
