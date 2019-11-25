package typings.htmltojsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateClass extends js.Object {
  var createClass: js.UndefOr[Boolean] = js.undefined
  /** as a string e.g. '    ' or '\t' */
  var indent: js.UndefOr[String] = js.undefined
  var outputClassName: js.UndefOr[String] = js.undefined
}

object Anon_CreateClass {
  @scala.inline
  def apply(
    createClass: js.UndefOr[Boolean] = js.undefined,
    indent: String = null,
    outputClassName: String = null
  ): Anon_CreateClass = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(createClass)) __obj.updateDynamic("createClass")(createClass.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (outputClassName != null) __obj.updateDynamic("outputClassName")(outputClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CreateClass]
  }
}

