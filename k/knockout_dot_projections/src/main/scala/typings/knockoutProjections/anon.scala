package typings.knockoutProjections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dispose[TResult] extends StObject {
    
    def dispose(): Unit
    
    var mappedValue: TResult
  }
  object Dispose {
    
    @scala.inline
    def apply[TResult](dispose: () => Unit, mappedValue: TResult): Dispose[TResult] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), mappedValue = mappedValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispose[TResult]]
    }
    
    @scala.inline
    implicit class DisposeMutableBuilder[Self <: Dispose[?], TResult] (val x: Self & Dispose[TResult]) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMappedValue(value: TResult): Self = StObject.set(x, "mappedValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisposeItem[T, TResult] extends StObject {
    
    var disposeItem: js.UndefOr[js.Function1[/* mappedItem */ TResult, Unit]] = js.undefined
    
    def mapping(value: T): TResult
  }
  object DisposeItem {
    
    @scala.inline
    def apply[T, TResult](mapping: T => TResult): DisposeItem[T, TResult] = {
      val __obj = js.Dynamic.literal(mapping = js.Any.fromFunction1(mapping))
      __obj.asInstanceOf[DisposeItem[T, TResult]]
    }
    
    @scala.inline
    implicit class DisposeItemMutableBuilder[Self <: DisposeItem[?, ?], T, TResult] (val x: Self & (DisposeItem[T, TResult])) extends AnyVal {
      
      @scala.inline
      def setDisposeItem(value: /* mappedItem */ TResult => Unit): Self = StObject.set(x, "disposeItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisposeItemUndefined: Self = StObject.set(x, "disposeItem", js.undefined)
      
      @scala.inline
      def setMapping(value: T => TResult): Self = StObject.set(x, "mapping", js.Any.fromFunction1(value))
    }
  }
  
  trait MappingWithDisposeCallback[T, TResult] extends StObject {
    
    def mappingWithDisposeCallback(value: T): Dispose[TResult]
  }
  object MappingWithDisposeCallback {
    
    @scala.inline
    def apply[T, TResult](mappingWithDisposeCallback: T => Dispose[TResult]): MappingWithDisposeCallback[T, TResult] = {
      val __obj = js.Dynamic.literal(mappingWithDisposeCallback = js.Any.fromFunction1(mappingWithDisposeCallback))
      __obj.asInstanceOf[MappingWithDisposeCallback[T, TResult]]
    }
    
    @scala.inline
    implicit class MappingWithDisposeCallbackMutableBuilder[Self <: MappingWithDisposeCallback[?, ?], T, TResult] (val x: Self & (MappingWithDisposeCallback[T, TResult])) extends AnyVal {
      
      @scala.inline
      def setMappingWithDisposeCallback(value: T => Dispose[TResult]): Self = StObject.set(x, "mappingWithDisposeCallback", js.Any.fromFunction1(value))
    }
  }
}
