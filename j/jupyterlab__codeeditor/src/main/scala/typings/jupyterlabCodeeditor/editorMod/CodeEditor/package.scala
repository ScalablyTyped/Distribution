package typings.jupyterlabCodeeditor.editorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CodeEditor {
  /**
    * A factory used to create a code editor.
    */
  type Factory = js.Function1[
    /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions, 
    typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
  ]
  /**
    * A keydown handler type.
    *
    * #### Notes
    * Return `true` to prevent the default handling of the event by the
    * editor.
    */
  type KeydownHandler = js.Function2[
    /* instance */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor, 
    /* event */ typings.std.KeyboardEvent, 
    scala.Boolean
  ]
  type Model = typings.jupyterlabCodeeditor.editorMod.CodeEditor.Model_
}
