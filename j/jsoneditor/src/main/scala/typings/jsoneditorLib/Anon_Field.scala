package typings
package jsoneditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  var field: scala.Boolean
  var value: scala.Boolean
}

object Anon_Field {
  @scala.inline
  def apply(field: scala.Boolean, value: scala.Boolean): Anon_Field = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Field]
  }
}

