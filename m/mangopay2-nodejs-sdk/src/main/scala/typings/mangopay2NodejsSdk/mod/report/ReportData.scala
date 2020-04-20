package typings.mangopay2NodejsSdk.mod.report

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTIONS
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportData extends EntityBaseData {
  /**
    * A URL that we will ping when the report is ready to download(works in a similar way to the hooks)
    */
  var CallbackURL: String
  /**
    * A list of columns / infos to show in the report
    */
  var Columns: js.Array[Column]
  /**
    * The format of the report download
    */
  var DownloadFormat: CSV
  /**
    * The URL to download the report
    */
  var DownloadURL: String
  /**
    * An object of various filters for the report
    */
  var Filters: typings.mangopay2NodejsSdk.mod.report.Filters
  /**
    * Whether the report should be limited to the first 10 lines(and therefore quicker to execute)
    */
  var Preview: Boolean
  /**
    * The date when the report was executed
    */
  var ReportDate: Timestamp
  /**
    * The type of report
    */
  var ReportType: TRANSACTIONS
  /**
    * The result code
    */
  var ResultCode: String
  /**
    * A verbal explanation of the ResultCode
    */
  var ResultMessage: String
  /**
    * The column to sort against and direction seperate by a `:`
    */
  var Sort: String
}

object ReportData {
  @scala.inline
  def apply(
    CallbackURL: String,
    Columns: js.Array[Column],
    CreationDate: Double,
    DownloadFormat: CSV,
    DownloadURL: String,
    Filters: Filters,
    Id: String,
    Preview: Boolean,
    ReportDate: Timestamp,
    ReportType: TRANSACTIONS,
    ResultCode: String,
    ResultMessage: String,
    Sort: String,
    Tag: String
  ): ReportData = {
    val __obj = js.Dynamic.literal(CallbackURL = CallbackURL.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DownloadFormat = DownloadFormat.asInstanceOf[js.Any], DownloadURL = DownloadURL.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], ReportDate = ReportDate.asInstanceOf[js.Any], ReportType = ReportType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Sort = Sort.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportData]
  }
}

