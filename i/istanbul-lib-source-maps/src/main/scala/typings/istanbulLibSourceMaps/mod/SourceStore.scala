package typings.istanbulLibSourceMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("istanbul-lib-source-maps", "SourceStore")
@js.native
class SourceStore () extends js.Object {
  
  def getSource(filepath: String): String | Null = js.native
  
  def registerSource(filepath: String, sourceText: String): Unit = js.native
}
