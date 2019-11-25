package typings.atJestReporters.buildTypesMod

import typings.atJestTypes.buildConfigMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageReporterOptions extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.undefined
}

object CoverageReporterOptions {
  @scala.inline
  def apply(changedFiles: Set[Path] = null): CoverageReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageReporterOptions]
  }
}

