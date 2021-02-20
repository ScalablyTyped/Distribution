package typings.lazyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0`[T] extends StObject {
    
    var `0`: js.Any = js.native
    
    var `1`: T = js.native
  }
  object `0` {
    
    @scala.inline
    def apply[T](`0`: js.Any, `1`: T): `0`[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`[T]]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`[_], T] (val x: Self with `0`[T]) extends AnyVal {
      
      @scala.inline
      def set0(value: js.Any): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set1(value: T): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1`[ElementT, OutputT /* <: js.Array[_] */] extends StObject {
    
    var `0`: js.Array[ElementT] = js.native
    
    var `1`: js.Any = js.native
    
    var `2`: OutputT = js.native
    
    var `3`: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias lazy.js.LazyJS.Tuple<ElementT, LengthT, lazy.js.LazyJS.PushFront<OutputT, ElementT>> */ js.Object = js.native
  }
  object `1` {
    
    @scala.inline
    def apply[ElementT, OutputT /* <: js.Array[_] */](
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
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`[_, _], ElementT, OutputT /* <: js.Array[_] */] (val x: Self with (`1`[ElementT, OutputT])) extends AnyVal {
      
      @scala.inline
      def set0(value: js.Array[ElementT]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set0Varargs(value: ElementT*): Self = StObject.set(x, "0", js.Array(value :_*))
      
      @scala.inline
      def set1(value: js.Any): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2(value: OutputT): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set3(
        value: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias lazy.js.LazyJS.Tuple<ElementT, LengthT, lazy.js.LazyJS.PushFront<OutputT, ElementT>> */ js.Object
      ): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Property extends StObject {
    
    var property: String = js.native
    
    var value: js.Any = js.native
  }
  object Property {
    
    @scala.inline
    def apply(property: String, value: js.Any): Property = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Property]
    }
    
    @scala.inline
    implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
