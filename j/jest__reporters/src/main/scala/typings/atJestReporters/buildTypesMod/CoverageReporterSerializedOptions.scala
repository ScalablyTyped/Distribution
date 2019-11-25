package typings.atJestReporters.buildTypesMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageReporterSerializedOptions extends js.Object {
  var changedFiles: js.UndefOr[js.Array[Path]] = js.undefined
}

object CoverageReporterSerializedOptions {
  @scala.inline
  def apply(changedFiles: js.Array[Path] = null): CoverageReporterSerializedOptions = {
    val __obj = js.Dynamic.literal()
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageReporterSerializedOptions]
  }
}

