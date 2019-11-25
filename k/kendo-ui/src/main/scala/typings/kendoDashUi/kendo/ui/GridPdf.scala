package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridPdf extends js.Object {
  var allPages: js.UndefOr[Boolean] = js.undefined
  var author: js.UndefOr[String] = js.undefined
  var avoidLinks: js.UndefOr[Boolean | String] = js.undefined
  var creator: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  var keywords: js.UndefOr[String] = js.undefined
  var landscape: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[GridPdfMargin] = js.undefined
  var paperSize: js.UndefOr[String | js.Any] = js.undefined
  var proxyTarget: js.UndefOr[String] = js.undefined
  var proxyURL: js.UndefOr[String] = js.undefined
  var repeatHeaders: js.UndefOr[Boolean] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object GridPdf {
  @scala.inline
  def apply(
    allPages: js.UndefOr[Boolean] = js.undefined,
    author: String = null,
    avoidLinks: Boolean | String = null,
    creator: String = null,
    date: Date = null,
    fileName: String = null,
    forceProxy: js.UndefOr[Boolean] = js.undefined,
    keywords: String = null,
    landscape: js.UndefOr[Boolean] = js.undefined,
    margin: GridPdfMargin = null,
    paperSize: String | js.Any = null,
    proxyTarget: String = null,
    proxyURL: String = null,
    repeatHeaders: js.UndefOr[Boolean] = js.undefined,
    scale: Int | Double = null,
    subject: String = null,
    template: String = null,
    title: String = null
  ): GridPdf = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allPages)) __obj.updateDynamic("allPages")(allPages.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (avoidLinks != null) __obj.updateDynamic("avoidLinks")(avoidLinks.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize.asInstanceOf[js.Any])
    if (proxyTarget != null) __obj.updateDynamic("proxyTarget")(proxyTarget.asInstanceOf[js.Any])
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatHeaders)) __obj.updateDynamic("repeatHeaders")(repeatHeaders.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridPdf]
  }
}

