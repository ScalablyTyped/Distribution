package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XSpec extends js.Object {
  var id: Double = js.native
  def runs(): Unit = js.native
}

object XSpec {
  @scala.inline
  def apply(id: Double, runs: () => Unit): XSpec = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], runs = js.Any.fromFunction0(runs))
    __obj.asInstanceOf[XSpec]
  }
  @scala.inline
  implicit class XSpecOps[Self <: XSpec] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuns(value: () => Unit): Self = this.set("runs", js.Any.fromFunction0(value))
  }
  
}

