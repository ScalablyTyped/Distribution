package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonicEnvironmentFlags extends StObject {
  
  val confirm: Boolean = js.native
  
  val interactive: Boolean = js.native
}
object IonicEnvironmentFlags {
  
  @scala.inline
  def apply(confirm: Boolean, interactive: Boolean): IonicEnvironmentFlags = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicEnvironmentFlags]
  }
  
  @scala.inline
  implicit class IonicEnvironmentFlagsMutableBuilder[Self <: IonicEnvironmentFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
  }
}
