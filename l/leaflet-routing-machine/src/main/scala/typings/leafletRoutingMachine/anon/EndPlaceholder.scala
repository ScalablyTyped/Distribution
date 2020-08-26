package typings.leafletRoutingMachine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndPlaceholder extends js.Object {
  var endPlaceholder: String = js.native
  var startPlaceholder: String = js.native
  var viaPlaceholder: String = js.native
}

object EndPlaceholder {
  @scala.inline
  def apply(endPlaceholder: String, startPlaceholder: String, viaPlaceholder: String): EndPlaceholder = {
    val __obj = js.Dynamic.literal(endPlaceholder = endPlaceholder.asInstanceOf[js.Any], startPlaceholder = startPlaceholder.asInstanceOf[js.Any], viaPlaceholder = viaPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPlaceholder]
  }
  @scala.inline
  implicit class EndPlaceholderOps[Self <: EndPlaceholder] (val x: Self) extends AnyVal {
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
    def setEndPlaceholder(value: String): Self = this.set("endPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartPlaceholder(value: String): Self = this.set("startPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def setViaPlaceholder(value: String): Self = this.set("viaPlaceholder", value.asInstanceOf[js.Any])
  }
  
}

