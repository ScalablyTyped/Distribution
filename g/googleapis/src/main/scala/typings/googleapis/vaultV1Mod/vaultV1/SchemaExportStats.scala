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
  def apply(
    exportedArtifactCount: String = null,
    sizeInBytes: String = null,
    totalArtifactCount: String = null
  ): SchemaExportStats = {
    val __obj = js.Dynamic.literal()
    if (exportedArtifactCount != null) __obj.updateDynamic("exportedArtifactCount")(exportedArtifactCount.asInstanceOf[js.Any])
    if (sizeInBytes != null) __obj.updateDynamic("sizeInBytes")(sizeInBytes.asInstanceOf[js.Any])
    if (totalArtifactCount != null) __obj.updateDynamic("totalArtifactCount")(totalArtifactCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaExportStats]
  }
}

