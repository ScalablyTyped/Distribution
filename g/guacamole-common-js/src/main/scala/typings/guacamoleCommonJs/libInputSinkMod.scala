package typings.guacamoleCommonJs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputSinkMod {
  
  @JSImport("guacamole-common-js/lib/InputSink", "InputSink")
  @js.native
  open class InputSink () extends StObject {
    
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
