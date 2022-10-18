package typings.lazyJs

import typings.lazyJs.LazyJS.PushFront
import typings.lazyJs.LazyJS.Tuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[ElementT, OutputT /* <: js.Array[Any] */, LengthT /* <: Double */] extends StObject {
    
    var `0`: js.Array[ElementT]
    
    var `1`: Any
    
    var `2`: OutputT
    
    var `3`: Tuple[ElementT, LengthT, PushFront[OutputT, ElementT]]
  }
  object `0` {
    
    inline def apply[ElementT, OutputT /* <: js.Array[Any] */, LengthT /* <: Double */](
      `0`: js.Array[ElementT],
      `1`: Any,
      `2`: OutputT,
      `3`: Tuple[ElementT, LengthT, PushFront[OutputT, ElementT]]
    ): `0`[ElementT, OutputT, LengthT] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[ElementT, OutputT, LengthT]]
    }
    
    extension [Self <: `0`[?, ?, ?], ElementT, OutputT /* <: js.Array[Any] */, LengthT /* <: Double */](x: Self & (`0`[ElementT, OutputT, LengthT])) {
      
      inline def set0(value: js.Array[ElementT]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set0Varargs(value: ElementT*): Self = StObject.set(x, "0", js.Array(value*))
      
      inline def set1(value: Any): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: OutputT): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(value: Tuple[ElementT, LengthT, PushFront[OutputT, ElementT]]): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    }
  }
  
  trait Property extends StObject {
    
    var property: String
    
    var value: Any
  }
  object Property {
    
    inline def apply(property: String, value: Any): Property = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Property]
    }
    
    extension [Self <: Property](x: Self) {
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
