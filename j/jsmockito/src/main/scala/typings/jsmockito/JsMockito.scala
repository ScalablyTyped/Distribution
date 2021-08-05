package typings.jsmockito

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JsMockito {
  
  trait JsMockitoStubBuilder extends StObject {
    
    /**
      * Provide functions to be run in place of the mocked method.
      *
      * @param func Functions to be run in order of execution.
      * @return {JsMockitoStubBuilder} Itself for method chaining
      */
    def `then`(func: (js.Function1[/* obj */ js.Any, js.Any])*): JsMockitoStubBuilder
    
    /**
      * Provide values to be returned by the mocked function.
      *
      * @param obj Values to be returned in order of execution.
      * @return {JsMockitoStubBuilder} Itself for method chaining
      */
    def thenReturn(obj: js.Any*): JsMockitoStubBuilder
    
    /**
      * Provide exceptions to be thrown by the mocked function.
      *
      * @param obj Exceptions to be thrown in order of execution.
      * @return {JsMockitoStubBuilder} Itself for method chaining
      */
    def thenThrow(obj: Error*): JsMockitoStubBuilder
  }
  object JsMockitoStubBuilder {
    
    inline def apply(
      `then`: /* repeated */ js.Function1[/* obj */ js.Any, js.Any] => JsMockitoStubBuilder,
      thenReturn: /* repeated */ js.Any => JsMockitoStubBuilder,
      thenThrow: /* repeated */ Error => JsMockitoStubBuilder
    ): JsMockitoStubBuilder = {
      val __obj = js.Dynamic.literal(thenReturn = js.Any.fromFunction1(thenReturn), thenThrow = js.Any.fromFunction1(thenThrow))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[JsMockitoStubBuilder]
    }
    
    extension [Self <: JsMockitoStubBuilder](x: Self) {
      
      inline def setThen(value: /* repeated */ js.Function1[/* obj */ js.Any, js.Any] => JsMockitoStubBuilder): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
      
      inline def setThenReturn(value: /* repeated */ js.Any => JsMockitoStubBuilder): Self = StObject.set(x, "thenReturn", js.Any.fromFunction1(value))
      
      inline def setThenThrow(value: /* repeated */ Error => JsMockitoStubBuilder): Self = StObject.set(x, "thenThrow", js.Any.fromFunction1(value))
    }
  }
  
  trait Verifier extends StObject
}
