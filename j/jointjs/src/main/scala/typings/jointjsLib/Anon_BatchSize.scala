package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSize extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var mountBatchSize: js.UndefOr[scala.Double] = js.undefined
  var progress: js.UndefOr[jointjsLib.jointjsMod.diaNs.PaperNs.ProgressCallback] = js.undefined
  var unmountBatchSize: js.UndefOr[scala.Double] = js.undefined
  var viewport: js.UndefOr[jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback] = js.undefined
}

object Anon_BatchSize {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    mountBatchSize: scala.Int | scala.Double = null,
    progress: jointjsLib.jointjsMod.diaNs.PaperNs.ProgressCallback = null,
    unmountBatchSize: scala.Int | scala.Double = null,
    viewport: jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback = null
  ): Anon_BatchSize = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (mountBatchSize != null) __obj.updateDynamic("mountBatchSize")(mountBatchSize.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (unmountBatchSize != null) __obj.updateDynamic("unmountBatchSize")(unmountBatchSize.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Anon_BatchSize]
  }
}

