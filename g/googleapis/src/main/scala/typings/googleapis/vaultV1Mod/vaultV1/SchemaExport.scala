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
  def apply(): SchemaExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExport]
  }
  @scala.inline
  implicit class SchemaExportOps[Self <: SchemaExport] (val x: Self) extends AnyVal {
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
    def setCloudStorageSink(value: SchemaCloudStorageSink): Self = this.set("cloudStorageSink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudStorageSink: Self = this.set("cloudStorageSink", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setExportOptions(value: SchemaExportOptions): Self = this.set("exportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportOptions: Self = this.set("exportOptions", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMatterId(value: String): Self = this.set("matterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatterId: Self = this.set("matterId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setQuery(value: SchemaQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setRequester(value: SchemaUserInfo): Self = this.set("requester", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    @scala.inline
    def setStats(value: SchemaExportStats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

