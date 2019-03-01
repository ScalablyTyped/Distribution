package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFOptions extends js.Object {
  var creator: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var imgDPI: js.UndefOr[scala.Double] = js.undefined
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  var landscape: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[js.Any] = js.undefined
  var paperSize: js.UndefOr[js.Any] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PDFOptions {
  @scala.inline
  def apply(
    creator: java.lang.String = null,
    date: stdLib.Date = null,
    imgDPI: scala.Int | scala.Double = null,
    keywords: java.lang.String = null,
    landscape: js.UndefOr[scala.Boolean] = js.undefined,
    margin: js.Any = null,
    paperSize: js.Any = null,
    subject: java.lang.String = null,
    title: java.lang.String = null
  ): PDFOptions = {
    val __obj = js.Dynamic.literal()
    if (creator != null) __obj.updateDynamic("creator")(creator)
    if (date != null) __obj.updateDynamic("date")(date)
    if (imgDPI != null) __obj.updateDynamic("imgDPI")(imgDPI.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords)
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PDFOptions]
  }
}

