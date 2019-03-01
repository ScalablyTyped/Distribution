package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace extends js.Object {
  var message: java.lang.String
  var name: java.lang.String
  var stack: js.Any
}

object Trace {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: js.Any): Trace = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Trace]
  }
}

