package typings.ionicCore.componentsMod.global

import org.scalablytyped.runtime.Instantiable0
import typings.ionicCore.componentsMod.Components.IonSelect
import typings.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonSelectElement
  extends HTMLStencilElement
     with IonSelect {
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
}

@JSGlobal("HTMLIonSelectElement")
@js.native
object HTMLIonSelectElement extends Instantiable0[HTMLIonSelectElement]

