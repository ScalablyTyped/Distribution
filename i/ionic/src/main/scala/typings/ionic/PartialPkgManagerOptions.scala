package typings.ionic

import typings.ionic.npmMod.PkgManagerCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ionic.ionic/lib/utils/npm.PkgManagerOptions> */
trait PartialPkgManagerOptions extends js.Object {
  var command: js.UndefOr[PkgManagerCommand] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var pkg: js.UndefOr[String] = js.undefined
  var save: js.UndefOr[Boolean] = js.undefined
  var saveDev: js.UndefOr[Boolean] = js.undefined
  var saveExact: js.UndefOr[Boolean] = js.undefined
  var script: js.UndefOr[String] = js.undefined
  var scriptArgs: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialPkgManagerOptions {
  @scala.inline
  def apply(
    command: PkgManagerCommand = null,
    global: js.UndefOr[Boolean] = js.undefined,
    json: js.UndefOr[Boolean] = js.undefined,
    pkg: String = null,
    save: js.UndefOr[Boolean] = js.undefined,
    saveDev: js.UndefOr[Boolean] = js.undefined,
    saveExact: js.UndefOr[Boolean] = js.undefined,
    script: String = null,
    scriptArgs: js.Array[String] = null
  ): PartialPkgManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (pkg != null) __obj.updateDynamic("pkg")(pkg.asInstanceOf[js.Any])
    if (!js.isUndefined(save)) __obj.updateDynamic("save")(save.asInstanceOf[js.Any])
    if (!js.isUndefined(saveDev)) __obj.updateDynamic("saveDev")(saveDev.asInstanceOf[js.Any])
    if (!js.isUndefined(saveExact)) __obj.updateDynamic("saveExact")(saveExact.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (scriptArgs != null) __obj.updateDynamic("scriptArgs")(scriptArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPkgManagerOptions]
  }
}

