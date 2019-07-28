package typings.istanbulDashLibDashSourceDashMaps.istanbulDashLibDashSourceDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-source-maps", "SourceStore")
@js.native
class SourceStore () extends js.Object {
  def getSource(filepath: String): String | Null = js.native
  def registerSource(filepath: String, sourceText: String): Unit = js.native
}

