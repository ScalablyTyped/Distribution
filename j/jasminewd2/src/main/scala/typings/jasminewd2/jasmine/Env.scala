package typings.jasminewd2.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  def addMatchers(matchers: AsyncCustomMatcherFactories): Unit
}

object Env {
  @scala.inline
  def apply(addMatchers: AsyncCustomMatcherFactories => Unit): Env = {
    val __obj = js.Dynamic.literal(addMatchers = js.Any.fromFunction1(addMatchers))
  
    __obj.asInstanceOf[Env]
  }
}

