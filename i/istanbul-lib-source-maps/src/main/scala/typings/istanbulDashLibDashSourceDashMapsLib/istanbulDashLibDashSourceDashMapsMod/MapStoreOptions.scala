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
    val __obj = js.Dynamic.literal(baseDir = baseDir, sourceStore = sourceStore.asInstanceOf[js.Any], tmpdir = tmpdir, verbose = verbose)
  
    __obj.asInstanceOf[MapStoreOptions]
  }
}

