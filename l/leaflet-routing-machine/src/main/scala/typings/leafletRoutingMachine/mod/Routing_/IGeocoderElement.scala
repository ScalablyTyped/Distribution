package typings.leafletRoutingMachine.mod.Routing_

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
trait IGeocoderElement extends StObject {
  
  var closeButton: HTMLElement
  
  var container: HTMLElement
  
  var input: HTMLElement
}
object IGeocoderElement {
  
  inline def apply(closeButton: HTMLElement, container: HTMLElement, input: HTMLElement): IGeocoderElement = {
    val __obj = js.Dynamic.literal(closeButton = closeButton.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeocoderElement]
  }
  
  extension [Self <: IGeocoderElement](x: Self) {
    
    inline def setCloseButton(value: HTMLElement): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setInput(value: HTMLElement): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
