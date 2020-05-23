package typings.inputmask.mod

import typings.inputmask.anon.Start
import typings.inputmask.inputmaskBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandObject extends js.Object {
  /**
    * Character to insert.
    */
  var c: js.UndefOr[String] = js.undefined
  /**
    * Position of the caret.
    */
  var caret: js.UndefOr[Double] = js.undefined
  /**
    * Position(s) to add.
    */
  var insert: js.UndefOr[InsertPosition | js.Array[InsertPosition]] = js.undefined
  /**
    * Position to insert.
    */
  var pos: js.UndefOr[Double] = js.undefined
  /**
    * * `true` => refresh validPositions from the complete buffer .
    * * `{ start: , end: }` => refresh from start to end.
    */
  var refreshFromBuffer: js.UndefOr[`true` | Start] = js.undefined
  /**
    * Position(s) to remove.
    */
  var remove: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object CommandObject {
  @scala.inline
  def apply(
    c: String = null,
    caret: js.UndefOr[Double] = js.undefined,
    insert: InsertPosition | js.Array[InsertPosition] = null,
    pos: js.UndefOr[Double] = js.undefined,
    refreshFromBuffer: `true` | Start = null,
    remove: Double | js.Array[Double] = null
  ): CommandObject = {
    val __obj = js.Dynamic.literal()
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (!js.isUndefined(caret)) __obj.updateDynamic("caret")(caret.get.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (!js.isUndefined(pos)) __obj.updateDynamic("pos")(pos.get.asInstanceOf[js.Any])
    if (refreshFromBuffer != null) __obj.updateDynamic("refreshFromBuffer")(refreshFromBuffer.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandObject]
  }
}

