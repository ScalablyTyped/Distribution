package typings.handsontable.mod.Handsontable.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataObserver extends StObject {
  
  def destroy(): Unit = js.native
  
  def isPaused(): Boolean = js.native
  
  var observedData: js.Array[_] = js.native
  
  var observer: js.Object = js.native
  
  def pause(): Unit = js.native
  
  var paused: Boolean = js.native
  
  def resume(): Unit = js.native
  
  def setObservedData(observedData: js.Any): Unit = js.native
}
object DataObserver {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    isPaused: () => Boolean,
    observedData: js.Array[_],
    observer: js.Object,
    pause: () => Unit,
    paused: Boolean,
    resume: () => Unit,
    setObservedData: js.Any => Unit
  ): DataObserver = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), isPaused = js.Any.fromFunction0(isPaused), observedData = observedData.asInstanceOf[js.Any], observer = observer.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), setObservedData = js.Any.fromFunction1(setObservedData))
    __obj.asInstanceOf[DataObserver]
  }
  
  @scala.inline
  implicit class DataObserverMutableBuilder[Self <: DataObserver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObservedData(value: js.Array[_]): Self = StObject.set(x, "observedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservedDataVarargs(value: js.Any*): Self = StObject.set(x, "observedData", js.Array(value :_*))
    
    @scala.inline
    def setObserver(value: js.Object): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetObservedData(value: js.Any => Unit): Self = StObject.set(x, "setObservedData", js.Any.fromFunction1(value))
  }
}
