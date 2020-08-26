package typings.jsonata.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environment extends js.Object {
  val async: Boolean = js.native
  val timestamp: Date = js.native
  def bind(name: String, value: js.Any): Unit = js.native
  def lookup(name: String): js.Any = js.native
}

object Environment {
  @scala.inline
  def apply(async: Boolean, bind: (String, js.Any) => Unit, lookup: String => js.Any, timestamp: Date): Environment = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], bind = js.Any.fromFunction2(bind), lookup = js.Any.fromFunction1(lookup), timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  @scala.inline
  implicit class EnvironmentOps[Self <: Environment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def setBind(value: (String, js.Any) => Unit): Self = this.set("bind", js.Any.fromFunction2(value))
    @scala.inline
    def setLookup(value: String => js.Any): Self = this.set("lookup", js.Any.fromFunction1(value))
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

