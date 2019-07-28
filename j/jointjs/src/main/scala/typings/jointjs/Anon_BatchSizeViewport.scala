package typings.jointjs

import typings.jointjs.jointjsMod.diaNs.PaperNs.ViewportCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSizeViewport extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var viewport: js.UndefOr[ViewportCallback] = js.undefined
}

object Anon_BatchSizeViewport {
  @scala.inline
  def apply(batchSize: Int | Double = null, viewport: ViewportCallback = null): Anon_BatchSizeViewport = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Anon_BatchSizeViewport]
  }
}

