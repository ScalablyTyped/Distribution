package typings.atJestTransform

import typings.atJestTypes.buildConfigMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedFiles extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.undefined
}

object Anon_ChangedFiles {
  @scala.inline
  def apply(changedFiles: Set[Path] = null): Anon_ChangedFiles = {
    val __obj = js.Dynamic.literal()
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChangedFiles]
  }
}

