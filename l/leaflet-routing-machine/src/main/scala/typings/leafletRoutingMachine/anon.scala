package typings.leafletRoutingMachine

import typings.leafletRoutingMachine.mod.Routing_.Waypoint_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait E extends StObject {
    
    var E: String
    
    var Left: String
    
    var N: String
    
    var NE: String
    
    var NW: String
    
    var Right: String
    
    var S: String
    
    var SE: String
    
    var SW: String
    
    var SharpLeft: String
    
    var SharpRight: String
    
    var SlightLeft: String
    
    var SlightRight: String
    
    var Uturn: String
    
    var W: String
  }
  object E {
    
    inline def apply(
      E: String,
      Left: String,
      N: String,
      NE: String,
      NW: String,
      Right: String,
      S: String,
      SE: String,
      SW: String,
      SharpLeft: String,
      SharpRight: String,
      SlightLeft: String,
      SlightRight: String,
      Uturn: String,
      W: String
    ): E = {
      val __obj = js.Dynamic.literal(E = E.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], N = N.asInstanceOf[js.Any], NE = NE.asInstanceOf[js.Any], NW = NW.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], SE = SE.asInstanceOf[js.Any], SW = SW.asInstanceOf[js.Any], SharpLeft = SharpLeft.asInstanceOf[js.Any], SharpRight = SharpRight.asInstanceOf[js.Any], SlightLeft = SlightLeft.asInstanceOf[js.Any], SlightRight = SlightRight.asInstanceOf[js.Any], Uturn = Uturn.asInstanceOf[js.Any], W = W.asInstanceOf[js.Any])
      __obj.asInstanceOf[E]
    }
    
    extension [Self <: E](x: Self) {
      
      inline def setE(value: String): Self = StObject.set(x, "E", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "Left", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setNE(value: String): Self = StObject.set(x, "NE", value.asInstanceOf[js.Any])
      
      inline def setNW(value: String): Self = StObject.set(x, "NW", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "Right", value.asInstanceOf[js.Any])
      
      inline def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      inline def setSE(value: String): Self = StObject.set(x, "SE", value.asInstanceOf[js.Any])
      
      inline def setSW(value: String): Self = StObject.set(x, "SW", value.asInstanceOf[js.Any])
      
      inline def setSharpLeft(value: String): Self = StObject.set(x, "SharpLeft", value.asInstanceOf[js.Any])
      
      inline def setSharpRight(value: String): Self = StObject.set(x, "SharpRight", value.asInstanceOf[js.Any])
      
      inline def setSlightLeft(value: String): Self = StObject.set(x, "SlightLeft", value.asInstanceOf[js.Any])
      
      inline def setSlightRight(value: String): Self = StObject.set(x, "SlightRight", value.asInstanceOf[js.Any])
      
      inline def setUturn(value: String): Self = StObject.set(x, "Uturn", value.asInstanceOf[js.Any])
      
      inline def setW(value: String): Self = StObject.set(x, "W", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndPlaceholder extends StObject {
    
    var endPlaceholder: String
    
    var startPlaceholder: String
    
    var viaPlaceholder: String
  }
  object EndPlaceholder {
    
    inline def apply(endPlaceholder: String, startPlaceholder: String, viaPlaceholder: String): EndPlaceholder = {
      val __obj = js.Dynamic.literal(endPlaceholder = endPlaceholder.asInstanceOf[js.Any], startPlaceholder = startPlaceholder.asInstanceOf[js.Any], viaPlaceholder = viaPlaceholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndPlaceholder]
    }
    
    extension [Self <: EndPlaceholder](x: Self) {
      
      inline def setEndPlaceholder(value: String): Self = StObject.set(x, "endPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setStartPlaceholder(value: String): Self = StObject.set(x, "startPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setViaPlaceholder(value: String): Self = StObject.set(x, "viaPlaceholder", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hours extends StObject {
    
    var hours: String
    
    var kilometers: String
    
    var meters: String
    
    var miles: String
    
    var minutes: String
    
    var seconds: String
    
    var yards: String
  }
  object Hours {
    
    inline def apply(
      hours: String,
      kilometers: String,
      meters: String,
      miles: String,
      minutes: String,
      seconds: String,
      yards: String
    ): Hours = {
      val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], kilometers = kilometers.asInstanceOf[js.Any], meters = meters.asInstanceOf[js.Any], miles = miles.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], yards = yards.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hours]
    }
    
    extension [Self <: Hours](x: Self) {
      
      inline def setHours(value: String): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setKilometers(value: String): Self = StObject.set(x, "kilometers", value.asInstanceOf[js.Any])
      
      inline def setMeters(value: String): Self = StObject.set(x, "meters", value.asInstanceOf[js.Any])
      
      inline def setMiles(value: String): Self = StObject.set(x, "miles", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: String): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setYards(value: String): Self = StObject.set(x, "yards", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputWaypoints extends StObject {
    
    var inputWaypoints: Waypoint_
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var waypoints: Waypoint_
  }
  object InputWaypoints {
    
    inline def apply(inputWaypoints: Waypoint_, waypoints: Waypoint_): InputWaypoints = {
      val __obj = js.Dynamic.literal(inputWaypoints = inputWaypoints.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputWaypoints]
    }
    
    extension [Self <: InputWaypoints](x: Self) {
      
      inline def setInputWaypoints(value: Waypoint_): Self = StObject.set(x, "inputWaypoints", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setWaypoints(value: Waypoint_): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    }
  }
  
  trait LegCount extends StObject {
    
    var legCount: Double
    
    var legIndex: Double
  }
  object LegCount {
    
    inline def apply(legCount: Double, legIndex: Double): LegCount = {
      val __obj = js.Dynamic.literal(legCount = legCount.asInstanceOf[js.Any], legIndex = legIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegCount]
    }
    
    extension [Self <: LegCount](x: Self) {
      
      inline def setLegCount(value: Double): Self = StObject.set(x, "legCount", value.asInstanceOf[js.Any])
      
      inline def setLegIndex(value: Double): Self = StObject.set(x, "legIndex", value.asInstanceOf[js.Any])
    }
  }
}
