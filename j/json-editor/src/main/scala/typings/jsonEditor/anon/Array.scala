package typings.jsonEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array extends js.Object {
  var array: OptionsJSONEditorArrayOptions
  var `object`: Options
}

object Array {
  @scala.inline
  def apply(array: OptionsJSONEditorArrayOptions, `object`: Options): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
}

