package typings.atIonicCore.distTypesComponentsMod._Global_

import typings.atIonicCore.atIonicCoreStrings.determinate
import typings.atIonicCore.atIonicCoreStrings.indeterminate
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTMLIonProgressBarElement")
@js.native
class HTMLIonProgressBarElementCls () extends HTMLIonProgressBarElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /**
    * If the buffer and value are smaller than 1, the buffer circles will show. The buffer should be between [0, 1].
    */
  /* CompleteClass */
  override var buffer: Double = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /* CompleteClass */
  override var innerHTML: String = js.native
  /* CompleteClass */
  override var inputMode: String = js.native
  /* CompleteClass */
  override val isContentEditable: Boolean = js.native
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
    * If true, reverse the progress bar direction.
    */
  /* CompleteClass */
  override var reversed: Boolean = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * The state of the progress bar, based on if the time the process takes is known or not. Default options are: `"determinate"` (no animation), `"indeterminate"` (animate from left to right).
    */
  /* CompleteClass */
  override var `type`: determinate | indeterminate = js.native
  /**
    * The value determines how much of the active bar should display when the `type` is `"determinate"`. The value should be between [0, 1].
    */
  /* CompleteClass */
  override var value: Double = js.native
}

