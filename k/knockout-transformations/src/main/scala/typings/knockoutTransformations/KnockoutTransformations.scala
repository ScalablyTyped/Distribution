package typings.knockoutTransformations

import typings.knockoutTransformations.anon.Dispose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KnockoutTransformations {
  
  type Mapping[T, TResult] = js.Function1[/* value */ T, TResult]
  
  @js.native
  trait MappingOption[T, TResult] extends StObject {
    
    var disposeItem: js.UndefOr[js.Function1[/* item */ TResult, Unit]] = js.native
    
    def mapping(value: T): TResult = js.native
    @JSName("mapping")
    var mapping_Original: Mapping[T, TResult] = js.native
  }
  
  @js.native
  trait MappingWithDisposeCallbackOption[T, TResult] extends StObject {
    
    def mappingWithDisposeCallback(value: T): Dispose[TResult] = js.native
  }
  object MappingWithDisposeCallbackOption {
    
    @scala.inline
    def apply[T, TResult](mappingWithDisposeCallback: T => Dispose[TResult]): MappingWithDisposeCallbackOption[T, TResult] = {
      val __obj = js.Dynamic.literal(mappingWithDisposeCallback = js.Any.fromFunction1(mappingWithDisposeCallback))
      __obj.asInstanceOf[MappingWithDisposeCallbackOption[T, TResult]]
    }
    
    @scala.inline
    implicit class MappingWithDisposeCallbackOptionMutableBuilder[Self <: MappingWithDisposeCallbackOption[_, _], T, TResult] (val x: Self with (MappingWithDisposeCallbackOption[T, TResult])) extends AnyVal {
      
      @scala.inline
      def setMappingWithDisposeCallback(value: T => Dispose[TResult]): Self = StObject.set(x, "mappingWithDisposeCallback", js.Any.fromFunction1(value))
    }
  }
}
