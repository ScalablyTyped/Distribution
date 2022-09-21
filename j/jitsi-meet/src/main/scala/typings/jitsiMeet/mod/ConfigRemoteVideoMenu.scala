package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRemoteVideoMenu extends StObject {
  
  var disableKick: js.UndefOr[Boolean] = js.undefined
}
object ConfigRemoteVideoMenu {
  
  inline def apply(): ConfigRemoteVideoMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRemoteVideoMenu]
  }
  
  extension [Self <: ConfigRemoteVideoMenu](x: Self) {
    
    inline def setDisableKick(value: Boolean): Self = StObject.set(x, "disableKick", value.asInstanceOf[js.Any])
    
    inline def setDisableKickUndefined: Self = StObject.set(x, "disableKick", js.undefined)
  }
}
