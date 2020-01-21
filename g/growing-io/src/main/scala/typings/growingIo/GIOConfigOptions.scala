package typings.growingIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GIOConfigOptions extends js.Object {
  /** 是否采集数据 */
  var dataCollect: js.UndefOr[Boolean] = js.undefined
  /** 是否检测hash变化 */
  var hashtag: js.UndefOr[Boolean] = js.undefined
}

object GIOConfigOptions {
  @scala.inline
  def apply(dataCollect: js.UndefOr[Boolean] = js.undefined, hashtag: js.UndefOr[Boolean] = js.undefined): GIOConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataCollect)) __obj.updateDynamic("dataCollect")(dataCollect.asInstanceOf[js.Any])
    if (!js.isUndefined(hashtag)) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIOConfigOptions]
  }
}

