package typings
package loaderDashUtilsLib.loaderDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolateOption extends js.Object {
  var content: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var context: js.UndefOr[java.lang.String] = js.undefined
  var regExp: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
}

object InterpolateOption {
  @scala.inline
  def apply(
    content: java.lang.String | nodeLib.Buffer = null,
    context: java.lang.String = null,
    regExp: java.lang.String | stdLib.RegExp = null
  ): InterpolateOption = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolateOption]
  }
}

