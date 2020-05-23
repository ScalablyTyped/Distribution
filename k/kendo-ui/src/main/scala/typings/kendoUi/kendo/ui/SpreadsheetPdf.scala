package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetPdf extends js.Object {
  var area: js.UndefOr[String] = js.undefined
  var author: js.UndefOr[String] = js.undefined
  var creator: js.UndefOr[String] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var fitWidth: js.UndefOr[Boolean] = js.undefined
  var forceProxy: js.UndefOr[Boolean] = js.undefined
  var guidelines: js.UndefOr[Boolean] = js.undefined
  var hCenter: js.UndefOr[Boolean] = js.undefined
  var keywords: js.UndefOr[String] = js.undefined
  var landscape: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[SpreadsheetPdfMargin] = js.undefined
  var paperSize: js.UndefOr[String | js.Any] = js.undefined
  var proxyTarget: js.UndefOr[String] = js.undefined
  var proxyURL: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var vCenter: js.UndefOr[Boolean] = js.undefined
}

object SpreadsheetPdf {
  @scala.inline
  def apply(
    area: String = null,
    author: String = null,
    creator: String = null,
    date: Date = null,
    fileName: String = null,
    fitWidth: js.UndefOr[Boolean] = js.undefined,
    forceProxy: js.UndefOr[Boolean] = js.undefined,
    guidelines: js.UndefOr[Boolean] = js.undefined,
    hCenter: js.UndefOr[Boolean] = js.undefined,
    keywords: String = null,
    landscape: js.UndefOr[Boolean] = js.undefined,
    margin: SpreadsheetPdfMargin = null,
    paperSize: String | js.Any = null,
    proxyTarget: String = null,
    proxyURL: String = null,
    subject: String = null,
    title: String = null,
    vCenter: js.UndefOr[Boolean] = js.undefined
  ): SpreadsheetPdf = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (!js.isUndefined(fitWidth)) __obj.updateDynamic("fitWidth")(fitWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guidelines)) __obj.updateDynamic("guidelines")(guidelines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hCenter)) __obj.updateDynamic("hCenter")(hCenter.get.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape.get.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize.asInstanceOf[js.Any])
    if (proxyTarget != null) __obj.updateDynamic("proxyTarget")(proxyTarget.asInstanceOf[js.Any])
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(vCenter)) __obj.updateDynamic("vCenter")(vCenter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetPdf]
  }
}

