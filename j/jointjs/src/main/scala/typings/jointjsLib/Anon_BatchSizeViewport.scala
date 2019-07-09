package typings
package jointjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSizeViewport extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var viewport: js.UndefOr[jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback] = js.undefined
}

object Anon_BatchSizeViewport {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    viewport: jointjsLib.jointjsMod.diaNs.PaperNs.ViewportCallback = null
  ): Anon_BatchSizeViewport = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Anon_BatchSizeViewport]
  }
}

