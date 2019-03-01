package typings
package jqueryDotAjaxfileLib.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var includeStack: scala.Boolean
}

object Config {
  @scala.inline
  def apply(includeStack: scala.Boolean): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeStack")(includeStack)
    __obj.asInstanceOf[Config]
  }
}

