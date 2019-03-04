package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IGeocoderElement extends js.Object {
  var closeButton: stdLib.HTMLElement
  var container: stdLib.HTMLElement
  var input: stdLib.HTMLElement
}

object IGeocoderElement {
  @scala.inline
  def apply(closeButton: stdLib.HTMLElement, container: stdLib.HTMLElement, input: stdLib.HTMLElement): IGeocoderElement = {
    val __obj = js.Dynamic.literal(closeButton = closeButton, container = container, input = input)
  
    __obj.asInstanceOf[IGeocoderElement]
  }
}

