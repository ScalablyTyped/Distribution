package typings.knockoutTransformations

import typings.knockoutTransformations.anon.Dispose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KnockoutTransformations {
  
  type Mapping[T, TResult] = js.Function1[/* value */ T, TResult]
  
  trait MappingOption[T, TResult] extends StObject {
    
    var disposeItem: js.UndefOr[js.Function1[/* item */ TResult, Unit]] = js.undefined
    
    def mapping(value: T): TResult
    @JSName("mapping")
    var mapping_Original: Mapping[T, TResult]
  }
  object MappingOption {
    
    inline def apply[T, TResult](mapping: T => TResult): MappingOption[T, TResult] = {
      val __obj = js.Dynamic.literal(mapping = js.Any.fromFunction1(mapping))
      __obj.asInstanceOf[MappingOption[T, TResult]]
    }
    
    extension [Self <: MappingOption[?, ?], T, TResult](x: Self & (MappingOption[T, TResult])) {
      
      inline def setDisposeItem(value: /* item */ TResult => Unit): Self = StObject.set(x, "disposeItem", js.Any.fromFunction1(value))
      
      inline def setDisposeItemUndefined: Self = StObject.set(x, "disposeItem", js.undefined)
      
      inline def setMapping(value: T => TResult): Self = StObject.set(x, "mapping", js.Any.fromFunction1(value))
    }
  }
  
  trait MappingWithDisposeCallbackOption[T, TResult] extends StObject {
    
    def mappingWithDisposeCallback(value: T): Dispose[TResult]
  }
  object MappingWithDisposeCallbackOption {
    
    inline def apply[T, TResult](mappingWithDisposeCallback: T => Dispose[TResult]): MappingWithDisposeCallbackOption[T, TResult] = {
      val __obj = js.Dynamic.literal(mappingWithDisposeCallback = js.Any.fromFunction1(mappingWithDisposeCallback))
      __obj.asInstanceOf[MappingWithDisposeCallbackOption[T, TResult]]
    }
    
    extension [Self <: MappingWithDisposeCallbackOption[?, ?], T, TResult](x: Self & (MappingWithDisposeCallbackOption[T, TResult])) {
      
      inline def setMappingWithDisposeCallback(value: T => Dispose[TResult]): Self = StObject.set(x, "mappingWithDisposeCallback", js.Any.fromFunction1(value))
    }
  }
}
