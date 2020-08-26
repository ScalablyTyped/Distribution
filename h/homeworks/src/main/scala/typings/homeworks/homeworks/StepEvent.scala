package typings.homeworks.homeworks

import typings.homeworks.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @since 1.0.44
  */
@js.native
trait StepEvent extends js.Object {
  var header: js.Array[JQuery] = js.native
  var index: Double = js.native
  var length: Double = js.native
}

object StepEvent {
  @scala.inline
  def apply(header: js.Array[JQuery], index: Double, length: Double): StepEvent = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepEvent]
  }
  @scala.inline
  implicit class StepEventOps[Self <: StepEvent] (val x: Self) extends AnyVal {
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
    def setHeaderVarargs(value: JQuery*): Self = this.set("header", js.Array(value :_*))
    @scala.inline
    def setHeader(value: js.Array[JQuery]): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

