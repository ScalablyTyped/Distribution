package typings.hexoUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoDetect extends js.Object {
  var autoDetect: js.UndefOr[Boolean] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var firstLine: js.UndefOr[Double] = js.undefined
  var gutter: js.UndefOr[Boolean] = js.undefined
  var hljs: js.UndefOr[Boolean] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var mark: js.UndefOr[js.Array[Double]] = js.undefined
  var tab: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object AnonAutoDetect {
  @scala.inline
  def apply(
    autoDetect: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    firstLine: Int | Double = null,
    gutter: js.UndefOr[Boolean] = js.undefined,
    hljs: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    mark: js.Array[Double] = null,
    tab: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoDetect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDetect)) __obj.updateDynamic("autoDetect")(autoDetect.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (firstLine != null) __obj.updateDynamic("firstLine")(firstLine.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (!js.isUndefined(hljs)) __obj.updateDynamic("hljs")(hljs.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoDetect]
  }
}

