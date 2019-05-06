package typings
package atIonicCoreLib.distTypesComponentsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonDatetimeElement
  extends atIonicCoreLib.distTypesStencilDotCoreMod.Global.HTMLStencilElement
     with atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonDatetime {
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

@JSGlobal("HTMLIonDatetimeElement")
@js.native
class HTMLIonDatetimeElementCls () extends HTMLIonDatetimeElement {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /**
    * The text to display on the picker's cancel button.
    */
  /* CompleteClass */
  override var cancelText: java.lang.String = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /**
    * If `true`, the user cannot interact with the datetime.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  /**
    * The display format of the date and time as text that shows within the item. When the `pickerFormat` input is not used, then the `displayFormat` is used for both display the formatted text, and determining the datetime picker's columns. See the `pickerFormat` input description for more info. Defaults to `MMM D, YYYY`.
    */
  /* CompleteClass */
  override var displayFormat: java.lang.String = js.native
  /**
    * The text to display on the picker's "Done" button.
    */
  /* CompleteClass */
  override var doneText: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * The mode determines which platform styles to use.
    */
  /* CompleteClass */
  override var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any = js.native
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
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
    * If `true`, the datetime appears normal but is not interactive.
    */
  /* CompleteClass */
  override var readonly: scala.Boolean = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
  /**
    * Opens the datetime overlay.
    */
  /* CompleteClass */
  override def open(): js.Promise[scala.Unit] = js.native
}

@JSGlobal("HTMLIonDatetimeElement")
@js.native
object HTMLIonDatetimeElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLIonDatetimeElement]

