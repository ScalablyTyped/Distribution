package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a server side code execution result in KiiCloud.
  */
@js.native
trait KiiServerCodeExecResult extends StObject {
  
  /**
    * Get calculated number of executed steps.
    *
    * @return calculated number of executed steps
    */
  def getExecutedSteps(): Double = js.native
  
  /**
    * Get Object returned by server code entry.
    *
    * @return returned by server code entry.
    */
  def getReturnedValue(): js.Any = js.native
}
object KiiServerCodeExecResult {
  
  @scala.inline
  def apply(getExecutedSteps: () => Double, getReturnedValue: () => js.Any): KiiServerCodeExecResult = {
    val __obj = js.Dynamic.literal(getExecutedSteps = js.Any.fromFunction0(getExecutedSteps), getReturnedValue = js.Any.fromFunction0(getReturnedValue))
    __obj.asInstanceOf[KiiServerCodeExecResult]
  }
  
  @scala.inline
  implicit class KiiServerCodeExecResultMutableBuilder[Self <: KiiServerCodeExecResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetExecutedSteps(value: () => Double): Self = StObject.set(x, "getExecutedSteps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReturnedValue(value: () => js.Any): Self = StObject.set(x, "getReturnedValue", js.Any.fromFunction0(value))
  }
}
