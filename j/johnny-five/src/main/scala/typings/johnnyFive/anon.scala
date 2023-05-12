package typings.johnnyFive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abbr extends StObject {
    
    var abbr: String
    
    var heading: Double
    
    var high: Double
    
    var low: Double
    
    var name: String
  }
  object Abbr {
    
    inline def apply(abbr: String, heading: Double, high: Double, low: Double, name: String): Abbr = {
      val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abbr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Abbr] (val x: Self) extends AnyVal {
      
      inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Blue extends StObject {
    
    var blue: Double
    
    var green: Double
    
    var red: Double
  }
  object Blue {
    
    inline def apply(blue: Double, green: Double, red: Double): Blue = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blue] (val x: Self) extends AnyVal {
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  trait DRIVER extends StObject {
    
    var DRIVER: Double
    
    var FOUR_WIRE: Double
    
    var TWO_WIRE: Double
  }
  object DRIVER {
    
    inline def apply(DRIVER: Double, FOUR_WIRE: Double, TWO_WIRE: Double): DRIVER = {
      val __obj = js.Dynamic.literal(DRIVER = DRIVER.asInstanceOf[js.Any], FOUR_WIRE = FOUR_WIRE.asInstanceOf[js.Any], TWO_WIRE = TWO_WIRE.asInstanceOf[js.Any])
      __obj.asInstanceOf[DRIVER]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DRIVER] (val x: Self) extends AnyVal {
      
      inline def setDRIVER(value: Double): Self = StObject.set(x, "DRIVER", value.asInstanceOf[js.Any])
      
      inline def setFOUR_WIRE(value: Double): Self = StObject.set(x, "FOUR_WIRE", value.asInstanceOf[js.Any])
      
      inline def setTWO_WIRE(value: Double): Self = StObject.set(x, "TWO_WIRE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Debug extends StObject {
    
    val debug: js.UndefOr[Boolean] = js.undefined
    
    val id: String
    
    val io: js.UndefOr[Any] = js.undefined
    
    val port: js.UndefOr[String] = js.undefined
    
    val repl: js.UndefOr[Boolean] = js.undefined
    
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object Debug {
    
    inline def apply(id: String): Debug = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIo(value: Any): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setRepl(value: Boolean): Self = StObject.set(x, "repl", value.asInstanceOf[js.Any])
      
      inline def setReplUndefined: Self = StObject.set(x, "repl", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Pressure extends StObject {
    
    /** Pressure is a string because somehow it's been fixed using {@link Number.toFixed} which returns a string. */
    var pressure: String
  }
  object Pressure {
    
    inline def apply(pressure: String): Pressure = {
      val __obj = js.Dynamic.literal(pressure = pressure.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pressure]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pressure] (val x: Self) extends AnyVal {
      
      inline def setPressure(value: String): Self = StObject.set(x, "pressure", value.asInstanceOf[js.Any])
    }
  }
}
