package typings.jquery.JQuery

import typings.jquery.JQuery.Ajax.AjaxSettingsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlAjaxSettings[TContext] extends AjaxSettingsBase[TContext] {
  
  /**
    * A string containing the URL to which the request is sent.
    */
  var url: String = js.native
}
object UrlAjaxSettings {
  
  @scala.inline
  def apply[TContext](url: String): UrlAjaxSettings[TContext] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlAjaxSettings[TContext]]
  }
  
  @scala.inline
  implicit class UrlAjaxSettingsOps[Self <: UrlAjaxSettings[_], TContext] (val x: Self with UrlAjaxSettings[TContext]) extends AnyVal {
    
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
  }
}
