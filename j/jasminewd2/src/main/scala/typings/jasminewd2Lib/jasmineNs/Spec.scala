package typings
package jasminewd2Lib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  def addMatchers(matchers: AsyncCustomMatcherFactories): scala.Unit
}

object Spec {
  @scala.inline
  def apply(addMatchers: js.Function1[AsyncCustomMatcherFactories, scala.Unit]): Spec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addMatchers")(addMatchers)
    __obj.asInstanceOf[Spec]
  }
}

