package typings.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LDAPMessageJsonObject
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var controls: js.Array[Control]
  
  var messageID: Double
  
  var protocolOp: js.UndefOr[String] = js.undefined
}
object LDAPMessageJsonObject {
  
  inline def apply(controls: js.Array[Control], messageID: Double): LDAPMessageJsonObject = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPMessageJsonObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LDAPMessageJsonObject] (val x: Self) extends AnyVal {
    
    inline def setControls(value: js.Array[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsVarargs(value: Control*): Self = StObject.set(x, "controls", js.Array(value*))
    
    inline def setMessageID(value: Double): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
    
    inline def setProtocolOp(value: String): Self = StObject.set(x, "protocolOp", value.asInstanceOf[js.Any])
    
    inline def setProtocolOpUndefined: Self = StObject.set(x, "protocolOp", js.undefined)
  }
}
