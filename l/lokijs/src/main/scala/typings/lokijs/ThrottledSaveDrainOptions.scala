package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThrottledSaveDrainOptions extends StObject {
  
  var recursiveWait: Boolean
  
  var recursiveWaitLimit: Boolean
  
  var recursiveWaitLimitDuration: Double
  
  var started: Double
}
object ThrottledSaveDrainOptions {
  
  inline def apply(
    recursiveWait: Boolean,
    recursiveWaitLimit: Boolean,
    recursiveWaitLimitDuration: Double,
    started: Double
  ): ThrottledSaveDrainOptions = {
    val __obj = js.Dynamic.literal(recursiveWait = recursiveWait.asInstanceOf[js.Any], recursiveWaitLimit = recursiveWaitLimit.asInstanceOf[js.Any], recursiveWaitLimitDuration = recursiveWaitLimitDuration.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottledSaveDrainOptions]
  }
  
  extension [Self <: ThrottledSaveDrainOptions](x: Self) {
    
    inline def setRecursiveWait(value: Boolean): Self = StObject.set(x, "recursiveWait", value.asInstanceOf[js.Any])
    
    inline def setRecursiveWaitLimit(value: Boolean): Self = StObject.set(x, "recursiveWaitLimit", value.asInstanceOf[js.Any])
    
    inline def setRecursiveWaitLimitDuration(value: Double): Self = StObject.set(x, "recursiveWaitLimitDuration", value.asInstanceOf[js.Any])
    
    inline def setStarted(value: Double): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
  }
}
