package typings.istanbulDashLibDashSourceDashMaps.istanbulDashLibDashSourceDashMapsMod

import typings.istanbulDashLibDashSourceDashMaps.istanbulDashLibDashSourceDashMapsStrings.file
import typings.istanbulDashLibDashSourceDashMaps.istanbulDashLibDashSourceDashMapsStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStoreOptions extends js.Object {
  var baseDir: String
  var sourceStore: memory | file
  var tmpdir: String
  var verbose: Boolean
}

object MapStoreOptions {
  @scala.inline
  def apply(baseDir: String, sourceStore: memory | file, tmpdir: String, verbose: Boolean): MapStoreOptions = {
    val __obj = js.Dynamic.literal(baseDir = baseDir, sourceStore = sourceStore.asInstanceOf[js.Any], tmpdir = tmpdir, verbose = verbose)
  
    __obj.asInstanceOf[MapStoreOptions]
  }
}

