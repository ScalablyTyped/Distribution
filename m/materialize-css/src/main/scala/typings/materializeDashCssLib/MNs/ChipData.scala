package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipData extends js.Object {
  /**
    * Chip image
    */
  var img: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Chip tag
    */
  var tag: java.lang.String
}

object ChipData {
  @scala.inline
  def apply(tag: java.lang.String, img: java.lang.String = null): ChipData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tag")(tag)
    if (img != null) __obj.updateDynamic("img")(img)
    __obj.asInstanceOf[ChipData]
  }
}

