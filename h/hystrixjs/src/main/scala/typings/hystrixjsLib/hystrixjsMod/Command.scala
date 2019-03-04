package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  def execute(args: js.Any*): js.Thenable[_]
}

object Command {
  @scala.inline
  def apply(execute: js.Function1[/* repeated */ js.Any, js.Thenable[_]]): Command = {
    val __obj = js.Dynamic.literal(execute = execute)
  
    __obj.asInstanceOf[Command]
  }
}

