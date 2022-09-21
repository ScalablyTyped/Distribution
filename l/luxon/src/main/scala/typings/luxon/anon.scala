package typings.luxon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Calendar extends StObject {
    
    var calendar: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
      ] = js.undefined
  }
  object Calendar {
    
    inline def apply(): Calendar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Calendar]
    }
    
    extension [Self <: Calendar](x: Self) {
      
      inline def setCalendar(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
      
      inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
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
    
    extension [Self <: Floor](x: Self) {
      
      inline def setFloor(value: Boolean): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
      
      inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    }
  }
  
  trait IncludeConfig extends StObject {
    
    /**
      * Include configuration attributes in the output
      * @defaultValue false
      */
    var includeConfig: js.UndefOr[Boolean] = js.undefined
  }
  object IncludeConfig {
    
    inline def apply(): IncludeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeConfig]
    }
    
    extension [Self <: IncludeConfig](x: Self) {
      
      inline def setIncludeConfig(value: Boolean): Self = StObject.set(x, "includeConfig", value.asInstanceOf[js.Any])
      
      inline def setIncludeConfigUndefined: Self = StObject.set(x, "includeConfig", js.undefined)
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
    
    extension [Self <: Literal](x: Self) {
      
      inline def setLiteral(value: Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  trait NumberingSystem extends StObject {
    
    var numberingSystem: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
      ] = js.undefined
  }
  object NumberingSystem {
    
    inline def apply(): NumberingSystem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberingSystem]
    }
    
    extension [Self <: NumberingSystem](x: Self) {
      
      inline def setNumberingSystem(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
      
      inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
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
    
    extension [Self <: Separator](x: Self) {
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait Zone extends StObject {
    
    var zone: js.UndefOr[String | typings.luxon.zoneMod.Zone] = js.undefined
  }
  object Zone {
    
    inline def apply(): Zone = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Zone]
    }
    
    extension [Self <: Zone](x: Self) {
      
      inline def setZone(value: String | typings.luxon.zoneMod.Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
}
