package typings.ibmMobilefirst.global.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("WL.Analytics")
@js.native
object Analytics extends js.Object {
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def log(message: String, name: String): Unit = js.native
  
  /**
    * @deprecated since version 6.2. WL.Analytics.restart is now a NOP.
    */
  def restart(): Unit = js.native
  
  def send(): Unit = js.native
  
  def state(): Unit = js.native
}
