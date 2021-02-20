package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.radioGroupInterfaceMod.RadioGroupChangeEventDetail
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonRadioGroup extends StObject {
  
  /**
    * If `true`, the radios can be deselected.
    */
  var allowEmptySelection: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Emitted when the value has changed.
    */
  var onIonChange: js.UndefOr[js.Function1[/* event */ CustomEvent[RadioGroupChangeEventDetail], Unit]] = js.native
  
  /**
    * the value of the radio group.
    */
  var value: js.UndefOr[js.Any | Null] = js.native
}
object IonRadioGroup {
  
  @scala.inline
  def apply(): IonRadioGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonRadioGroup]
  }
  
  @scala.inline
  implicit class IonRadioGroupMutableBuilder[Self <: IonRadioGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmptySelection(value: Boolean): Self = StObject.set(x, "allowEmptySelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEmptySelectionUndefined: Self = StObject.set(x, "allowEmptySelection", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnIonChange(value: /* event */ CustomEvent[RadioGroupChangeEventDetail] => Unit): Self = StObject.set(x, "onIonChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonChangeUndefined: Self = StObject.set(x, "onIonChange", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
