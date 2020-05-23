package typings.hapiJoi.anon

import typings.hapiJoi.hapiJoiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array extends js.Object {
  /**
    * the characters used around array avlues. Defaults to `'[]'`
    *
    * @default '[]'
    */
  var array: js.UndefOr[String | `false`] = js.undefined
  /**
    * the characters used around `{#label}` references. Defaults to `'"'`.
    *
    * @default '"'
    */
  var label: js.UndefOr[String | `false`] = js.undefined
}

object Array {
  @scala.inline
  def apply(array: String | `false` = null, label: String | `false` = null): Array = {
    val __obj = js.Dynamic.literal()
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
}

