package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trace extends js.Object {
  var message: String
  var name: String
  var stack: js.Any
}

object Trace {
  @scala.inline
  def apply(message: String, name: String, stack: js.Any): Trace = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Trace]
  }
}

