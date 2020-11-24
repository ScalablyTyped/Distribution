package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridFeatureChooser
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var dropDownWidth: js.UndefOr[js.Any] = js.native
  
  var featureChooserDropDownOpened: js.UndefOr[FeatureChooserDropDownOpenedEvent] = js.native
  
  var featureChooserDropDownOpening: js.UndefOr[FeatureChooserDropDownOpeningEvent] = js.native
  
  var featureChooserRendered: js.UndefOr[FeatureChooserRenderedEvent] = js.native
  
  var featureChooserRendering: js.UndefOr[FeatureChooserRenderingEvent] = js.native
  
  var featureToggled: js.UndefOr[FeatureToggledEvent] = js.native
  
  var featureToggling: js.UndefOr[FeatureTogglingEvent] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  var menuToggling: js.UndefOr[MenuTogglingEvent] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
}
object IgGridFeatureChooser {
  
  @scala.inline
  def apply(): IgGridFeatureChooser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridFeatureChooser]
  }
  
  @scala.inline
  implicit class IgGridFeatureChooserOps[Self <: IgGridFeatureChooser] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    
    @scala.inline
    def setDropDownWidth(value: js.Any): Self = this.set("dropDownWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropDownWidth: Self = this.set("dropDownWidth", js.undefined)
    
    @scala.inline
    def setFeatureChooserDropDownOpened(value: (/* event */ Event, /* ui */ FeatureChooserDropDownOpenedEventUIParam) => Unit): Self = this.set("featureChooserDropDownOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFeatureChooserDropDownOpened: Self = this.set("featureChooserDropDownOpened", js.undefined)
    
    @scala.inline
    def setFeatureChooserDropDownOpening(value: (/* event */ Event, /* ui */ FeatureChooserDropDownOpeningEventUIParam) => Unit): Self = this.set("featureChooserDropDownOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFeatureChooserDropDownOpening: Self = this.set("featureChooserDropDownOpening", js.undefined)
    
    @scala.inline
    def setFeatureChooserRendered(value: (/* event */ Event, /* ui */ FeatureChooserRenderedEventUIParam) => Unit): Self = this.set("featureChooserRendered", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFeatureChooserRendered: Self = this.set("featureChooserRendered", js.undefined)
    
    @scala.inline
    def setFeatureChooserRendering(value: (/* event */ Event, /* ui */ FeatureChooserRenderingEventUIParam) => Unit): Self = this.set("featureChooserRendering", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFeatureChooserRendering: Self = this.set("featureChooserRendering", js.undefined)
    
    @scala.inline
    def setFeatureToggled(value: (/* event */ Event, /* ui */ FeatureToggledEventUIParam) => Unit): Self = this.set("featureToggled", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFeatureToggled: Self = this.set("featureToggled", js.undefined)
    
    @scala.inline
    def setFeatureToggling(value: (/* event */ Event, /* ui */ FeatureTogglingEventUIParam) => Unit): Self = this.set("featureToggling", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFeatureToggling: Self = this.set("featureToggling", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMenuToggling(value: (/* event */ Event, /* ui */ MenuTogglingEventUIParam) => Unit): Self = this.set("menuToggling", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMenuToggling: Self = this.set("menuToggling", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = this.set("regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegional: Self = this.set("regional", js.undefined)
  }
}
