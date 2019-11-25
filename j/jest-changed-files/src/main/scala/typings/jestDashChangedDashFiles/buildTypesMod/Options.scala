package typings.jestDashChangedDashFiles.buildTypesMod

import typings.atJestTypes.buildConfigMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var changedSince: js.UndefOr[String] = js.undefined
  var includePaths: js.UndefOr[js.Array[Path]] = js.undefined
  var lastCommit: js.UndefOr[Boolean] = js.undefined
  var withAncestor: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    changedSince: String = null,
    includePaths: js.Array[Path] = null,
    lastCommit: js.UndefOr[Boolean] = js.undefined,
    withAncestor: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (changedSince != null) __obj.updateDynamic("changedSince")(changedSince.asInstanceOf[js.Any])
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths.asInstanceOf[js.Any])
    if (!js.isUndefined(lastCommit)) __obj.updateDynamic("lastCommit")(lastCommit.asInstanceOf[js.Any])
    if (!js.isUndefined(withAncestor)) __obj.updateDynamic("withAncestor")(withAncestor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

