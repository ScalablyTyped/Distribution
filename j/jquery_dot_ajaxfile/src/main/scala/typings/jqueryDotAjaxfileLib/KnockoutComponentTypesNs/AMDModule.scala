package typings
package jqueryDotAjaxfileLib.KnockoutComponentTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// common AMD type
trait AMDModule extends js.Object {
  var require: java.lang.String
}

object AMDModule {
  @scala.inline
  def apply(require: java.lang.String): AMDModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("require")(require)
    __obj.asInstanceOf[AMDModule]
  }
}

