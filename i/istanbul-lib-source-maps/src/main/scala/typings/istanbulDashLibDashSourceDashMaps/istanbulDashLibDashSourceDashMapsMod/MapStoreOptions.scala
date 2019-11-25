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
    val __obj = js.Dynamic.literal(baseDir = baseDir.asInstanceOf[js.Any], sourceStore = sourceStore.asInstanceOf[js.Any], tmpdir = tmpdir.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MapStoreOptions]
  }
}

