package typings.atIonicCore.distTypesComponentsMod._Global_

import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTMLIonTabElement")
@js.native
class HTMLIonTabElementCls () extends HTMLIonTabElement {
  /* CompleteClass */
  override var active: Boolean = js.native
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
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
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * A tab id must be provided for each `ion-tab`. It's used internally to reference the selected tab or by the router to switch between them.
    */
  /* CompleteClass */
  override var tab: String = js.native
  /**
    * Set the active component for the tab
    */
  /* CompleteClass */
  override def setActive(): js.Promise[Unit] = js.native
}

