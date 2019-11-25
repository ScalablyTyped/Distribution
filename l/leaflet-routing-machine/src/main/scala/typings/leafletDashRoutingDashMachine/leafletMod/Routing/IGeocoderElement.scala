package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IGeocoderElement extends js.Object {
  var closeButton: HTMLElement
  var container: HTMLElement
  var input: HTMLElement
}

object IGeocoderElement {
  @scala.inline
  def apply(closeButton: HTMLElement, container: HTMLElement, input: HTMLElement): IGeocoderElement = {
    val __obj = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGeocoderElement]
  }
}

