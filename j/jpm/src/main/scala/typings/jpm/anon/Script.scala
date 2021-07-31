package typings.jpm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Script extends StObject {
  
  var script: Boolean
}
object Script {
  
  @scala.inline
  def apply(script: Boolean): Script = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Script]
  }
  
  @scala.inline
  implicit class ScriptMutableBuilder[Self <: Script] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScript(value: Boolean): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
  }
}
