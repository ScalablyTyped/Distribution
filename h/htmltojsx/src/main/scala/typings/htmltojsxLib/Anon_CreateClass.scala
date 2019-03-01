package typings
package htmltojsxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateClass extends js.Object {
  var createClass: js.UndefOr[scala.Boolean] = js.undefined
  /** as a string e.g. '    ' or '\t' */
  var indent: js.UndefOr[java.lang.String] = js.undefined
  var outputClassName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CreateClass {
  @scala.inline
  def apply(
    createClass: js.UndefOr[scala.Boolean] = js.undefined,
    indent: java.lang.String = null,
    outputClassName: java.lang.String = null
  ): Anon_CreateClass = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(createClass)) __obj.updateDynamic("createClass")(createClass)
    if (indent != null) __obj.updateDynamic("indent")(indent)
    if (outputClassName != null) __obj.updateDynamic("outputClassName")(outputClassName)
    __obj.asInstanceOf[Anon_CreateClass]
  }
}

