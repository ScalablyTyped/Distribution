package typings.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnclickOptions extends js.Object {
  
  /**
    * Whether or not the menu should close after clicking a link inside it.
    * The default value varies per link: true if the default behavior for
    * the clicked link is prevented, false otherwise.
    * Default: null
    */
  var close: js.UndefOr[Boolean | js.Any] = js.native
  
  /**
    * Whether or not to prevent the default behavior for the clicked link.
    * The default value varies per link: true if its href is equal to
    * or starts with a hash (#), false otherwise.
    * Default: null
    */
  var preventDefault: js.UndefOr[Boolean | js.Any] = js.native
  
  /**
    * Whether or not the clicked link should be visibly "selected".
    * Default: true
    */
  var setSelected: js.UndefOr[Boolean | js.Any] = js.native
}
object OnclickOptions {
  
  @scala.inline
  def apply(): OnclickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnclickOptions]
  }
  
  @scala.inline
  implicit class OnclickOptionsOps[Self <: OnclickOptions] (val x: Self) extends AnyVal {
    
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
    def setClose(value: Boolean | js.Any): Self = this.set("close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean | js.Any): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    
    @scala.inline
    def setSetSelected(value: Boolean | js.Any): Self = this.set("setSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetSelected: Self = this.set("setSelected", js.undefined)
  }
}
