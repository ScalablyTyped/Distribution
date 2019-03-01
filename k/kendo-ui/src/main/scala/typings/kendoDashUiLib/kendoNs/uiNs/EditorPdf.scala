package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorPdf extends js.Object {
  var author: js.UndefOr[java.lang.String] = js.undefined
  var avoidLinks: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var creator: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var forceProxy: js.UndefOr[scala.Boolean] = js.undefined
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  var landscape: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[EditorPdfMargin] = js.undefined
  var paperSize: js.UndefOr[java.lang.String | js.Any] = js.undefined
  var proxyTarget: js.UndefOr[java.lang.String] = js.undefined
  var proxyURL: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object EditorPdf {
  @scala.inline
  def apply(
    author: java.lang.String = null,
    avoidLinks: scala.Boolean | java.lang.String = null,
    creator: java.lang.String = null,
    date: stdLib.Date = null,
    fileName: java.lang.String = null,
    forceProxy: js.UndefOr[scala.Boolean] = js.undefined,
    keywords: java.lang.String = null,
    landscape: js.UndefOr[scala.Boolean] = js.undefined,
    margin: EditorPdfMargin = null,
    paperSize: java.lang.String | js.Any = null,
    proxyTarget: java.lang.String = null,
    proxyURL: java.lang.String = null,
    subject: java.lang.String = null,
    title: java.lang.String = null
  ): EditorPdf = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author)
    if (avoidLinks != null) __obj.updateDynamic("avoidLinks")(avoidLinks.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator)
    if (date != null) __obj.updateDynamic("date")(date)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (!js.isUndefined(forceProxy)) __obj.updateDynamic("forceProxy")(forceProxy)
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize.asInstanceOf[js.Any])
    if (proxyTarget != null) __obj.updateDynamic("proxyTarget")(proxyTarget)
    if (proxyURL != null) __obj.updateDynamic("proxyURL")(proxyURL)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[EditorPdf]
  }
}

