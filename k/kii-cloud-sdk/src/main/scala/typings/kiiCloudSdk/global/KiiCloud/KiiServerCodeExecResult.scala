package typings.kiiCloudSdk.global.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a server side code execution result in KiiCloud.
  */
@JSGlobal("KiiCloud.KiiServerCodeExecResult")
@js.native
class KiiServerCodeExecResult ()
  extends typings.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult {
  /**
    * Get calculated number of executed steps.
    *
    * @return calculated number of executed steps
    */
  /* CompleteClass */
  override def getExecutedSteps(): Double = js.native
  /**
    * Get Object returned by server code entry.
    *
    * @return returned by server code entry.
    */
  /* CompleteClass */
  override def getReturnedValue(): js.Any = js.native
}

