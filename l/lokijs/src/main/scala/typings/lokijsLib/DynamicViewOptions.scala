package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicViewOptions extends js.Object {
  var minRebuildInterval: scala.Double
  var persistent: scala.Boolean
  var sortPriority: lokijsLib.lokijsLibStrings.active | lokijsLib.lokijsLibStrings.passive
}

object DynamicViewOptions {
  @scala.inline
  def apply(
    minRebuildInterval: scala.Double,
    persistent: scala.Boolean,
    sortPriority: lokijsLib.lokijsLibStrings.active | lokijsLib.lokijsLibStrings.passive
  ): DynamicViewOptions = {
    val __obj = js.Dynamic.literal(minRebuildInterval = minRebuildInterval, persistent = persistent, sortPriority = sortPriority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynamicViewOptions]
  }
}

