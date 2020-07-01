package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Query metadata.
  */
@js.native
trait SchemaQueryMetadata extends js.Object {
  /**
    * Range of report data.
    */
  var dataRange: js.UndefOr[String] = js.native
  /**
    * Format of the generated report.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The path to the location in Google Cloud Storage where the latest report
    * is stored.
    */
  var googleCloudStoragePathForLatestReport: js.UndefOr[String] = js.native
  /**
    * The path in Google Drive for the latest report.
    */
  var googleDrivePathForLatestReport: js.UndefOr[String] = js.native
  /**
    * The time when the latest report started to run.
    */
  var latestReportRunTimeMs: js.UndefOr[String] = js.native
  /**
    * Locale of the generated reports. Valid values are cs CZECH de GERMAN en
    * ENGLISH es SPANISH fr FRENCH it ITALIAN ja JAPANESE ko KOREAN pl POLISH
    * pt-BR BRAZILIAN_PORTUGUESE ru RUSSIAN tr TURKISH uk UKRAINIAN zh-CN
    * CHINA_CHINESE zh-TW TAIWAN_CHINESE  An locale string not in the list
    * above will generate reports in English.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Number of reports that have been generated for the query.
    */
  var reportCount: js.UndefOr[Double] = js.native
  /**
    * Whether the latest report is currently running.
    */
  var running: js.UndefOr[Boolean] = js.native
  /**
    * Whether to send an email notification when a report is ready. Default to
    * false.
    */
  var sendNotification: js.UndefOr[Boolean] = js.native
  /**
    * List of email addresses which are sent email notifications when the
    * report is finished. Separate from sendNotification.
    */
  var shareEmailAddress: js.UndefOr[js.Array[String]] = js.native
  /**
    * Query title. It is used to name the reports generated from this query.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaQueryMetadata {
  @scala.inline
  def apply(
    dataRange: String = null,
    format: String = null,
    googleCloudStoragePathForLatestReport: String = null,
    googleDrivePathForLatestReport: String = null,
    latestReportRunTimeMs: String = null,
    locale: String = null,
    reportCount: js.UndefOr[Double] = js.undefined,
    running: js.UndefOr[Boolean] = js.undefined,
    sendNotification: js.UndefOr[Boolean] = js.undefined,
    shareEmailAddress: js.Array[String] = null,
    title: String = null
  ): SchemaQueryMetadata = {
    val __obj = js.Dynamic.literal()
    if (dataRange != null) __obj.updateDynamic("dataRange")(dataRange.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (googleCloudStoragePathForLatestReport != null) __obj.updateDynamic("googleCloudStoragePathForLatestReport")(googleCloudStoragePathForLatestReport.asInstanceOf[js.Any])
    if (googleDrivePathForLatestReport != null) __obj.updateDynamic("googleDrivePathForLatestReport")(googleDrivePathForLatestReport.asInstanceOf[js.Any])
    if (latestReportRunTimeMs != null) __obj.updateDynamic("latestReportRunTimeMs")(latestReportRunTimeMs.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(reportCount)) __obj.updateDynamic("reportCount")(reportCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(running)) __obj.updateDynamic("running")(running.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sendNotification)) __obj.updateDynamic("sendNotification")(sendNotification.get.asInstanceOf[js.Any])
    if (shareEmailAddress != null) __obj.updateDynamic("shareEmailAddress")(shareEmailAddress.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryMetadata]
  }
}

