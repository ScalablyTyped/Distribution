package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashCompilerErrors extends js.Object {
  def clear(): js.Any
  def save(): js.Any
}

object FlashCompilerErrors {
  @scala.inline
  def apply(clear: js.Function0[js.Any], save: js.Function0[js.Any]): FlashCompilerErrors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[FlashCompilerErrors]
  }
}

