package typings.ionic.projectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPackagePathOptions extends js.Object {
  var emulator: js.UndefOr[Boolean] = js.undefined
  var release: js.UndefOr[Boolean] = js.undefined
}

object GetPackagePathOptions {
  @scala.inline
  def apply(emulator: js.UndefOr[Boolean] = js.undefined, release: js.UndefOr[Boolean] = js.undefined): GetPackagePathOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emulator)) __obj.updateDynamic("emulator")(emulator.asInstanceOf[js.Any])
    if (!js.isUndefined(release)) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPackagePathOptions]
  }
}

