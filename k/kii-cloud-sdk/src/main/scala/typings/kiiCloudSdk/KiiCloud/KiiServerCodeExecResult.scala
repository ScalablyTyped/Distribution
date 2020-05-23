package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a server side code execution result in KiiCloud.
  */
trait KiiServerCodeExecResult extends js.Object {
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
  def getReturnedValue(): js.Any
}

object KiiServerCodeExecResult {
  @scala.inline
  def apply(getExecutedSteps: () => Double, getReturnedValue: () => js.Any): KiiServerCodeExecResult = {
    val __obj = js.Dynamic.literal(getExecutedSteps = js.Any.fromFunction0(getExecutedSteps), getReturnedValue = js.Any.fromFunction0(getReturnedValue))
    __obj.asInstanceOf[KiiServerCodeExecResult]
  }
}

