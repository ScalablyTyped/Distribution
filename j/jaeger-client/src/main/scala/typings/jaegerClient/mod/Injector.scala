package typings.jaegerClient.mod

import typings.opentracing.mod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Injector extends js.Object {
  def inject(spanContext: SpanContext, carrier: js.Any): Unit
}

object Injector {
  @scala.inline
  def apply(inject: (SpanContext, js.Any) => Unit): Injector = {
    val __obj = js.Dynamic.literal(inject = js.Any.fromFunction2(inject))
  
    __obj.asInstanceOf[Injector]
  }
}

