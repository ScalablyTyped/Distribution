package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.mod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRadio extends StObject {
  
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  
  /**
    * If `true`, the user cannot interact with the radio.
    */
  var disabled: Boolean
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.undefined
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String
  
  def setButtonTabindex(value: Double): js.Promise[Unit]
  
  def setFocus(): js.Promise[Unit]
  
  /**
    * the value of the radio.
    */
  var value: js.UndefOr[js.Any | Null] = js.undefined
}
object IonRadio {
  
  @scala.inline
  def apply(
    disabled: Boolean,
    name: String,
    setButtonTabindex: Double => js.Promise[Unit],
    setFocus: () => js.Promise[Unit]
  ): IonRadio = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setButtonTabindex = js.Any.fromFunction1(setButtonTabindex), setFocus = js.Any.fromFunction0(setFocus))
    __obj.asInstanceOf[IonRadio]
  }
  
  @scala.inline
  implicit class IonRadioMutableBuilder[Self <: IonRadio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: ios | md): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetButtonTabindex(value: Double => js.Promise[Unit]): Self = StObject.set(x, "setButtonTabindex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFocus(value: () => js.Promise[Unit]): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
