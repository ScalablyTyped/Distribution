package typings.jaegerClient.mod

import typings.opentracing.mod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Injector extends js.Object {
  
  def inject(spanContext: SpanContext, carrier: js.Any): Unit = js.native
}
object Injector {
  
  @scala.inline
  def apply(inject: (SpanContext, js.Any) => Unit): Injector = {
    val __obj = js.Dynamic.literal(inject = js.Any.fromFunction2(inject))
    __obj.asInstanceOf[Injector]
  }
  
  @scala.inline
  implicit class InjectorOps[Self <: Injector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInject(value: (SpanContext, js.Any) => Unit): Self = this.set("inject", js.Any.fromFunction2(value))
  }
}
