package typings.leafletRoutingMachine.mod.Routing_

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IGeocoderElement extends js.Object {
  var closeButton: HTMLElement = js.native
  var container: HTMLElement = js.native
  var input: HTMLElement = js.native
}

object IGeocoderElement {
  @scala.inline
  def apply(closeButton: HTMLElement, container: HTMLElement, input: HTMLElement): IGeocoderElement = {
    val __obj = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeocoderElement]
  }
  @scala.inline
  implicit class IGeocoderElementOps[Self <: IGeocoderElement] (val x: Self) extends AnyVal {
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
    def setCloseButton(value: HTMLElement): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: HTMLElement): Self = this.set("input", value.asInstanceOf[js.Any])
  }
  
}

