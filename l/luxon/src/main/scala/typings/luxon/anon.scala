package typings.luxon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[IncludeConfig /* <: js.UndefOr[Boolean] */] extends StObject {
    
    /**
      * Include configuration attributes in the output
      * @defaultValue false
      */
    var includeConfig: js.UndefOr[IncludeConfig] = js.undefined
  }
  object `0` {
    
    inline def apply[IncludeConfig /* <: js.UndefOr[Boolean] */](): `0`[IncludeConfig] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[IncludeConfig]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?], IncludeConfig /* <: js.UndefOr[Boolean] */] (val x: Self & `0`[IncludeConfig]) extends AnyVal {
      
      inline def setIncludeConfig(value: IncludeConfig): Self = StObject.set(x, "includeConfig", value.asInstanceOf[js.Any])
      
      inline def setIncludeConfigUndefined: Self = StObject.set(x, "includeConfig", js.undefined)
    }
  }
  
  trait Floor extends StObject {
    
    var floor: js.UndefOr[Boolean] = js.undefined
  }
  object Floor {
    
    inline def apply(): Floor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Floor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Floor] (val x: Self) extends AnyVal {
      
      inline def setFloor(value: Boolean): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    }
  }
  
  trait Literal extends StObject {
    
    var literal: Boolean
    
    var `val`: String
  }
  object Literal {
    
    inline def apply(literal: Boolean, `val`: String): Literal = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
      
      inline def setLiteral(value: Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<std.Exclude<luxon.luxon/src/datetime.DateTimeUnit, 'quarter' | 'week'>, number> */
  trait RecordExcludeDateTimeUnit extends StObject {
    
    var day: Double
    
    var hour: Double
    
    var millisecond: Double
    
    var minute: Double
    
    var month: Double
    
    var second: Double
    
    var year: Double
  }
  object RecordExcludeDateTimeUnit {
    
    inline def apply(
      day: Double,
      hour: Double,
      millisecond: Double,
      minute: Double,
      month: Double,
      second: Double,
      year: Double
    ): RecordExcludeDateTimeUnit = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordExcludeDateTimeUnit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordExcludeDateTimeUnit] (val x: Self) extends AnyVal {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  trait Separator extends StObject {
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object Separator {
    
    inline def apply(): Separator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Separator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Separator] (val x: Self) extends AnyVal {
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait Zone extends StObject {
    
    var zone: js.UndefOr[String | typings.luxon.srcZoneMod.Zone] = js.undefined
  }
  object Zone {
    
    inline def apply(): Zone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Zone]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Zone] (val x: Self) extends AnyVal {
      
      inline def setZone(value: String | typings.luxon.srcZoneMod.Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
}
