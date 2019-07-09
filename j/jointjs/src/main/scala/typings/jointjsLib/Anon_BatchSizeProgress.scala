package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSizeProgress extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var progress: js.UndefOr[jointjsLib.jointjsMod.diaNs.PaperNs.ProgressCallback] = js.undefined
  var viewport: js.UndefOr[jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback] = js.undefined
}

object Anon_BatchSizeProgress {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    progress: jointjsLib.jointjsMod.diaNs.PaperNs.ProgressCallback = null,
    viewport: jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback = null
  ): Anon_BatchSizeProgress = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Anon_BatchSizeProgress]
  }
}

