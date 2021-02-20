package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgResponsiveContainerMethods extends StObject {
  
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
  implicit class IgResponsiveContainerMethodsMutableBuilder[Self <: IgResponsiveContainerMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddCallback(value: (js.Function, js.Object, Double, js.Object) => Unit): Self = StObject.set(x, "addCallback", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveCallback(value: Double => Unit): Self = StObject.set(x, "removeCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartPoller(value: () => Unit): Self = StObject.set(x, "startPoller", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPoller(value: () => Unit): Self = StObject.set(x, "stopPoller", js.Any.fromFunction0(value))
  }
}
