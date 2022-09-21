package typings.intlUnofficialDurationUnitFormat

import typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.custom
import typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.day
import typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.hour
import typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.long
import typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.minute
import typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.narrow
import typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.second
import typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.short
import typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CUSTOM extends StObject {
    
    var CUSTOM: custom
    
    var LONG: long
    
    var NARROW: narrow
    
    var SHORT: short
    
    var TIMER: timer
  }
  object CUSTOM {
    
    inline def apply(): CUSTOM = {
      val __obj = js.Dynamic.literal(CUSTOM = "custom", LONG = "long", NARROW = "narrow", SHORT = "short", TIMER = "timer")
      __obj.asInstanceOf[CUSTOM]
    }
    
    extension [Self <: CUSTOM](x: Self) {
      
      inline def setCUSTOM(value: custom): Self = StObject.set(x, "CUSTOM", value.asInstanceOf[js.Any])
      
      inline def setLONG(value: long): Self = StObject.set(x, "LONG", value.asInstanceOf[js.Any])
      
      inline def setNARROW(value: narrow): Self = StObject.set(x, "NARROW", value.asInstanceOf[js.Any])
      
      inline def setSHORT(value: short): Self = StObject.set(x, "SHORT", value.asInstanceOf[js.Any])
      
      inline def setTIMER(value: timer): Self = StObject.set(x, "TIMER", value.asInstanceOf[js.Any])
    }
  }
  
  trait DAY extends StObject {
    
    var DAY: day
    
    var HOUR: hour
    
    var MINUTE: minute
    
    var SECOND: second
  }
  object DAY {
    
    inline def apply(): DAY = {
      val __obj = js.Dynamic.literal(DAY = "day", HOUR = "hour", MINUTE = "minute", SECOND = "second")
      __obj.asInstanceOf[DAY]
    }
    
    extension [Self <: DAY](x: Self) {
      
      inline def setDAY(value: day): Self = StObject.set(x, "DAY", value.asInstanceOf[js.Any])
      
      inline def setHOUR(value: hour): Self = StObject.set(x, "HOUR", value.asInstanceOf[js.Any])
      
      inline def setMINUTE(value: minute): Self = StObject.set(x, "MINUTE", value.asInstanceOf[js.Any])
      
      inline def setSECOND(value: second): Self = StObject.set(x, "SECOND", value.asInstanceOf[js.Any])
    }
  }
}
