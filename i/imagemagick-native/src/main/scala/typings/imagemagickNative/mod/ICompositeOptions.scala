package typings.imagemagickNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeOptions extends js.Object {
  var compositeData: Buffer
  var debug: js.UndefOr[Boolean] = js.undefined
  var gravity: js.UndefOr[String] = js.undefined
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  var srcData: Buffer
}

object ICompositeOptions {
  @scala.inline
  def apply(
    compositeData: Buffer,
    srcData: Buffer,
    debug: js.UndefOr[Boolean] = js.undefined,
    gravity: String = null,
    ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  ): ICompositeOptions = {
    val __obj = js.Dynamic.literal(compositeData = compositeData.asInstanceOf[js.Any], srcData = srcData.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompositeOptions]
  }
}

