package typings
package jsonDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var array: Anon_OptionsJSONEditorArrayOptions
  var `object`: Anon_Options
}

object Anon_Array {
  @scala.inline
  def apply(array: Anon_OptionsJSONEditorArrayOptions, `object`: Anon_Options): Anon_Array = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("array")(array)
    __obj.asInstanceOf[Anon_Array]
  }
}

