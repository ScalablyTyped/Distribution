package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSelect extends js.Object {
  /**
    * The text to display on the cancel button.
    */
  var cancelText: java.lang.String = js.native
  /**
    * A property name or function used to compare object values
    */
  var compareWith: js.UndefOr[
    java.lang.String | atIonicCoreLib.distTypesComponentsSelectSelectDashInterfaceMod.SelectCompareFn | scala.Null
  ] = js.native
  /**
    * If `true`, the user cannot interact with the select.
    */
  var disabled: scala.Boolean = js.native
  /**
    * The interface the select should use: `action-sheet`, `popover` or `alert`.
    */
  var interface: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SelectInterface */ js.Any = js.native
  /**
    * Any additional options that the `alert`, `action-sheet` or `popover` interface can take. See the [AlertController API docs](../../alert/AlertController/#create), the [ActionSheetController API docs](../../action-sheet/ActionSheetController/#create) and the [PopoverController API docs](../../popover/PopoverController/#create) for the create options for each interface.
    */
  var interfaceOptions: js.Any = js.native
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = js.native
  /**
    * If `true`, the select can accept multiple values.
    */
  var multiple: scala.Boolean = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  var name: java.lang.String = js.native
  /**
    * The text to display on the ok button.
    */
  var okText: java.lang.String = js.native
  /**
    * The text to display when the select is empty.
    */
  var placeholder: js.UndefOr[java.lang.String | scala.Null] = js.native
  /**
    * The text to display instead of the selected option's value.
    */
  var selectedText: js.UndefOr[java.lang.String | scala.Null] = js.native
  /**
    * the value of the select.
    */
  var value: js.UndefOr[js.Any | scala.Null] = js.native
  /**
    * Open the select overlay. The overlay is either an alert, action sheet, or popover, depending on the `interface` property on the `ion-select`.
    */
  def open(): js.Promise[
    js.UndefOr[
      atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonActionSheetElement | atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonAlertElement | atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement
    ]
  ] = js.native
  def open(event: stdLib.UIEvent): js.Promise[
    js.UndefOr[
      atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonActionSheetElement | atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonAlertElement | atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonPopoverElement
    ]
  ] = js.native
}

