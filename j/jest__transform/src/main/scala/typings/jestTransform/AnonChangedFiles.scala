package typings.jestTransform

import typings.jestTypes.configMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangedFiles extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.undefined
}

object AnonChangedFiles {
  @scala.inline
  def apply(changedFiles: Set[Path] = null): AnonChangedFiles = {
    val __obj = js.Dynamic.literal()
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangedFiles]
  }
}

