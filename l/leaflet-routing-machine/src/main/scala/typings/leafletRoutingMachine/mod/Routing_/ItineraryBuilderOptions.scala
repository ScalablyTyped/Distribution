package typings.leafletRoutingMachine.mod.Routing_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItineraryBuilderOptions extends js.Object {
  var containerClassName: String = js.native
}

object ItineraryBuilderOptions {
  @scala.inline
  def apply(containerClassName: String): ItineraryBuilderOptions = {
    val __obj = js.Dynamic.literal(containerClassName = containerClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItineraryBuilderOptions]
  }
  @scala.inline
  implicit class ItineraryBuilderOptionsOps[Self <: ItineraryBuilderOptions] (val x: Self) extends AnyVal {
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
    def setContainerClassName(value: String): Self = this.set("containerClassName", value.asInstanceOf[js.Any])
  }
  
}

