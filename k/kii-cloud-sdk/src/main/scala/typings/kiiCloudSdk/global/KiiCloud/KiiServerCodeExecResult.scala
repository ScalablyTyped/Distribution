package typings.kiiCloudSdk.global.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a server side code execution result in KiiCloud.
  */
@JSGlobal("KiiCloud.KiiServerCodeExecResult")
@js.native
open class KiiServerCodeExecResult ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult {
  
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
  override def getReturnedValue(): Any = js.native
}
