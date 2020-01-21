package typings.isMyJsonValid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidateFunction extends js.Object {
  var errors: js.Array[ValidationError] = js.native
  def apply(data: js.Any): Boolean = js.native
}

