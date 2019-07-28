package typings.jointjs

import typings.jointjs.jointjsMod.diaNs.PaperNs.ProgressCallback
import typings.jointjs.jointjsMod.diaNs.PaperNs.ViewportCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSizeMountBatchSize extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var mountBatchSize: js.UndefOr[Double] = js.undefined
  var progress: js.UndefOr[ProgressCallback] = js.undefined
  var unmountBatchSize: js.UndefOr[Double] = js.undefined
  var viewport: js.UndefOr[ViewportCallback] = js.undefined
}

object Anon_BatchSizeMountBatchSize {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    mountBatchSize: Int | Double = null,
    progress: ProgressCallback = null,
    unmountBatchSize: Int | Double = null,
    viewport: ViewportCallback = null
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

