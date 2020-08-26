package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Har extends js.Object {
  /** This object represents the root of exported data. */
  var log: Log = js.native
}

object Har {
  @scala.inline
  def apply(log: Log): Har = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Har]
  }
  @scala.inline
  implicit class HarOps[Self <: Har] (val x: Self) extends AnyVal {
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
    def setLog(value: Log): Self = this.set("log", value.asInstanceOf[js.Any])
  }
  
}

