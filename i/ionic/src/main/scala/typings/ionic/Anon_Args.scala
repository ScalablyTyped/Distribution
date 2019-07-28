package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.Array[String]
  var command: String
}

object Anon_Args {
  @scala.inline
  def apply(args: js.Array[String], command: String): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args, command = command)
  
    __obj.asInstanceOf[Anon_Args]
  }
}

