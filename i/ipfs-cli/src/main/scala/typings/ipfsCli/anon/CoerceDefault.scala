package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoerceDefault extends StObject {
  
  var default: Boolean
  
  def coerce(value: js.Any): js.Any
  
  var describe: String
  
  var `type`: String
}
object CoerceDefault {
  
  inline def apply(coerce: js.Any => js.Any, default: Boolean, describe: String, `type`: String): CoerceDefault = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), default = default.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoerceDefault]
  }
  
  extension [Self <: CoerceDefault](x: Self) {
    
    inline def setCoerce(value: js.Any => js.Any): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
