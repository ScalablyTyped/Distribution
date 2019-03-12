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
  def apply(ajaxWithFile: IJQueryOption => jqueryDotAjaxfileLib.JQueryDeferred[_]): IAjaxFileJQueryExtension = {
    val __obj = js.Dynamic.literal(ajaxWithFile = js.Any.fromFunction1(ajaxWithFile))
  
    __obj.asInstanceOf[IAjaxFileJQueryExtension]
  }
}

