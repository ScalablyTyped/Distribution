package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MountBatchSize extends js.Object {
  var mountBatchSize: js.UndefOr[scala.Double] = js.undefined
  var unmountBatchSize: js.UndefOr[scala.Double] = js.undefined
  var viewport: js.UndefOr[jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback] = js.undefined
}

object Anon_MountBatchSize {
  @scala.inline
  def apply(
    mountBatchSize: scala.Int | scala.Double = null,
    unmountBatchSize: scala.Int | scala.Double = null,
    viewport: jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback = null
  ): Anon_MountBatchSize = {
    val __obj = js.Dynamic.literal()
    if (mountBatchSize != null) __obj.updateDynamic("mountBatchSize")(mountBatchSize.asInstanceOf[js.Any])
    if (unmountBatchSize != null) __obj.updateDynamic("unmountBatchSize")(unmountBatchSize.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Anon_MountBatchSize]
  }
}

