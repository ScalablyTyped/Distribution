package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.ThrottledSaveDrainOptions> */
trait PartialThrottledSaveDrain extends StObject {
  
  var recursiveWait: js.UndefOr[Boolean] = js.undefined
  
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.undefined
  
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.undefined
  
  var started: js.UndefOr[Double] = js.undefined
}
object PartialThrottledSaveDrain {
  
  @scala.inline
  def apply(): PartialThrottledSaveDrain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialThrottledSaveDrain]
  }
  
  @scala.inline
  implicit class PartialThrottledSaveDrainMutableBuilder[Self <: PartialThrottledSaveDrain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursiveWait(value: Boolean): Self = StObject.set(x, "recursiveWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveWaitLimit(value: Boolean): Self = StObject.set(x, "recursiveWaitLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveWaitLimitDuration(value: Double): Self = StObject.set(x, "recursiveWaitLimitDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveWaitLimitDurationUndefined: Self = StObject.set(x, "recursiveWaitLimitDuration", js.undefined)
    
    @scala.inline
    def setRecursiveWaitLimitUndefined: Self = StObject.set(x, "recursiveWaitLimit", js.undefined)
    
    @scala.inline
    def setRecursiveWaitUndefined: Self = StObject.set(x, "recursiveWait", js.undefined)
    
    @scala.inline
    def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
  }
}
