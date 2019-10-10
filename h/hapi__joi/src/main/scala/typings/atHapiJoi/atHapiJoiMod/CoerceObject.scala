package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoerceObject extends js.Object {
  var from: js.UndefOr[String | js.Array[String]] = js.native
  @JSName("method")
  var method_Original: CoerceFunction = js.native
  def method(value: js.Any, helpers: CustomHelpers[_]): CoerceResult = js.native
}

