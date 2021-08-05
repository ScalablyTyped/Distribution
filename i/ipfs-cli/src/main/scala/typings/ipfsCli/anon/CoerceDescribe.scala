package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoerceDescribe extends StObject {
  
  def coerce(value: js.Any): Double
  
  var describe: String
  
  var `type`: String
}
object CoerceDescribe {
  
  inline def apply(coerce: js.Any => Double, describe: String, `type`: String): CoerceDescribe = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoerceDescribe]
  }
  
  extension [Self <: CoerceDescribe](x: Self) {
    
    inline def setCoerce(value: js.Any => Double): Self = StObject.set(x, "coerce", js.Any.fromFunction1(value))
    
    inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
