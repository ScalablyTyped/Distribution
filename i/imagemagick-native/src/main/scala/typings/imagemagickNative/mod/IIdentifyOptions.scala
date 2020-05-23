package typings.imagemagickNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIdentifyOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  var srcData: Buffer
}

object IIdentifyOptions {
  @scala.inline
  def apply(
    srcData: Buffer,
    debug: js.UndefOr[Boolean] = js.undefined,
    ignoreWarnings: js.UndefOr[Boolean] = js.undefined
  ): IIdentifyOptions = {
    val __obj = js.Dynamic.literal(srcData = srcData.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreWarnings)) __obj.updateDynamic("ignoreWarnings")(ignoreWarnings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIdentifyOptions]
  }
}

