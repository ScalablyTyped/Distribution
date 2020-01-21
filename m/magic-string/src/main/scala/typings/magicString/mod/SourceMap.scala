package typings.magicString.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("magic-string", "SourceMap")
@js.native
class SourceMap protected () extends js.Object {
  def this(properties: DecodedSourceMap) = this()
  var file: String = js.native
  var mappings: String = js.native
  var names: js.Array[String] = js.native
  var sources: js.Array[String] = js.native
  var sourcesContent: js.Array[String] = js.native
  var version: Double = js.native
  def toUrl(): String = js.native
}

