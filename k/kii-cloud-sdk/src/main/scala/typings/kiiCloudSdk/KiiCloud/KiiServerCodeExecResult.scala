package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a server side code execution result in KiiCloud.
  */
trait KiiServerCodeExecResult extends StObject {
  
  /**
    * Get calculated number of executed steps.
    *
    * @return calculated number of executed steps
    */
  def getExecutedSteps(): Double
  
  /**
    * Get Object returned by server code entry.
    *
    * @return returned by server code entry.
    */
  def getReturnedValue(): Any
}
object KiiServerCodeExecResult {
  
  inline def apply(getExecutedSteps: () => Double, getReturnedValue: () => Any): KiiServerCodeExecResult = {
    val __obj = js.Dynamic.literal(getExecutedSteps = js.Any.fromFunction0(getExecutedSteps), getReturnedValue = js.Any.fromFunction0(getReturnedValue))
    __obj.asInstanceOf[KiiServerCodeExecResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KiiServerCodeExecResult] (val x: Self) extends AnyVal {
    
    inline def setGetExecutedSteps(value: () => Double): Self = StObject.set(x, "getExecutedSteps", js.Any.fromFunction0(value))
    
    inline def setGetReturnedValue(value: () => Any): Self = StObject.set(x, "getReturnedValue", js.Any.fromFunction0(value))
  }
}
