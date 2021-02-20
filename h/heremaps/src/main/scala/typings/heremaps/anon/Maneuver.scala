package typings.heremaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maneuver extends StObject {
  
  var maneuver: js.Array[Id] = js.native
}
object Maneuver {
  
  @scala.inline
  def apply(maneuver: js.Array[Id]): Maneuver = {
    val __obj = js.Dynamic.literal(maneuver = maneuver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maneuver]
  }
  
  @scala.inline
  implicit class ManeuverMutableBuilder[Self <: Maneuver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManeuver(value: js.Array[Id]): Self = StObject.set(x, "maneuver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManeuverVarargs(value: Id*): Self = StObject.set(x, "maneuver", js.Array(value :_*))
  }
}
