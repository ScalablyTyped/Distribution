package typings.logkitty

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logkitty/build/android/adb", "getAdbPath")
  @js.native
  def getAdbPath(): String = js.native
  @JSImport("logkitty/build/android/adb", "getAdbPath")
  @js.native
  def getAdbPath(customPath: String): String = js.native
  
  @JSImport("logkitty/build/android/adb", "getApplicationPid")
  @js.native
  def getApplicationPid(applicationId: String): Double = js.native
  @JSImport("logkitty/build/android/adb", "getApplicationPid")
  @js.native
  def getApplicationPid(applicationId: String, adbPath: String): Double = js.native
  
  @JSImport("logkitty/build/android/adb", "runAndroidLoggingProcess")
  @js.native
  def runAndroidLoggingProcess(): ChildProcess = js.native
  @JSImport("logkitty/build/android/adb", "runAndroidLoggingProcess")
  @js.native
  def runAndroidLoggingProcess(adbPath: String): ChildProcess = js.native
  
  @JSImport("logkitty/build/android/adb", "spawnLogcatProcess")
  @js.native
  def spawnLogcatProcess(adbPath: String): ChildProcess = js.native
}
