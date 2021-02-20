package typings.jsmockito

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JsMockito {
  
  @js.native
  trait JsMockitoStubBuilder extends StObject {
    
    /**
      * Provide functions to be run in place of the mocked method.
      *
      * @param func Functions to be run in order of execution.
      * @return {JsMockitoStubBuilder} Itself for method chaining
      */
    def `then`(func: (js.Function1[/* obj */ js.Any, _])*): JsMockitoStubBuilder = js.native
    
    /**
      * Provide values to be returned by the mocked function.
      *
      * @param obj Values to be returned in order of execution.
      * @return {JsMockitoStubBuilder} Itself for method chaining
      */
    def thenReturn(obj: js.Any*): JsMockitoStubBuilder = js.native
    
    /**
      * Provide exceptions to be thrown by the mocked function.
      *
      * @param obj Exceptions to be thrown in order of execution.
      * @return {JsMockitoStubBuilder} Itself for method chaining
      */
    def thenThrow(obj: Error*): JsMockitoStubBuilder = js.native
  }
  object JsMockitoStubBuilder {
    
    @scala.inline
    def apply(
      `then`: /* repeated */ js.Function1[/* obj */ js.Any, _] => JsMockitoStubBuilder,
      thenReturn: /* repeated */ js.Any => JsMockitoStubBuilder,
      thenThrow: /* repeated */ Error => JsMockitoStubBuilder
    ): JsMockitoStubBuilder = {
      val __obj = js.Dynamic.literal(thenReturn = js.Any.fromFunction1(thenReturn), thenThrow = js.Any.fromFunction1(thenThrow))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[JsMockitoStubBuilder]
    }
    
    @scala.inline
    implicit class JsMockitoStubBuilderMutableBuilder[Self <: JsMockitoStubBuilder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThen(value: /* repeated */ js.Function1[/* obj */ js.Any, _] => JsMockitoStubBuilder): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenReturn(value: /* repeated */ js.Any => JsMockitoStubBuilder): Self = StObject.set(x, "thenReturn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThenThrow(value: /* repeated */ Error => JsMockitoStubBuilder): Self = StObject.set(x, "thenThrow", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Verifier extends StObject
}
