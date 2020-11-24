package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgResponsiveContainerMethods extends js.Object {
  
  /**
    * Adds a callback to the callback collection.
    *
    * @param callback The function to call when requirements are met.
    * @param owner The owner object of the function.
    * @param reactionStep The sensitivity of the size change recognition.
    * @param reactionDirection The dimensions the changes of which to be traced.
    */
  def addCallback(callback: js.Function, owner: js.Object, reactionStep: Double, reactionDirection: js.Object): Unit = js.native
  
  /**
    * Destroys the ResponsiveContainer widget
    */
  def destroy(): Unit = js.native
  
  /**
    * Removes a callback from the callbacks collection.
    *
    * @param callbackId The callback id to remove.
    */
  def removeCallback(callbackId: Double): Unit = js.native
  
  /**
    * Starts the automatic size check procedure
    */
  def startPoller(): Unit = js.native
  
  /**
    * Stops the automatic size check procedure
    */
  def stopPoller(): Unit = js.native
}
object IgResponsiveContainerMethods {
  
  @scala.inline
  def apply(
    addCallback: (js.Function, js.Object, Double, js.Object) => Unit,
    destroy: () => Unit,
    removeCallback: Double => Unit,
    startPoller: () => Unit,
    stopPoller: () => Unit
  ): IgResponsiveContainerMethods = {
    val __obj = js.Dynamic.literal(addCallback = js.Any.fromFunction4(addCallback), destroy = js.Any.fromFunction0(destroy), removeCallback = js.Any.fromFunction1(removeCallback), startPoller = js.Any.fromFunction0(startPoller), stopPoller = js.Any.fromFunction0(stopPoller))
    __obj.asInstanceOf[IgResponsiveContainerMethods]
  }
  
  @scala.inline
  implicit class IgResponsiveContainerMethodsOps[Self <: IgResponsiveContainerMethods] (val x: Self) extends AnyVal {
    
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
    def setAddCallback(value: (js.Function, js.Object, Double, js.Object) => Unit): Self = this.set("addCallback", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveCallback(value: Double => Unit): Self = this.set("removeCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartPoller(value: () => Unit): Self = this.set("startPoller", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPoller(value: () => Unit): Self = this.set("stopPoller", js.Any.fromFunction0(value))
  }
}
