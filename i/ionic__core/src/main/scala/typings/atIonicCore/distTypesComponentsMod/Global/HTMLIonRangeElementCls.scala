package typings.atIonicCore.distTypesComponentsMod.Global

import typings.atIonicCore.distTypesComponentsRangeRangeDashInterfaceMod.RangeValue
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTMLIonRangeElement")
@js.native
class HTMLIonRangeElementCls () extends HTMLIonRangeElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /**
    * How long, in milliseconds, to wait to trigger the `ionChange` event after each change in the range value.
    */
  /* CompleteClass */
  override var debounce: Double = js.native
  /**
    * If `true`, the user cannot interact with the range.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
  /**
    * Show two knobs.
    */
  /* CompleteClass */
  override var dualKnobs: Boolean = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
  /**
    * Maximum integer value of the range.
    */
  /* CompleteClass */
  override var max: Double = js.native
  /**
    * Minimum integer value of the range.
    */
  /* CompleteClass */
  override var min: Double = js.native
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
    * If `true`, a pin with integer value is shown when the knob is pressed.
    */
  /* CompleteClass */
  override var pin: Boolean = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
  /**
    * If `true`, the knob snaps to tick marks evenly spaced based on the step property value.
    */
  /* CompleteClass */
  override var snaps: Boolean = js.native
  /**
    * Specifies the value granularity.
    */
  /* CompleteClass */
  override var step: Double = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * If `true`, tick marks are displayed based on the step value. Only applies when `snaps` is `true`.
    */
  /* CompleteClass */
  override var ticks: Boolean = js.native
  /**
    * the value of the range.
    */
  /* CompleteClass */
  override var value: RangeValue = js.native
}

