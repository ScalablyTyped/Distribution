package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MountBatchSizeNumber extends js.Object {
  var mountBatchSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MountBatchSizeNumber {
  @scala.inline
  def apply(mountBatchSize: scala.Int | scala.Double = null): Anon_MountBatchSizeNumber = {
    val __obj = js.Dynamic.literal()
    if (mountBatchSize != null) __obj.updateDynamic("mountBatchSize")(mountBatchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MountBatchSizeNumber]
  }
}

