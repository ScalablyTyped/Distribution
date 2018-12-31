package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectorService extends js.Object {
  /**
    * Synchronously re-renders to the DOM. You should normally call the `scheduleRender()` function to keep the
    * user interface more performant. There is however one good reason to call renderNow(),
    * when you want to put the focus into a newly created element in iOS.
    * This is only allowed when triggered by a user-event, not during requestAnimationFrame.
    */
  def renderNow(): scala.Unit
  /**
    * Instructs the projector to re-render to the DOM at the next animation-frame using the registered `render` functions.
    * This method is automatically called for you when event-handlers that are registered in the [[VNode]]s are invoked.
    *
    * You need to call this method when timeouts expire, when AJAX responses arrive or other asynchronous actions happen.
    */
  def scheduleRender(): scala.Unit
}

