package typings.logkitty

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("logkitty/build/android/adb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getAdbPath(): String = js.native
  def getAdbPath(customPath: String): String = js.native
  
  def getApplicationPid(applicationId: String): Double = js.native
  def getApplicationPid(applicationId: String, adbPath: String): Double = js.native
  
  def runAndroidLoggingProcess(): ChildProcess = js.native
  def runAndroidLoggingProcess(adbPath: String): ChildProcess = js.native
  
  def spawnLogcatProcess(adbPath: String): ChildProcess = js.native
}
