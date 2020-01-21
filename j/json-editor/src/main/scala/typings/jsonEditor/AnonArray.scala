package typings.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray extends js.Object {
  var array: AnonOptionsJSONEditorArrayOptions
  var `object`: AnonOptions
}

object AnonArray {
  @scala.inline
  def apply(array: AnonOptionsJSONEditorArrayOptions, `object`: AnonOptions): AnonArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArray]
  }
}

