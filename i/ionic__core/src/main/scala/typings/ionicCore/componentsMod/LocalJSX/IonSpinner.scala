package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.mod.Color
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonSpinner extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * Duration of the spinner animation in milliseconds. The default varies based on the spinner.
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the SVG spinner to use. If a name is not provided, the platform's default spinner will be used.
    */
  var name: js.UndefOr[SpinnerTypes] = js.undefined
  
  /**
    * If `true`, the spinner's animation will be paused.
    */
  var paused: js.UndefOr[Boolean] = js.undefined
}
object IonSpinner {
  
  @scala.inline
  def apply(): IonSpinner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonSpinner]
  }
  
  @scala.inline
  implicit class IonSpinnerMutableBuilder[Self <: IonSpinner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setName(value: SpinnerTypes): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
  }
}
