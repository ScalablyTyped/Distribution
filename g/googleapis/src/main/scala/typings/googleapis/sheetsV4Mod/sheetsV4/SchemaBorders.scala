package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The borders of the cell.
  */
@js.native
trait SchemaBorders extends js.Object {
  /**
    * The bottom border of the cell.
    */
  var bottom: js.UndefOr[SchemaBorder] = js.native
  /**
    * The left border of the cell.
    */
  var left: js.UndefOr[SchemaBorder] = js.native
  /**
    * The right border of the cell.
    */
  var right: js.UndefOr[SchemaBorder] = js.native
  /**
    * The top border of the cell.
    */
  var top: js.UndefOr[SchemaBorder] = js.native
}

object SchemaBorders {
  @scala.inline
  def apply(
    bottom: SchemaBorder = null,
    left: SchemaBorder = null,
    right: SchemaBorder = null,
    top: SchemaBorder = null
  ): SchemaBorders = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBorders]
  }
}

