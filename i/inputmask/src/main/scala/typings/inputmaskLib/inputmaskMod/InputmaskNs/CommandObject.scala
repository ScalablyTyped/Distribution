package typings
package inputmaskLib.inputmaskMod.InputmaskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandObject extends js.Object {
  /**
    * Character to insert.
    */
  var c: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Position of the caret.
    */
  var caret: js.UndefOr[scala.Double] = js.undefined
  /**
    * Position(s) to add.
    */
  var insert: js.UndefOr[InsertPosition | js.Array[InsertPosition]] = js.undefined
  /**
    * Position to insert.
    */
  var pos: js.UndefOr[scala.Double] = js.undefined
  /**
    * * `true` => refresh validPositions from the complete buffer .
    * * `{ start: , end: }` => refresh from start to end.
    */
  var refreshFromBuffer: js.UndefOr[inputmaskLib.inputmaskLibNumbers.`true` | inputmaskLib.Anon_EndStart] = js.undefined
  /**
    * Position(s) to remove.
    */
  var remove: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

