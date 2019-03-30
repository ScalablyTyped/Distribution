package typings
package html5DashToDashPdfLib.html5DashToDashPdfMod.HTML5ToPDFNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyOptions extends js.Object {
  /**
    * [COMPATIBLE]\
    * True for landscape, false for portrait.
    */
  var landscape: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [NOT COMPATIBLE]\
    * 0 - default\
    * 1 - none\
    * 2 - minimum
    */
  var marginsType: js.UndefOr[scala.Double] = js.undefined
  /**
    * [COMPATIBLE]\
    * Page size
    */
  var pageSize: js.UndefOr[
    html5DashToDashPdfLib.html5DashToDashPdfLibStrings.A3 | html5DashToDashPdfLib.html5DashToDashPdfLibStrings.A4 | html5DashToDashPdfLib.html5DashToDashPdfLibStrings.Legal | html5DashToDashPdfLib.html5DashToDashPdfLibStrings.Tabloid
  ] = js.undefined
  /**
    * [COMPATIBLE]\
    * Whether to print CSS backgrounds.
    */
  var printBackground: js.UndefOr[scala.Boolean] = js.undefined
}

object LegacyOptions {
  @scala.inline
  def apply(
    landscape: js.UndefOr[scala.Boolean] = js.undefined,
    marginsType: scala.Int | scala.Double = null,
    pageSize: html5DashToDashPdfLib.html5DashToDashPdfLibStrings.A3 | html5DashToDashPdfLib.html5DashToDashPdfLibStrings.A4 | html5DashToDashPdfLib.html5DashToDashPdfLibStrings.Legal | html5DashToDashPdfLib.html5DashToDashPdfLibStrings.Tabloid = null,
    printBackground: js.UndefOr[scala.Boolean] = js.undefined
  ): LegacyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(landscape)) __obj.updateDynamic("landscape")(landscape)
    if (marginsType != null) __obj.updateDynamic("marginsType")(marginsType.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(printBackground)) __obj.updateDynamic("printBackground")(printBackground)
    __obj.asInstanceOf[LegacyOptions]
  }
}

