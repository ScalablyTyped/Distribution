package typings.knockoutTransformations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dispose[TResult] extends StObject {
    
    def dispose(): Unit
    
    var mappedValue: TResult
  }
  object Dispose {
    
    inline def apply[TResult](dispose: () => Unit, mappedValue: TResult): Dispose[TResult] = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), mappedValue = mappedValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispose[TResult]]
    }
    
    extension [Self <: Dispose[?], TResult](x: Self & Dispose[TResult]) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setMappedValue(value: TResult): Self = StObject.set(x, "mappedValue", value.asInstanceOf[js.Any])
    }
  }
}
