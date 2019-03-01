package typings
package jestDashValidateLib.jestDashValidateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var deprecation: js.UndefOr[java.lang.String] = js.undefined
  var error: js.UndefOr[java.lang.String] = js.undefined
  var warning: js.UndefOr[java.lang.String] = js.undefined
}

object Title {
  @scala.inline
  def apply(
    deprecation: java.lang.String = null,
    error: java.lang.String = null,
    warning: java.lang.String = null
  ): Title = {
    val __obj = js.Dynamic.literal()
    if (deprecation != null) __obj.updateDynamic("deprecation")(deprecation)
    if (error != null) __obj.updateDynamic("error")(error)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Title]
  }
}

