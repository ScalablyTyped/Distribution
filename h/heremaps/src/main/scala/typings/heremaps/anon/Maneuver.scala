package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maneuver extends StObject {
  
  var maneuver: js.Array[Id]
}
object Maneuver {
  
  inline def apply(maneuver: js.Array[Id]): Maneuver = {
    val __obj = js.Dynamic.literal(maneuver = maneuver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maneuver]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maneuver] (val x: Self) extends AnyVal {
    
    inline def setManeuver(value: js.Array[Id]): Self = StObject.set(x, "maneuver", value.asInstanceOf[js.Any])
    
    inline def setManeuverVarargs(value: Id*): Self = StObject.set(x, "maneuver", js.Array(value*))
  }
}
