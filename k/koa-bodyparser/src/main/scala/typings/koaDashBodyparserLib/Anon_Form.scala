package typings
package koaDashBodyparserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Form extends js.Object {
  var form: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var json: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var text: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Form {
  @scala.inline
  def apply(
    form: js.Array[java.lang.String] = null,
    json: js.Array[java.lang.String] = null,
    text: js.Array[java.lang.String] = null
  ): Anon_Form = {
    val __obj = js.Dynamic.literal()
    if (form != null) __obj.updateDynamic("form")(form)
    if (json != null) __obj.updateDynamic("json")(json)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Form]
  }
}

