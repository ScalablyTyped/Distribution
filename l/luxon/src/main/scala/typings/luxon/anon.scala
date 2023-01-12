package typings.luxon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncludeConfig] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
      
      inline def setLiteral(value: Boolean): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
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
