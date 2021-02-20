package typings.knockoutTransformations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dispose[TResult] extends StObject {
    
    def dispose(): Unit = js.native
    
    var mappedValue: TResult = js.native
  }
  object Dispose {
    
    @scala.inline
    def apply[TResult](dispose: () => Unit, mappedValue: TResult): Dispose[TResult] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), mappedValue = mappedValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispose[TResult]]
    }
    
    @scala.inline
    implicit class DisposeMutableBuilder[Self <: Dispose[_], TResult] (val x: Self with Dispose[TResult]) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMappedValue(value: TResult): Self = StObject.set(x, "mappedValue", value.asInstanceOf[js.Any])
    }
  }
}
