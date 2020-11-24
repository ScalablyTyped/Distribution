package typings.iitc.idleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  var IDLE_POLL_TIME: Double = js.native
  
  /**
    * add your function here if you want to be notified when the user
    * resumes from being idle
    */
  def addResumeFunction(fct: js.Function0[Unit]): Unit = js.native
  
  def idlePoll(): Unit = js.native
  
  def idleReset(): Unit = js.native
  
  def idleSet(): Unit = js.native
  
  var idleTime: Double = js.native
  
  /** default MAX_IDLE_TIME */
  @JSName("_idleTimeLimit")
  var idleTimeLimit: Double = js.native
  
  def setupIdle(): Unit = js.native
}
