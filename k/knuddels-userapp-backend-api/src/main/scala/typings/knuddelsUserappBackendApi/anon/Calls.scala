package typings.knuddelsUserappBackendApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calls extends StObject {
  
  var calls: Double
  
  var exec: Double
  
  var execAvg: Double
  
  var execMax: Double
  
  var memAlloc: Double
  
  var memAllocAvg: Double
  
  var memAllocMax: Double
  
  var waitAvg: Double
  
  var waitMax: Double
  
  @JSName("wait")
  var wait_FCalls: Double
}
object Calls {
  
  inline def apply(
    calls: Double,
    exec: Double,
    execAvg: Double,
    execMax: Double,
    memAlloc: Double,
    memAllocAvg: Double,
    memAllocMax: Double,
    waitAvg: Double,
    waitMax: Double,
    wait_ : Double
  ): Calls = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], exec = exec.asInstanceOf[js.Any], execAvg = execAvg.asInstanceOf[js.Any], execMax = execMax.asInstanceOf[js.Any], memAlloc = memAlloc.asInstanceOf[js.Any], memAllocAvg = memAllocAvg.asInstanceOf[js.Any], memAllocMax = memAllocMax.asInstanceOf[js.Any], waitAvg = waitAvg.asInstanceOf[js.Any], waitMax = waitMax.asInstanceOf[js.Any])
    __obj.updateDynamic("wait")(wait_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calls]
  }
  
  extension [Self <: Calls](x: Self) {
    
    inline def setCalls(value: Double): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setExec(value: Double): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setExecAvg(value: Double): Self = StObject.set(x, "execAvg", value.asInstanceOf[js.Any])
    
    inline def setExecMax(value: Double): Self = StObject.set(x, "execMax", value.asInstanceOf[js.Any])
    
    inline def setMemAlloc(value: Double): Self = StObject.set(x, "memAlloc", value.asInstanceOf[js.Any])
    
    inline def setMemAllocAvg(value: Double): Self = StObject.set(x, "memAllocAvg", value.asInstanceOf[js.Any])
    
    inline def setMemAllocMax(value: Double): Self = StObject.set(x, "memAllocMax", value.asInstanceOf[js.Any])
    
    inline def setWaitAvg(value: Double): Self = StObject.set(x, "waitAvg", value.asInstanceOf[js.Any])
    
    inline def setWaitMax(value: Double): Self = StObject.set(x, "waitMax", value.asInstanceOf[js.Any])
    
    inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
  }
}
