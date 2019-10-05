package typings.atJupyterlabCodeeditor.libEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CodeEditor {
  import typings.std.KeyboardEvent

  /**
    * A factory used to create a code editor.
    */
  type Factory = js.Function1[/* options */ IOptions, IEditor]
  /**
    * A keydown handler type.
    *
    * #### Notes
    * Return `true` to prevent the default handling of the event by the
    * editor.
    */
  type KeydownHandler = js.Function2[/* instance */ IEditor, /* event */ KeyboardEvent, Boolean]
  type Model = Model_
}
