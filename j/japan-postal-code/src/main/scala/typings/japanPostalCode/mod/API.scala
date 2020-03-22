package typings.japanPostalCode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait API extends js.Object {
  @JSName("get")
  var get_Original: FetchPostalCodeMethod = js.native
  def get(stringifiedPostalCode: String, callback: Callback): Unit = js.native
}

