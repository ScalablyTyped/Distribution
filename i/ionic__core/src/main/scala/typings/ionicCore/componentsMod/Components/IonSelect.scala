package typings.ionicCore.componentsMod.Components

import typings.ionicCore.ionicCoreStrings.ios
import typings.ionicCore.ionicCoreStrings.md
import typings.ionicCore.selectInterfaceMod.SelectCompareFn
import typings.ionicCore.selectInterfaceMod.SelectInterface
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonSelect extends StObject {
  
  /**
    * The text to display on the cancel button.
    */
  var cancelText: String = js.native
  
  /**
    * A property name or function used to compare object values
    */
  var compareWith: js.UndefOr[String | SelectCompareFn | Null] = js.native
  
  /**
    * If `true`, the user cannot interact with the select.
    */
  var disabled: Boolean = js.native
  
  /**
    * The interface the select should use: `action-sheet`, `popover` or `alert`.
    */
  var interface: SelectInterface = js.native
  
  /**
    * Any additional options that the `alert`, `action-sheet` or `popover` interface can take. See the [ion-alert docs](../alert), the [ion-action-sheet docs](../action-sheet) and the [ion-popover docs](../popover) for the create options for each interface.  Note: `interfaceOptions` will not override `inputs` or `buttons` with the `alert` interface.
    */
  var interfaceOptions: js.Any = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * If `true`, the select can accept multiple values.
    */
  var multiple: Boolean = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: String = js.native
  
  /**
    * The text to display on the ok button.
    */
  var okText: String = js.native
  
  /**
    * Open the select overlay. The overlay is either an alert, action sheet, or popover, depending on the `interface` property on the `ion-select`.
    * @param event The user interface event that called the open.
    */
  def open(): js.Promise[_] = js.native
  def open(event: UIEvent): js.Promise[_] = js.native
  
  /**
    * The text to display when the select is empty.
    */
  var placeholder: js.UndefOr[String | Null] = js.native
  
  /**
    * The text to display instead of the selected option's value.
    */
  var selectedText: js.UndefOr[String | Null] = js.native
  
  /**
    * the value of the select.
    */
  var value: js.UndefOr[js.Any | Null] = js.native
}
