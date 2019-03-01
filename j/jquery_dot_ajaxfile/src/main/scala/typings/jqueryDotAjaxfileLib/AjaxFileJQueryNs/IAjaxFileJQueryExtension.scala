package typings
package jqueryDotAjaxfileLib.AjaxFileJQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAjaxFileJQueryExtension extends js.Object {
  def ajaxWithFile(jqueryOption: IJQueryOption): jqueryDotAjaxfileLib.JQueryDeferred[_]
}

object IAjaxFileJQueryExtension {
  @scala.inline
  def apply(ajaxWithFile: js.Function1[IJQueryOption, jqueryDotAjaxfileLib.JQueryDeferred[_]]): IAjaxFileJQueryExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ajaxWithFile")(ajaxWithFile)
    __obj.asInstanceOf[IAjaxFileJQueryExtension]
  }
}

