package typings.jodata.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jo.Concat")
@js.native
class Concat protected () extends js.Object {
  def this(value1: String, value2: String) = this()
  def this(value1: String, value2: Concat) = this()
  def this(value1: Concat, value2: String) = this()
  def this(value1: Concat, value2: Concat) = this()
  var LeftSide: String | Concat = js.native
  var RightSide: String | Concat = js.native
}

