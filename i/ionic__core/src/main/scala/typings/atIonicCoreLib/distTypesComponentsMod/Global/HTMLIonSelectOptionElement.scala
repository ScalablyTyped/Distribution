package typings
package atIonicCoreLib.distTypesComponentsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonSelectOptionElement
  extends atIonicCoreLib.distTypesStencilDotCoreMod.HTMLStencilElement
     with atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonSelectOption {
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

@JSGlobal("HTMLIonSelectOptionElement")
@js.native
class HTMLIonSelectOptionElementCls () extends HTMLIonSelectOptionElement {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /**
    * If `true`, the user cannot interact with the select option.
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
    * If `true`, the element is selected.
    */
  /* CompleteClass */
  override var selected: scala.Boolean = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLIonSelectOptionElement")
@js.native
object HTMLIonSelectOptionElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLIonSelectOptionElement]

