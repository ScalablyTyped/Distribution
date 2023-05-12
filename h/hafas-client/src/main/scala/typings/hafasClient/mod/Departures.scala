package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Departures
  extends StObject
     with RealtimeDataUpdatedAt {
  
  var departures: js.Array[Alternative]
}
object Departures {
  
  inline def apply(departures: js.Array[Alternative]): Departures = {
    val __obj = js.Dynamic.literal(departures = departures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Departures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Departures] (val x: Self) extends AnyVal {
    
    inline def setDepartures(value: js.Array[Alternative]): Self = StObject.set(x, "departures", value.asInstanceOf[js.Any])
    
    inline def setDeparturesVarargs(value: Alternative*): Self = StObject.set(x, "departures", js.Array(value*))
  }
}
