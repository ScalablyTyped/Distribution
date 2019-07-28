package typings.lokijs

import typings.lokijs.lokijsStrings.active
import typings.lokijs.lokijsStrings.passive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicViewOptions extends js.Object {
  var minRebuildInterval: Double
  var persistent: Boolean
  var sortPriority: active | passive
}

object DynamicViewOptions {
  @scala.inline
  def apply(minRebuildInterval: Double, persistent: Boolean, sortPriority: active | passive): DynamicViewOptions = {
    val __obj = js.Dynamic.literal(minRebuildInterval = minRebuildInterval, persistent = persistent, sortPriority = sortPriority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynamicViewOptions]
  }
}

