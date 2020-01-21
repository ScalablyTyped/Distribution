package typings.loaderUtils.mod

import typings.node.Buffer
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolateOption extends js.Object {
  var content: js.UndefOr[String | Buffer] = js.undefined
  var context: js.UndefOr[String] = js.undefined
  var regExp: js.UndefOr[String | RegExp] = js.undefined
}

object InterpolateOption {
  @scala.inline
  def apply(content: String | Buffer = null, context: String = null, regExp: String | RegExp = null): InterpolateOption = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolateOption]
  }
}

