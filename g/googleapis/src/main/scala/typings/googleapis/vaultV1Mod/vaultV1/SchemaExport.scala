package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An export
  */
@js.native
trait SchemaExport extends js.Object {
  /**
    * Output only. Export sink for cloud storage files.
    */
  var cloudStorageSink: js.UndefOr[SchemaCloudStorageSink] = js.native
  /**
    * Output only. The time when the export was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Advanced options of the export.
    */
  var exportOptions: js.UndefOr[SchemaExportOptions] = js.native
  /**
    * Output only. The generated export ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The export name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The search query being exported.
    */
  var query: js.UndefOr[SchemaQuery] = js.native
  /**
    * Output only. The requester of the export.
    */
  var requester: js.UndefOr[SchemaUserInfo] = js.native
  /**
    * Output only. Export statistics.
    */
  var stats: js.UndefOr[SchemaExportStats] = js.native
  /**
    * Output only. The export status.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaExport {
  @scala.inline
  def apply(
    cloudStorageSink: SchemaCloudStorageSink = null,
    createTime: String = null,
    exportOptions: SchemaExportOptions = null,
    id: String = null,
    matterId: String = null,
    name: String = null,
    query: SchemaQuery = null,
    requester: SchemaUserInfo = null,
    stats: SchemaExportStats = null,
    status: String = null
  ): SchemaExport = {
    val __obj = js.Dynamic.literal()
    if (cloudStorageSink != null) __obj.updateDynamic("cloudStorageSink")(cloudStorageSink.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (exportOptions != null) __obj.updateDynamic("exportOptions")(exportOptions.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (matterId != null) __obj.updateDynamic("matterId")(matterId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExport]
  }
}

