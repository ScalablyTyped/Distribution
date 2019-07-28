package typings.jointjs

import typings.jointjs.jointjsMod.diaNs.PaperNs.ViewportCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MountBatchSize extends js.Object {
  var mountBatchSize: js.UndefOr[Double] = js.undefined
  var unmountBatchSize: js.UndefOr[Double] = js.undefined
  var viewport: js.UndefOr[ViewportCallback] = js.undefined
}

object Anon_MountBatchSize {
  @scala.inline
  def apply(
    mountBatchSize: Int | Double = null,
    unmountBatchSize: Int | Double = null,
    viewport: ViewportCallback = null
  ): Anon_MountBatchSize = {
    val __obj = js.Dynamic.literal()
    if (mountBatchSize != null) __obj.updateDynamic("mountBatchSize")(mountBatchSize.asInstanceOf[js.Any])
    if (unmountBatchSize != null) __obj.updateDynamic("unmountBatchSize")(unmountBatchSize.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Anon_MountBatchSize]
  }
}

