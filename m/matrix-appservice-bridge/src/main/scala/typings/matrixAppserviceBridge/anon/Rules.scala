package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rules extends StObject {
  
  var rules: typings.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.Rules
}
object Rules {
  
  inline def apply(rules: typings.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.Rules): Rules = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
    
    inline def setRules(value: typings.matrixAppserviceBridge.libComponentsRoomLinkValidatorMod.Rules): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
