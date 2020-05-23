package typings.mangopay2NodejsSdk.mod.report

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.ReportData, 'Tag' | 'CallbackURL' | 'DownloadFormat' | 'Sort' | 'Preview' | 'Filters' | 'Columns'> */
trait CreateReport extends js.Object {
  var CallbackURL: js.UndefOr[String] = js.undefined
  var Columns: js.UndefOr[js.Array[Column]] = js.undefined
  var DownloadFormat: js.UndefOr[CSV] = js.undefined
  var Filters: js.UndefOr[typings.mangopay2NodejsSdk.mod.report.Filters] = js.undefined
  var Preview: js.UndefOr[Boolean] = js.undefined
  var Sort: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateReport {
  @scala.inline
  def apply(
    CallbackURL: String = null,
    Columns: js.Array[Column] = null,
    DownloadFormat: CSV = null,
    Filters: Filters = null,
    Preview: js.UndefOr[Boolean] = js.undefined,
    Sort: String = null,
    Tag: String = null
  ): CreateReport = {
    val __obj = js.Dynamic.literal()
    if (CallbackURL != null) __obj.updateDynamic("CallbackURL")(CallbackURL.asInstanceOf[js.Any])
    if (Columns != null) __obj.updateDynamic("Columns")(Columns.asInstanceOf[js.Any])
    if (DownloadFormat != null) __obj.updateDynamic("DownloadFormat")(DownloadFormat.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (!js.isUndefined(Preview)) __obj.updateDynamic("Preview")(Preview.get.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReport]
  }
}

