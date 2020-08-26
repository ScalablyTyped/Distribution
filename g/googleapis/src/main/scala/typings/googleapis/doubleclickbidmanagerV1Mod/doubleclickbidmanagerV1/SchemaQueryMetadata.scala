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
  def apply(): SchemaQueryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryMetadata]
  }
  @scala.inline
  implicit class SchemaQueryMetadataOps[Self <: SchemaQueryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataRange(value: String): Self = this.set("dataRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRange: Self = this.set("dataRange", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setGoogleCloudStoragePathForLatestReport(value: String): Self = this.set("googleCloudStoragePathForLatestReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleCloudStoragePathForLatestReport: Self = this.set("googleCloudStoragePathForLatestReport", js.undefined)
    @scala.inline
    def setGoogleDrivePathForLatestReport(value: String): Self = this.set("googleDrivePathForLatestReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleDrivePathForLatestReport: Self = this.set("googleDrivePathForLatestReport", js.undefined)
    @scala.inline
    def setLatestReportRunTimeMs(value: String): Self = this.set("latestReportRunTimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestReportRunTimeMs: Self = this.set("latestReportRunTimeMs", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setReportCount(value: Double): Self = this.set("reportCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportCount: Self = this.set("reportCount", js.undefined)
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunning: Self = this.set("running", js.undefined)
    @scala.inline
    def setSendNotification(value: Boolean): Self = this.set("sendNotification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendNotification: Self = this.set("sendNotification", js.undefined)
    @scala.inline
    def setShareEmailAddressVarargs(value: String*): Self = this.set("shareEmailAddress", js.Array(value :_*))
    @scala.inline
    def setShareEmailAddress(value: js.Array[String]): Self = this.set("shareEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareEmailAddress: Self = this.set("shareEmailAddress", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

