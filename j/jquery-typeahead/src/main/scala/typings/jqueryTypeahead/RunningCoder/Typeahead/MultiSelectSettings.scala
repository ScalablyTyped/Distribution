package typings.jqueryTypeahead.RunningCoder.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSelectSettings extends js.Object {
  
  var callback: js.UndefOr[MultiSelectSettingsCallback] = js.native
  
  /** If true, the last label will be deleted if the query is empty and backspace is pressed */
  var cancelOnBackspace: js.UndefOr[Boolean] = js.native
  
  /** Default items when Typeahead is loade */
  var data: js.UndefOr[js.Array[_] | js.Function0[_]] = js.native
  
  /** Href link on the multiselect item */
  var href: js.UndefOr[String | (js.Function1[/* item */ js.UndefOr[js.Any], String])] = js.native
  
  /** Optional limit of maximum items to select */
  var limit: js.UndefOr[Double] = js.native
  
  /** Template when the limit is reached */
  var limitTemplate: js.UndefOr[String | (js.Function1[/* query */ js.UndefOr[String], String])] = js.native
  
  /** Unique item identifier to remove an item from the result list when selected (use any of the item key), by default a JSON of the item will be used */
  var matchOn: js.UndefOr[String | js.Array[_]] = js.native
}
object MultiSelectSettings {
  
  @scala.inline
  def apply(): MultiSelectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiSelectSettings]
  }
  
  @scala.inline
  implicit class MultiSelectSettingsOps[Self <: MultiSelectSettings] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: MultiSelectSettingsCallback): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCancelOnBackspace(value: Boolean): Self = this.set("cancelOnBackspace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelOnBackspace: Self = this.set("cancelOnBackspace", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setDataFunction0(value: () => _): Self = this.set("data", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: js.Array[_] | js.Function0[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHrefFunction1(value: /* item */ js.UndefOr[js.Any] => String): Self = this.set("href", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHref(value: String | (js.Function1[/* item */ js.UndefOr[js.Any], String])): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLimitTemplateFunction1(value: /* query */ js.UndefOr[String] => String): Self = this.set("limitTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLimitTemplate(value: String | (js.Function1[/* query */ js.UndefOr[String], String])): Self = this.set("limitTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitTemplate: Self = this.set("limitTemplate", js.undefined)
    
    @scala.inline
    def setMatchOnVarargs(value: js.Any*): Self = this.set("matchOn", js.Array(value :_*))
    
    @scala.inline
    def setMatchOn(value: String | js.Array[_]): Self = this.set("matchOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchOn: Self = this.set("matchOn", js.undefined)
  }
}
