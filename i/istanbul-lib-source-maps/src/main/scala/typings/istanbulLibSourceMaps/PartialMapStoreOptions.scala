package typings.istanbulLibSourceMaps

import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.file
import typings.istanbulLibSourceMaps.istanbulLibSourceMapsStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<istanbul-lib-source-maps.istanbul-lib-source-maps.MapStoreOptions> */
trait PartialMapStoreOptions extends js.Object {
  var baseDir: js.UndefOr[String] = js.undefined
  var sourceStore: js.UndefOr[memory | file] = js.undefined
  var tmpdir: js.UndefOr[String] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialMapStoreOptions {
  @scala.inline
  def apply(
    baseDir: String = null,
    sourceStore: memory | file = null,
    tmpdir: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialMapStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (sourceStore != null) __obj.updateDynamic("sourceStore")(sourceStore.asInstanceOf[js.Any])
    if (tmpdir != null) __obj.updateDynamic("tmpdir")(tmpdir.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMapStoreOptions]
  }
}

