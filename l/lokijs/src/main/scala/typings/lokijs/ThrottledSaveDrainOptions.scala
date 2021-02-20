package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrottledSaveDrainOptions extends StObject {
  
  var recursiveWait: Boolean = js.native
  
  var recursiveWaitLimit: Boolean = js.native
  
  var recursiveWaitLimitDuration: Double = js.native
  
  var started: Double = js.native
}
object ThrottledSaveDrainOptions {
  
  @scala.inline
  def apply(
    recursiveWait: Boolean,
    recursiveWaitLimit: Boolean,
    recursiveWaitLimitDuration: Double,
    started: Double
  ): ThrottledSaveDrainOptions = {
    val __obj = js.Dynamic.literal(recursiveWait = recursiveWait.asInstanceOf[js.Any], recursiveWaitLimit = recursiveWaitLimit.asInstanceOf[js.Any], recursiveWaitLimitDuration = recursiveWaitLimitDuration.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottledSaveDrainOptions]
  }
  
  @scala.inline
  implicit class ThrottledSaveDrainOptionsMutableBuilder[Self <: ThrottledSaveDrainOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecursiveWait(value: Boolean): Self = StObject.set(x, "recursiveWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveWaitLimit(value: Boolean): Self = StObject.set(x, "recursiveWaitLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveWaitLimitDuration(value: Double): Self = StObject.set(x, "recursiveWaitLimitDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
