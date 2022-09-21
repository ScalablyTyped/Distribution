package typings.luxon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.luxonStrings.buddhist
    - typings.luxon.luxonStrings.chinese
    - typings.luxon.luxonStrings.coptic
    - typings.luxon.luxonStrings.ethioaa
    - typings.luxon.luxonStrings.ethiopic
    - typings.luxon.luxonStrings.gregory
    - typings.luxon.luxonStrings.hebrew
    - typings.luxon.luxonStrings.indian
    - typings.luxon.luxonStrings.islamic
    - typings.luxon.luxonStrings.islamicc
    - typings.luxon.luxonStrings.iso8601
    - typings.luxon.luxonStrings.japanese
    - typings.luxon.luxonStrings.persian
    - typings.luxon.luxonStrings.roc
  */
  trait CalendarSystem extends StObject
  
  type DateTimeFormatOptions = typings.std.Intl.DateTimeFormatOptions
  
  type EraLength = StringUnitLength
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.luxonStrings.h11
    - typings.luxon.luxonStrings.h12
    - typings.luxon.luxonStrings.h23
    - typings.luxon.luxonStrings.h24
  */
  trait HourCycle extends StObject
  object HourCycle {
    
    inline def h11: typings.luxon.luxonStrings.h11 = "h11".asInstanceOf[typings.luxon.luxonStrings.h11]
    
    inline def h12: typings.luxon.luxonStrings.h12 = "h12".asInstanceOf[typings.luxon.luxonStrings.h12]
    
    inline def h23: typings.luxon.luxonStrings.h23 = "h23".asInstanceOf[typings.luxon.luxonStrings.h23]
    
    inline def h24: typings.luxon.luxonStrings.h24 = "h24".asInstanceOf[typings.luxon.luxonStrings.h24]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.luxonStrings.numeric
    - typings.luxon.luxonStrings.`2-digit`
  */
  trait NumberUnitLength extends StObject
  object NumberUnitLength {
    
    inline def `2-digit`: typings.luxon.luxonStrings.`2-digit` = "2-digit".asInstanceOf[typings.luxon.luxonStrings.`2-digit`]
    
    inline def numeric: typings.luxon.luxonStrings.numeric = "numeric".asInstanceOf[typings.luxon.luxonStrings.numeric]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.luxonStrings.arab
    - typings.luxon.luxonStrings.arabext
    - typings.luxon.luxonStrings.bali
    - typings.luxon.luxonStrings.beng
    - typings.luxon.luxonStrings.deva
    - typings.luxon.luxonStrings.fullwide
    - typings.luxon.luxonStrings.gujr
    - typings.luxon.luxonStrings.guru
    - typings.luxon.luxonStrings.hanidec
    - typings.luxon.luxonStrings.khmr
    - typings.luxon.luxonStrings.knda
    - typings.luxon.luxonStrings.laoo
    - typings.luxon.luxonStrings.latn
    - typings.luxon.luxonStrings.limb
    - typings.luxon.luxonStrings.mlym
    - typings.luxon.luxonStrings.mong
    - typings.luxon.luxonStrings.mymr
    - typings.luxon.luxonStrings.orya
    - typings.luxon.luxonStrings.tamldec
    - typings.luxon.luxonStrings.telu
    - typings.luxon.luxonStrings.thai
    - typings.luxon.luxonStrings.tibt
  */
  trait NumberingSystem extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.luxonStrings.narrow
    - typings.luxon.luxonStrings.short
    - typings.luxon.luxonStrings.long
  */
  trait StringUnitLength extends StObject
  object StringUnitLength {
    
    inline def long: typings.luxon.luxonStrings.long = "long".asInstanceOf[typings.luxon.luxonStrings.long]
    
    inline def narrow: typings.luxon.luxonStrings.narrow = "narrow".asInstanceOf[typings.luxon.luxonStrings.narrow]
    
    inline def short: typings.luxon.luxonStrings.short = "short".asInstanceOf[typings.luxon.luxonStrings.short]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.luxon.luxonStrings.narrow
    - typings.luxon.luxonStrings.short
    - typings.luxon.luxonStrings.long
    - typings.luxon.luxonStrings.numeric
    - typings.luxon.luxonStrings.`2-digit`
  */
  trait UnitLength extends StObject
  object UnitLength {
    
    inline def `2-digit`: typings.luxon.luxonStrings.`2-digit` = "2-digit".asInstanceOf[typings.luxon.luxonStrings.`2-digit`]
    
    inline def long: typings.luxon.luxonStrings.long = "long".asInstanceOf[typings.luxon.luxonStrings.long]
    
    inline def narrow: typings.luxon.luxonStrings.narrow = "narrow".asInstanceOf[typings.luxon.luxonStrings.narrow]
    
    inline def numeric: typings.luxon.luxonStrings.numeric = "numeric".asInstanceOf[typings.luxon.luxonStrings.numeric]
    
    inline def short: typings.luxon.luxonStrings.short = "short".asInstanceOf[typings.luxon.luxonStrings.short]
  }
  
  trait ZoneOptions extends StObject {
    
    /**
      * @deprecated since 0.2.12. Use keepLocalTime instead
      */
    var keepCalendarTime: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, adjust the underlying time so that the local time stays the same, but in the target zone.
      * You should rarely need this.
      * Defaults to false.
      */
    var keepLocalTime: js.UndefOr[Boolean] = js.undefined
  }
  object ZoneOptions {
    
    inline def apply(): ZoneOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoneOptions]
    }
    
    extension [Self <: ZoneOptions](x: Self) {
      
      inline def setKeepCalendarTime(value: Boolean): Self = StObject.set(x, "keepCalendarTime", value.asInstanceOf[js.Any])
      
      inline def setKeepCalendarTimeUndefined: Self = StObject.set(x, "keepCalendarTime", js.undefined)
      
      inline def setKeepLocalTime(value: Boolean): Self = StObject.set(x, "keepLocalTime", value.asInstanceOf[js.Any])
      
      inline def setKeepLocalTimeUndefined: Self = StObject.set(x, "keepLocalTime", js.undefined)
    }
  }
}
