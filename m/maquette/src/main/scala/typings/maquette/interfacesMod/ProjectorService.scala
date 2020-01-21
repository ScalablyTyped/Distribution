package typings.maquette.interfacesMod

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
  def renderNow(): Unit
  /**
    * Instructs the projector to re-render to the DOM at the next animation-frame using the registered `render` functions.
    * This method is automatically called for you when event-handlers that are registered in the [[VNode]]s are invoked.
    *
    * You need to call this method when timeouts expire, when AJAX responses arrive or other asynchronous actions happen.
    */
  def scheduleRender(): Unit
}

object ProjectorService {
  @scala.inline
  def apply(renderNow: () => Unit, scheduleRender: () => Unit): ProjectorService = {
    val __obj = js.Dynamic.literal(renderNow = js.Any.fromFunction0(renderNow), scheduleRender = js.Any.fromFunction0(scheduleRender))
  
    __obj.asInstanceOf[ProjectorService]
  }
}

