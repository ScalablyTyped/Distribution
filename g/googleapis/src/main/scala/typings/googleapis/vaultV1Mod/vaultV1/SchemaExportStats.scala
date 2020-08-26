package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stats of an export.
  */
@js.native
trait SchemaExportStats extends js.Object {
  /**
    * The number of documents already processed by the export.
    */
  var exportedArtifactCount: js.UndefOr[String] = js.native
  /**
    * The size of export in bytes.
    */
  var sizeInBytes: js.UndefOr[String] = js.native
  /**
    * The number of documents to be exported.
    */
  var totalArtifactCount: js.UndefOr[String] = js.native
}

object SchemaExportStats {
  @scala.inline
  def apply(): SchemaExportStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExportStats]
  }
  @scala.inline
  implicit class SchemaExportStatsOps[Self <: SchemaExportStats] (val x: Self) extends AnyVal {
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
    def setExportedArtifactCount(value: String): Self = this.set("exportedArtifactCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportedArtifactCount: Self = this.set("exportedArtifactCount", js.undefined)
    @scala.inline
    def setSizeInBytes(value: String): Self = this.set("sizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeInBytes: Self = this.set("sizeInBytes", js.undefined)
    @scala.inline
    def setTotalArtifactCount(value: String): Self = this.set("totalArtifactCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalArtifactCount: Self = this.set("totalArtifactCount", js.undefined)
  }
  
}

