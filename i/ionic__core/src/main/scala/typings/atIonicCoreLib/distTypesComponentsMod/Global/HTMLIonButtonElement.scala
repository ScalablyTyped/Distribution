package typings
package atIonicCoreLib.distTypesComponentsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonButtonElement
  extends atIonicCoreLib.distTypesStencilDotCoreMod.HTMLStencilElement
     with atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonButton {
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.AddEventListenerOptions
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, listener: stdLib.EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: scala.Boolean
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    listener: stdLib.EventListenerOrEventListenerObject,
    options: stdLib.EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("HTMLIonButtonElement")
@js.native
class HTMLIonButtonElementCls () extends HTMLIonButtonElement {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /**
    * The type of button.
    */
  /* CompleteClass */
  override var buttonType: java.lang.String = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /**
    * If `true`, the user cannot interact with the button.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: stdLib.Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: stdLib.Element | scala.Null = js.native
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  /* CompleteClass */
  override var routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any = js.native
  /**
    * If `true`, activates a button with a heavier font weight.
    */
  /* CompleteClass */
  override var strong: scala.Boolean = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
  /**
    * The type of the button.
    */
  /* CompleteClass */
  override var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button = js.native
}

@JSGlobal("HTMLIonButtonElement")
@js.native
object HTMLIonButtonElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLIonButtonElement]

