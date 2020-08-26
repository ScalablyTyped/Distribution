package typings.lunr.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lunr", "QueryParseError")
@js.native
class QueryParseError protected () extends Error {
  def this(message: String, start: String, end: String) = this()
  var end: Double = js.native
  @JSName("name")
  var name_QueryParseError: typings.lunr.lunrStrings.QueryParseError = js.native
  var start: Double = js.native
}

