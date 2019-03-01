package typings
package lobiboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Class extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var closeOnClick: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Class {
  @scala.inline
  def apply(
    `class`: java.lang.String = null,
    closeOnClick: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null
  ): Anon_Class = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (!js.isUndefined(closeOnClick)) __obj.updateDynamic("closeOnClick")(closeOnClick)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Class]
  }
}

