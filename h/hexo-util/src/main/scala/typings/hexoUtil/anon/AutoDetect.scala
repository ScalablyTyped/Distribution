package typings.hexoUtil.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoDetect extends js.Object {
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

object AutoDetect {
  @scala.inline
  def apply(
    autoDetect: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    firstLine: js.UndefOr[Double] = js.undefined,
    gutter: js.UndefOr[Boolean] = js.undefined,
    hljs: js.UndefOr[Boolean] = js.undefined,
    lang: String = null,
    mark: js.Array[Double] = null,
    tab: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): AutoDetect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDetect)) __obj.updateDynamic("autoDetect")(autoDetect.get.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (!js.isUndefined(firstLine)) __obj.updateDynamic("firstLine")(firstLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gutter)) __obj.updateDynamic("gutter")(gutter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hljs)) __obj.updateDynamic("hljs")(hljs.get.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDetect]
  }
}

