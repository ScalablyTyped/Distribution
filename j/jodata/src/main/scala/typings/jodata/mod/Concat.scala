package typings.jodata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jodata", "Concat")
@js.native
class Concat protected ()
  extends typings.jodata.jo.Concat {
  def this(value1: String, value2: String) = this()
  def this(value1: String, value2: typings.jodata.jo.Concat) = this()
  def this(value1: typings.jodata.jo.Concat, value2: String) = this()
  def this(value1: typings.jodata.jo.Concat, value2: typings.jodata.jo.Concat) = this()
  /* CompleteClass */
  override var LeftSide: String | typings.jodata.jo.Concat = js.native
  /* CompleteClass */
  override var RightSide: String | typings.jodata.jo.Concat = js.native
}

