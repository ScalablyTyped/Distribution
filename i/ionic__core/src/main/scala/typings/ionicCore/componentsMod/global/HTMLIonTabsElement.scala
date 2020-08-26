package typings.ionicCore.componentsMod.global

import org.scalablytyped.runtime.Instantiable0
import typings.ionicCore.componentsMod.Components.IonTabs
import typings.ionicCore.stencilPublicRuntimeMod.HTMLStencilElement
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLIonTabsElement
  extends HTMLStencilElement
     with IonTabs {
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

@JSGlobal("HTMLIonTabsElement")
@js.native
object HTMLIonTabsElement extends Instantiable0[HTMLIonTabsElement]

