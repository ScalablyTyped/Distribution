package typings.atJupyterlabStatusbar.libDefaultsLineColMod

import typings.atJupyterlabApputils.atJupyterlabApputilsMod.VDomModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/statusbar/lib/defaults/lineCol", "LineCol")
@js.native
object LineColNs extends js.Object {
  /**
    * A VDom model for a status item tracking the line/column of an editor.
    */
  @js.native
  class Model () extends VDomModel {
    var _column: js.Any = js.native
    var _editor: js.Any = js.native
    var _getAllState: js.Any = js.native
    var _line: js.Any = js.native
    /**
      * React to a change in the cursors of the current editor.
      */
    var _onSelectionChanged: js.Any = js.native
    var _triggerChange: js.Any = js.native
    /**
      * The current column of the model.
      */
    val column: Double = js.native
    /**
      * The current editor of the model.
      */
    var editor: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any) | Null = js.native
    /**
      * The current line of the model.
      */
    val line: Double = js.native
  }
  
}

