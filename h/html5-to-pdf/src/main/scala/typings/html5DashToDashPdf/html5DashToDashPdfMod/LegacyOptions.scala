package typings.html5DashToDashPdf.html5DashToDashPdfMod

import typings.html5DashToDashPdf.html5DashToDashPdfStrings.A3
import typings.html5DashToDashPdf.html5DashToDashPdfStrings.A4
import typings.html5DashToDashPdf.html5DashToDashPdfStrings.Legal
import typings.html5DashToDashPdf.html5DashToDashPdfStrings.Tabloid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyOptions extends js.Object {
  /**
    * [COMPATIBLE]\
    * True for landscape, false for portrait.
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
  /**
    * [NOT COMPATIBLE]\
    * 0 - default\
    * 1 - none\
    * 2 - minimum
    */
  var marginsType: js.UndefOr[Double] = js.undefined
  /**
    * [COMPATIBLE]\
    * Page size
    */
  var pageSize: js.UndefOr[A3 | A4 | Legal | Tabloid] = js.undefined
  /**
    * [COMPATIBLE]\
    * Whether to print CSS backgrounds.
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
}

object LegacyOptions {
  @scala.inline
  def apply(
    landscape: js.UndefOr[Boolean] = js.undefined,
    marginsType: Int | Double = null,
    pageSize: A3 | A4 | Legal | Tabloid = null,
    printBackground: js.UndefOr[Boolean] = js.undefined
  ): LegacyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape.asInstanceOf[js.Any])
    if (marginsType != null) __obj.updateDynamic("marginsType")(marginsType.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(printBackground)) __obj.updateDynamic("printBackground")(printBackground.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyOptions]
  }
}

