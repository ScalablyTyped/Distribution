package typings
package jasminewd2Lib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Env extends js.Object {
  def addMatchers(matchers: AsyncCustomMatcherFactories): scala.Unit
}

object Env {
  @scala.inline
  def apply(addMatchers: js.Function1[AsyncCustomMatcherFactories, scala.Unit]): Env = {
    val __obj = js.Dynamic.literal(addMatchers = addMatchers)
  
    __obj.asInstanceOf[Env]
  }
}

