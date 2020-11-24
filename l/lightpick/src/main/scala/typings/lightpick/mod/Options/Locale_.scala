package typings.lightpick.mod.Options

import typings.lightpick.anon.PartialPluralizeFnLocale
import typings.lightpick.mod.Options.Locale.Buttons
import typings.lightpick.mod.Options.Locale.PluralizeFn
import typings.lightpick.mod.Options.Locale.PluralizeFnLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale_ extends js.Object {
  
  /**
    * Text for buttons.
    */
  var buttons: js.UndefOr[Buttons] = js.native
  
  var pluralize: js.UndefOr[PluralizeFn] = js.native
  
  /**
    * Text for tooltip.
    */
  var tooltip: js.UndefOr[PartialPluralizeFnLocale] = js.native
  
  /**
    * Show tooltip text on disabled dates. (Eg. «Already booked»)
    */
  var tooltipOnDisabled: js.UndefOr[String] = js.native
}
object Locale_ {
  
  @scala.inline
  def apply(): Locale_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale_]
  }
  
  @scala.inline
  implicit class Locale_Ops[Self <: Locale_] (val x: Self) extends AnyVal {
    
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
    def setButtons(value: Buttons): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setPluralize(value: (/* i */ String | Double, /* locale */ PluralizeFnLocale) => String): Self = this.set("pluralize", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePluralize: Self = this.set("pluralize", js.undefined)
    
    @scala.inline
    def setTooltip(value: PartialPluralizeFnLocale): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    
    @scala.inline
    def setTooltipOnDisabled(value: String): Self = this.set("tooltipOnDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipOnDisabled: Self = this.set("tooltipOnDisabled", js.undefined)
  }
}
