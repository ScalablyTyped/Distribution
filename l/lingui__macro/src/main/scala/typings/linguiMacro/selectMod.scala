package typings.linguiMacro

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.linguiCore.i18nMod.MessageDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  trait PluralForms
    extends StObject
       with /* exact */ NumberDictionary[String | MessageDescriptor] {
    
    var few: js.UndefOr[String | MessageDescriptor] = js.undefined
    
    var many: js.UndefOr[String | MessageDescriptor] = js.undefined
    
    var one: js.UndefOr[String | MessageDescriptor] = js.undefined
    
    var other: String | MessageDescriptor
    
    var two: js.UndefOr[String | MessageDescriptor] = js.undefined
    
    var zero: js.UndefOr[String | MessageDescriptor] = js.undefined
  }
  object PluralForms {
    
    inline def apply(other: String | MessageDescriptor): PluralForms = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralForms]
    }
    
    extension [Self <: PluralForms](x: Self) {
      
      inline def setFew(value: String | MessageDescriptor): Self = StObject.set(x, "few", value.asInstanceOf[js.Any])
      
      inline def setFewUndefined: Self = StObject.set(x, "few", js.undefined)
      
      inline def setMany(value: String | MessageDescriptor): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setOne(value: String | MessageDescriptor): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
      
      inline def setOther(value: String | MessageDescriptor): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setTwo(value: String | MessageDescriptor): Self = StObject.set(x, "two", value.asInstanceOf[js.Any])
      
      inline def setTwoUndefined: Self = StObject.set(x, "two", js.undefined)
      
      inline def setZero(value: String | MessageDescriptor): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
      
      inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
    }
  }
  
  trait PluralProps
    extends StObject
       with PluralForms {
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var value: Double
  }
  object PluralProps {
    
    inline def apply(other: String | MessageDescriptor, value: Double): PluralProps = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralProps]
    }
    
    extension [Self <: PluralProps](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectProps
    extends StObject
       with /* selectForm */ StringDictionary[String | MessageDescriptor] {
    
    var other: String | MessageDescriptor
    
    var value: String
  }
  object SelectProps {
    
    inline def apply(other: String | MessageDescriptor, value: String): SelectProps = {
      val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectProps]
    }
    
    extension [Self <: SelectProps](x: Self) {
      
      inline def setOther(value: String | MessageDescriptor): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
