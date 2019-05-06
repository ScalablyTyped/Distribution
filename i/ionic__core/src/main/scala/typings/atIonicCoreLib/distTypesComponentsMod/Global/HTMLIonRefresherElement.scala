package typings
package atIonicCoreLib.distTypesComponentsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonRefresherElement
  extends atIonicCoreLib.distTypesStencilDotCoreMod.Global.HTMLStencilElement
     with atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonRefresher {
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

@JSGlobal("HTMLIonRefresherElement")
@js.native
class HTMLIonRefresherElementCls () extends HTMLIonRefresherElement {
  /* CompleteClass */
  override val assignedSlot: stdLib.HTMLSlotElement | scala.Null = js.native
  /**
    * Time it takes to close the refresher.
    */
  /* CompleteClass */
  override var closeDuration: java.lang.String = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /**
    * If `true`, the refresher will be hidden.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
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
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`.
    */
  /* CompleteClass */
  override var pullMax: scala.Double = js.native
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state.
    */
  /* CompleteClass */
  override var pullMin: scala.Double = js.native
  /**
    * Time it takes the refresher to to snap back to the `refreshing` state.
    */
  /* CompleteClass */
  override var snapbackDuration: java.lang.String = js.native
  /* CompleteClass */
  override val style: stdLib.CSSStyleDeclaration = js.native
  /**
    * Changes the refresher's state from `refreshing` to `cancelling`.
    */
  /* CompleteClass */
  override def cancel(): scala.Unit = js.native
  /**
    * Call `complete()` when your async operation has completed. For example, the `refreshing` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request. Once the data has been received, you then call this method to signify that the refreshing has completed and to close the refresher. This method also changes the refresher's state from `refreshing` to `completing`.
    */
  /* CompleteClass */
  override def complete(): scala.Unit = js.native
  /**
    * A number representing how far down the user has pulled. The number `0` represents the user hasn't pulled down at all. The number `1`, and anything greater than `1`, represents that the user has pulled far enough down that when they let go then the refresh will happen. If they let go and the number is less than `1`, then the refresh will not happen, and the content will return to it's original position.
    */
  /* CompleteClass */
  override def getProgress(): js.Promise[scala.Double] = js.native
}

@JSGlobal("HTMLIonRefresherElement")
@js.native
object HTMLIonRefresherElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLIonRefresherElement]

