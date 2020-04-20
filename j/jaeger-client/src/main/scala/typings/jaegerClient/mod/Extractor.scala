package typings.jaegerClient.mod

import typings.opentracing.mod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extractor extends js.Object {
  def extract(carrier: js.Any): SpanContext | Null
}

object Extractor {
  @scala.inline
  def apply(extract: js.Any => SpanContext | Null): Extractor = {
    val __obj = js.Dynamic.literal(extract = js.Any.fromFunction1(extract))
    __obj.asInstanceOf[Extractor]
  }
}

