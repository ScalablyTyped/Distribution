package typings.guacamoleClient

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-client/lib/InputSink", JSImport.Namespace)
@js.native
object inputSinkMod extends js.Object {
  
  @js.native
  class InputSink () extends js.Object {
    
    /**
      * Attempts to focus the underlying input field. The focus attempt occurs
      * asynchronously, and may silently fail depending on browser restrictions.
      */
    def focus(): Unit = js.native
    
    /**
      * Returns the underlying input field. This input field MUST be manually
      * added to the DOM for the Guacamole.InputSink to have any effect.
      */
    def getElement(): HTMLElement = js.native
  }
}
