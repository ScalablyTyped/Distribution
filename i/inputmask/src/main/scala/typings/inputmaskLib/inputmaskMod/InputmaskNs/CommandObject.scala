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

object CommandObject {
  @scala.inline
  def apply(
    c: java.lang.String = null,
    caret: scala.Int | scala.Double = null,
    insert: InsertPosition | js.Array[InsertPosition] = null,
    pos: scala.Int | scala.Double = null,
    refreshFromBuffer: inputmaskLib.inputmaskLibNumbers.`true` | inputmaskLib.Anon_EndStart = null,
    remove: scala.Double | js.Array[scala.Double] = null
  ): CommandObject = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c)
    if (caret != null) __obj.updateDynamic("caret")(caret.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (pos != null) __obj.updateDynamic("pos")(pos.asInstanceOf[js.Any])
    if (refreshFromBuffer != null) __obj.updateDynamic("refreshFromBuffer")(refreshFromBuffer.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandObject]
  }
}

