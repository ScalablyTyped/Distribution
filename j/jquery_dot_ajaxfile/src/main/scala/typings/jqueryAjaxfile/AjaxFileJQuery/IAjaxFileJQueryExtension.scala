package typings.jqueryAjaxfile.AjaxFileJQuery

import typings.jqueryAjaxfile.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAjaxFileJQueryExtension extends js.Object {
  def ajaxWithFile(jqueryOption: IJQueryOption): JQueryDeferred[_] = js.native
}

object IAjaxFileJQueryExtension {
  @scala.inline
  def apply(ajaxWithFile: IJQueryOption => JQueryDeferred[_]): IAjaxFileJQueryExtension = {
    val __obj = js.Dynamic.literal(ajaxWithFile = js.Any.fromFunction1(ajaxWithFile))
    __obj.asInstanceOf[IAjaxFileJQueryExtension]
  }
  @scala.inline
  implicit class IAjaxFileJQueryExtensionOps[Self <: IAjaxFileJQueryExtension] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAjaxWithFile(value: IJQueryOption => JQueryDeferred[_]): Self = this.set("ajaxWithFile", js.Any.fromFunction1(value))
  }
  
}

