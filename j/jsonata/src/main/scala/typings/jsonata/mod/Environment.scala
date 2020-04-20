package typings.jsonata.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  val async: Boolean
  val timestamp: Date
  def bind(name: String, value: js.Any): Unit
  def lookup(name: String): js.Any
}

object Environment {
  @scala.inline
  def apply(async: Boolean, bind: (String, js.Any) => Unit, lookup: String => js.Any, timestamp: Date): Environment = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), lookup = js.Any.fromFunction1(lookup), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
}

