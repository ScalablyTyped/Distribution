package typings.jquery.JQuery

import typings.jquery.JQuery.Ajax.AjaxSettingsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// region Ajax
// #region Ajax
@js.native
trait AjaxSettings[TContext] extends AjaxSettingsBase[TContext] {
  /**
    * A string containing the URL to which the request is sent.
    */
  var url: js.UndefOr[String] = js.native
}

object AjaxSettings {
  @scala.inline
  def apply[TContext](): AjaxSettings[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSettings[TContext]]
  }
  @scala.inline
  implicit class AjaxSettingsOps[Self <: AjaxSettings[_], TContext] (val x: Self with AjaxSettings[TContext]) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

