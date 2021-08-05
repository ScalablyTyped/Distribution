package typings.logkitty

import typings.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logkitty/build/android/adb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAdbPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdbPath")().asInstanceOf[String]
  inline def getAdbPath(customPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdbPath")(customPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getApplicationPid(applicationId: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationPid")(applicationId.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getApplicationPid(applicationId: String, adbPath: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getApplicationPid")(applicationId.asInstanceOf[js.Any], adbPath.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def runAndroidLoggingProcess(): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("runAndroidLoggingProcess")().asInstanceOf[ChildProcess]
  inline def runAndroidLoggingProcess(adbPath: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("runAndroidLoggingProcess")(adbPath.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
  
  inline def spawnLogcatProcess(adbPath: String): ChildProcess = ^.asInstanceOf[js.Dynamic].applyDynamic("spawnLogcatProcess")(adbPath.asInstanceOf[js.Any]).asInstanceOf[ChildProcess]
}
