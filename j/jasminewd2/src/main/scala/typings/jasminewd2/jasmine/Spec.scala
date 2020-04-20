package typings.jasminewd2.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  def addMatchers(matchers: AsyncCustomMatcherFactories): Unit
}

object Spec {
  @scala.inline
  def apply(addMatchers: AsyncCustomMatcherFactories => Unit): Spec = {
    val __obj = js.Dynamic.literal(addMatchers = js.Any.fromFunction1(addMatchers))
    __obj.asInstanceOf[Spec]
  }
}

