package typings.jqueryMouseExit.mod

import typings.jquery.JQuery.TriggeredEvent
import typings.jqueryMouseExit.jqueryMouseExitStrings.mouseExit
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  trait JQuery extends js.Object {
    
    def mouseExit(): JQuery = js.native
    def mouseExit(options: Options): JQuery = js.native
    
    @JSName("on")
    def on_mouseExit(
      event: mouseExit,
      handler: js.Function2[/* event */ TriggeredEvent[HTMLElement, _, _, _], /* data */ FocusElements, Unit]
    ): JQuery = js.native
  }
}
