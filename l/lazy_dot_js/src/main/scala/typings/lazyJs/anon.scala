package typings.lazyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[T] extends StObject {
    
    var `0`: js.Any
    
    var `1`: T
  }
  object `0` {
    
    inline def apply[T](`0`: js.Any, `1`: T): `0`[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[T]]
    }
    
    extension [Self <: `0`[?], T](x: Self & `0`[T]) {
      
      inline def set0(value: js.Any): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: T): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`[ElementT, OutputT /* <: js.Array[js.Any] */] extends StObject {
    
    var `0`: js.Array[ElementT]
    
    var `1`: js.Any
    
    var `2`: OutputT
    
    var `3`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias lazy.js.LazyJS.Tuple<ElementT, LengthT, lazy.js.LazyJS.PushFront<OutputT, ElementT>> */ js.Object
  }
  object `1` {
    
    inline def apply[ElementT, OutputT /* <: js.Array[js.Any] */](
      `0`: js.Array[ElementT],
      `1`: js.Any,
      `2`: OutputT,
      `3`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias lazy.js.LazyJS.Tuple<ElementT, LengthT, lazy.js.LazyJS.PushFront<OutputT, ElementT>> */ js.Object
    ): `1`[ElementT, OutputT] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`[ElementT, OutputT]]
    }
    
    extension [Self <: `1`[?, ?], ElementT, OutputT /* <: js.Array[js.Any] */](x: Self & (`1`[ElementT, OutputT])) {
      
      inline def set0(value: js.Array[ElementT]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set0Varargs(value: ElementT*): Self = StObject.set(x, "0", js.Array(value :_*))
      
      inline def set1(value: js.Any): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: OutputT): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set3(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias lazy.js.LazyJS.Tuple<ElementT, LengthT, lazy.js.LazyJS.PushFront<OutputT, ElementT>> */ js.Object
      ): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    }
  }
  
  trait Property extends StObject {
    
    var property: String
    
    var value: js.Any
  }
  object Property {
    
    inline def apply(property: String, value: js.Any): Property = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Property]
    }
    
    extension [Self <: Property](x: Self) {
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
