package typings.ionicCore.componentsMod.global

import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTMLIonDatetimeElement")
@js.native
class HTMLIonDatetimeElementCls () extends HTMLIonDatetimeElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /**
    * The text to display on the picker's cancel button.
    */
  /* CompleteClass */
  override var cancelText: String = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /**
    * If `true`, the user cannot interact with the datetime.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  /**
    * The display format of the date and time as text that shows within the item. When the `pickerFormat` input is not used, then the `displayFormat` is used for both display the formatted text, and determining the datetime picker's columns. See the `pickerFormat` input description for more info. Defaults to `MMM D, YYYY`.
    */
  /* CompleteClass */
  override var displayFormat: String = js.native
  /**
    * The text to display on the picker's "Done" button.
    */
  /* CompleteClass */
  override var doneText: String = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /**
    * If `true`, the datetime appears normal but is not interactive.
    */
  /* CompleteClass */
  override var readonly: Boolean = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * Opens the datetime overlay.
    */
  /* CompleteClass */
  override def open(): js.Promise[Unit] = js.native
}

