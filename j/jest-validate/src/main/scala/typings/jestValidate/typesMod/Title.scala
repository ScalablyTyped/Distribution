package typings.jestValidate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var deprecation: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var warning: js.UndefOr[String] = js.undefined
}

object Title {
  @scala.inline
  def apply(deprecation: String = null, error: String = null, warning: String = null): Title = {
    val __obj = js.Dynamic.literal()
    if (deprecation != null) __obj.updateDynamic("deprecation")(deprecation.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

