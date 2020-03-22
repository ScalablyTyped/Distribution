package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTIONS
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.report.Column
import typings.mangopay2NodejsSdk.mod.report.Filters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.ReportData> */
trait PartialReportData extends js.Object {
  var CallbackURL: js.UndefOr[String] = js.undefined
  var Columns: js.UndefOr[js.Array[Column]] = js.undefined
  var CreationDate: js.UndefOr[Double] = js.undefined
  var DownloadFormat: js.UndefOr[CSV] = js.undefined
  var DownloadURL: js.UndefOr[String] = js.undefined
  var Filters: js.UndefOr[typings.mangopay2NodejsSdk.mod.report.Filters] = js.undefined
  var Id: js.UndefOr[String] = js.undefined
  var Preview: js.UndefOr[Boolean] = js.undefined
  var ReportDate: js.UndefOr[Timestamp] = js.undefined
  var ReportType: js.UndefOr[TRANSACTIONS] = js.undefined
  var ResultCode: js.UndefOr[String] = js.undefined
  var ResultMessage: js.UndefOr[String] = js.undefined
  var Sort: js.UndefOr[String] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object PartialReportData {
  @scala.inline
  def apply(
    CallbackURL: String = null,
    Columns: js.Array[Column] = null,
    CreationDate: Int | Double = null,
    DownloadFormat: CSV = null,
    DownloadURL: String = null,
    Filters: Filters = null,
    Id: String = null,
    Preview: js.UndefOr[Boolean] = js.undefined,
    ReportDate: Int | Double = null,
    ReportType: TRANSACTIONS = null,
    ResultCode: String = null,
    ResultMessage: String = null,
    Sort: String = null,
    Tag: String = null
  ): PartialReportData = {
    val __obj = js.Dynamic.literal()
    if (CallbackURL != null) __obj.updateDynamic("CallbackURL")(CallbackURL.asInstanceOf[js.Any])
    if (Columns != null) __obj.updateDynamic("Columns")(Columns.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (DownloadFormat != null) __obj.updateDynamic("DownloadFormat")(DownloadFormat.asInstanceOf[js.Any])
    if (DownloadURL != null) __obj.updateDynamic("DownloadURL")(DownloadURL.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (!js.isUndefined(Preview)) __obj.updateDynamic("Preview")(Preview.asInstanceOf[js.Any])
    if (ReportDate != null) __obj.updateDynamic("ReportDate")(ReportDate.asInstanceOf[js.Any])
    if (ReportType != null) __obj.updateDynamic("ReportType")(ReportType.asInstanceOf[js.Any])
    if (ResultCode != null) __obj.updateDynamic("ResultCode")(ResultCode.asInstanceOf[js.Any])
    if (ResultMessage != null) __obj.updateDynamic("ResultMessage")(ResultMessage.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialReportData]
  }
}

