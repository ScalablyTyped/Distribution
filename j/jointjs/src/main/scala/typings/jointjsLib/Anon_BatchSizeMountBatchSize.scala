package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSizeMountBatchSize extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var mountBatchSize: js.UndefOr[scala.Double] = js.undefined
  var progress: js.UndefOr[jointjsLib.jointjsMod.diaNs.PaperNs.ProgressCallback] = js.undefined
  var unmountBatchSize: js.UndefOr[scala.Double] = js.undefined
  var viewport: js.UndefOr[jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback] = js.undefined
}

object Anon_BatchSizeMountBatchSize {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    mountBatchSize: scala.Int | scala.Double = null,
    progress: jointjsLib.jointjsMod.diaNs.PaperNs.ProgressCallback = null,
    unmountBatchSize: scala.Int | scala.Double = null,
    viewport: jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback = null
  ): Anon_BatchSizeMountBatchSize = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (mountBatchSize != null) __obj.updateDynamic("mountBatchSize")(mountBatchSize.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (unmountBatchSize != null) __obj.updateDynamic("unmountBatchSize")(unmountBatchSize.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Anon_BatchSizeMountBatchSize]
  }
}

