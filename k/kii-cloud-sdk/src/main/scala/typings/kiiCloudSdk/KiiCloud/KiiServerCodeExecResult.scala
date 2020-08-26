package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a server side code execution result in KiiCloud.
  */
@js.native
trait KiiServerCodeExecResult extends js.Object {
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
  implicit class KiiServerCodeExecResultOps[Self <: KiiServerCodeExecResult] (val x: Self) extends AnyVal {
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
    def setGetExecutedSteps(value: () => Double): Self = this.set("getExecutedSteps", js.Any.fromFunction0(value))
    @scala.inline
    def setGetReturnedValue(value: () => js.Any): Self = this.set("getReturnedValue", js.Any.fromFunction0(value))
  }
  
}

