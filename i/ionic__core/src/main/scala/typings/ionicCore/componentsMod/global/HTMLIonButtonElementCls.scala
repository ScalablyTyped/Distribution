package typings.ionicCore.componentsMod.global

import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTMLIonButtonElement")
@js.native
class HTMLIonButtonElementCls () extends HTMLIonButtonElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /**
    * The type of button.
    */
  /* CompleteClass */
  override var buttonType: String = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /**
    * If `true`, the user cannot interact with the button.
    */
  /* CompleteClass */
  override var disabled: Boolean = js.native
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
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  /* CompleteClass */
  override var routerDirection: RouterDirection = js.native
  /**
    * If `true`, activates a button with a heavier font weight.
    */
  /* CompleteClass */
  override var strong: Boolean = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: submit | reset | button = js.native
}

