package typings
package atJupyterlabTerminalLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/terminal/lib/widget", "Terminal")
@js.native
object TerminalNs extends js.Object {
  /**
    * Options for the terminal widget.
    */
  trait IOptions extends js.Object {
    /**
      * Whether to blink the cursor.  Can only be set at startup.
      */
    var cursorBlink: scala.Boolean
    /**
      * The font size of the terminal in pixels.
      */
    var fontSize: scala.Double
    /**
      * An optional command to run when the session starts.
      */
    var initialCommand: java.lang.String
    /**
      * The theme of the terminal.
      */
    var theme: Theme
  }
  
  /**
    * A type for the terminal theme.
    */
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabTerminalLib.atJupyterlabTerminalLibStrings.light
    - atJupyterlabTerminalLib.atJupyterlabTerminalLibStrings.dark
  */
  trait Theme extends js.Object
  
  /**
    * The default options used for creating terminals.
    */
  val defaultOptions: IOptions = js.native
}

