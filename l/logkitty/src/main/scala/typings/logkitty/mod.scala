package typings.logkitty

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logkitty/build/android/adb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAdbPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdbPath")().asInstanceOf[String]
  @scala.inline
  def getAdbPath(customPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdbPath")(customPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getApplicationPid(applicationId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationPid")(applicationId.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getApplicationPid(applicationId: String, adbPath: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationPid")(applicationId.asInstanceOf[js.Any], adbPath.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def runAndroidLoggingProcess(): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("runAndroidLoggingProcess")().asInstanceOf[ChildProcess]
  @scala.inline
  def runAndroidLoggingProcess(adbPath: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("runAndroidLoggingProcess")(adbPath.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  
  @scala.inline
  def spawnLogcatProcess(adbPath: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnLogcatProcess")(adbPath.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
}
