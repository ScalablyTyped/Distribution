package typings
package istanbulDashLibDashSourceDashMapsLib.istanbulDashLibDashSourceDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStoreOptions extends js.Object {
  var baseDir: java.lang.String
  var sourceStore: istanbulDashLibDashSourceDashMapsLib.istanbulDashLibDashSourceDashMapsLibStrings.memory | istanbulDashLibDashSourceDashMapsLib.istanbulDashLibDashSourceDashMapsLibStrings.file
  var tmpdir: java.lang.String
  var verbose: scala.Boolean
}

object MapStoreOptions {
  @scala.inline
  def apply(
    baseDir: java.lang.String,
    sourceStore: istanbulDashLibDashSourceDashMapsLib.istanbulDashLibDashSourceDashMapsLibStrings.memory | istanbulDashLibDashSourceDashMapsLib.istanbulDashLibDashSourceDashMapsLibStrings.file,
    tmpdir: java.lang.String,
    verbose: scala.Boolean
  ): MapStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baseDir")(baseDir)
    __obj.updateDynamic("sourceStore")(sourceStore.asInstanceOf[js.Any])
    __obj.updateDynamic("tmpdir")(tmpdir)
    __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[MapStoreOptions]
  }
}

