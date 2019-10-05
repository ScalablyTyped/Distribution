package typings.kiiDashCloudDashSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a server side code execution result in KiiCloud.
  */
@JSGlobal("KiiCloud.KiiServerCodeExecResult")
@js.native
class KiiServerCodeExecResult () extends js.Object {
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

