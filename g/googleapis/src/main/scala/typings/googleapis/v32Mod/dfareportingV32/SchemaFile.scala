package typings.googleapis.v32Mod.dfareportingV32

import typings.googleapis.AnonApiUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a File resource. A file contains the metadata for a report run.
  * It shows the status of the run and holds the URLs to the generated report
  * data if the run is finished and the status is &quot;REPORT_AVAILABLE&quot;.
  */
@js.native
trait SchemaFile extends js.Object {
  /**
    * The date range for which the file has report data. The date range will
    * always be the absolute date range for which the report is run.
    */
  var dateRange: js.UndefOr[SchemaDateRange] = js.native
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The filename of the file.
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * The output format of the report. Only available once the file is
    * available.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The unique ID of this report file.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#file.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp in milliseconds since epoch when this file was last
    * modified.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /**
    * The ID of the report this file was generated from.
    */
  var reportId: js.UndefOr[String] = js.native
  /**
    * The status of the report file.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The URLs where the completed report file can be downloaded.
    */
  var urls: js.UndefOr[AnonApiUrl] = js.native
}

object SchemaFile {
  @scala.inline
  def apply(
    dateRange: SchemaDateRange = null,
    etag: String = null,
    fileName: String = null,
    format: String = null,
    id: String = null,
    kind: String = null,
    lastModifiedTime: String = null,
    reportId: String = null,
    status: String = null,
    urls: AnonApiUrl = null
  ): SchemaFile = {
    val __obj = js.Dynamic.literal()
    if (dateRange != null) __obj.updateDynamic("dateRange")(dateRange.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (reportId != null) __obj.updateDynamic("reportId")(reportId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFile]
  }
}

