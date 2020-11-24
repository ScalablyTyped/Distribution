package typings.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectorService extends js.Object {
  
  /**
    * Synchronously re-renders to the DOM. You should normally call the `scheduleRender()` function to keep the
    * user interface more performant. There is however one good reason to call renderNow(),
    * when you want to put the focus into a newly created element in iOS.
    * This is only allowed when triggered by a user-event, not during requestAnimationFrame.
    */
  def renderNow(): Unit = js.native
  
  /**
    * Instructs the projector to re-render to the DOM at the next animation-frame using the registered `render` functions.
    * This method is automatically called for you when event-handlers that are registered in the [[VNode]]s are invoked.
    *
    * You need to call this method when timeouts expire, when AJAX responses arrive or other asynchronous actions happen.
    */
  def scheduleRender(): Unit = js.native
}
object ProjectorService {
  
  @scala.inline
  def apply(renderNow: () => Unit, scheduleRender: () => Unit): ProjectorService = {
    val __obj = js.Dynamic.literal(renderNow = js.Any.fromFunction0(renderNow), scheduleRender = js.Any.fromFunction0(scheduleRender))
    __obj.asInstanceOf[ProjectorService]
  }
  
  @scala.inline
  implicit class ProjectorServiceOps[Self <: ProjectorService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRenderNow(value: () => Unit): Self = this.set("renderNow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScheduleRender(value: () => Unit): Self = this.set("scheduleRender", js.Any.fromFunction0(value))
  }
}
