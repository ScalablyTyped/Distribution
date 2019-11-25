package typings.atIonicCore.distTypesComponentsMod._Global_

import typings.atIonicCore.atIonicCoreStrings.button
import typings.atIonicCore.atIonicCoreStrings.reset
import typings.atIonicCore.atIonicCoreStrings.submit
import typings.std.CSSStyleDeclaration
import typings.std.Element
import typings.std.HTMLSlotElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HTMLIonItemElement")
@js.native
class HTMLIonItemElementCls () extends HTMLIonItemElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | Null = js.native
  /**
    * If `true`, a button tag will be rendered and the item will be tappable.
    */
  /* CompleteClass */
  override var button: Boolean = js.native
  /* CompleteClass */
  override var contentEditable: String = js.native
  /**
    * The icon to use when `detail` is set to `true`.
    */
  /* CompleteClass */
  override var detailIcon: String = js.native
  /**
    * If `true`, the user cannot interact with the item.
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
  override var routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
  /**
    * The type of the button. Only used when an `onclick` or `button` property is present.
    */
  /* CompleteClass */
  override var `type`: submit | reset | button = js.native
}

