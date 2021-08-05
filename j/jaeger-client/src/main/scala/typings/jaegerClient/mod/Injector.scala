package typings.jaegerClient.mod

import typings.opentracing.mod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Injector extends StObject {
  
  def inject(spanContext: SpanContext, carrier: js.Any): Unit
}
object Injector {
  
  inline def apply(inject: (SpanContext, js.Any) => Unit): Injector = {
    val __obj = js.Dynamic.literal(inject = js.Any.fromFunction2(inject))
    __obj.asInstanceOf[Injector]
  }
  
  extension [Self <: Injector](x: Self) {
    
    inline def setInject(value: (SpanContext, js.Any) => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction2(value))
  }
}
