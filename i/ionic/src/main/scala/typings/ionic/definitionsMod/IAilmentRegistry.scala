package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAilmentRegistry extends StObject {
  
  var ailments: js.Array[IAilment]
  
  def get(id: String): js.UndefOr[IAilment]
  
  def register(ailment: IAilment): Unit
}
object IAilmentRegistry {
  
  inline def apply(ailments: js.Array[IAilment], get: String => js.UndefOr[IAilment], register: IAilment => Unit): IAilmentRegistry = {
    val __obj = js.Dynamic.literal(ailments = ailments.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[IAilmentRegistry]
  }
  
  extension [Self <: IAilmentRegistry](x: Self) {
    
    inline def setAilments(value: js.Array[IAilment]): Self = StObject.set(x, "ailments", value.asInstanceOf[js.Any])
    
    inline def setAilmentsVarargs(value: IAilment*): Self = StObject.set(x, "ailments", js.Array(value :_*))
    
    inline def setGet(value: String => js.UndefOr[IAilment]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setRegister(value: IAilment => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
  }
}
