package typings.jqueryDotAjaxfile.AjaxFileJQuery

import typings.jqueryDotAjaxfile.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAjaxFileJQueryExtension extends js.Object {
  def ajaxWithFile(jqueryOption: IJQueryOption): JQueryDeferred[_]
}

object IAjaxFileJQueryExtension {
  @scala.inline
  def apply(ajaxWithFile: IJQueryOption => JQueryDeferred[_]): IAjaxFileJQueryExtension = {
    val __obj = js.Dynamic.literal(ajaxWithFile = js.Any.fromFunction1(ajaxWithFile))
  
    __obj.asInstanceOf[IAjaxFileJQueryExtension]
  }
}

