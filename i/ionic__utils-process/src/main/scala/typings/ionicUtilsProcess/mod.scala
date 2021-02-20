package typings.ionicUtilsProcess

import org.scalablytyped.runtime.StringDictionary
import typings.ionicUtilsProcess.anon.Interval
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-process", "ERROR_TIMEOUT_REACHED")
  @js.native
  val ERROR_TIMEOUT_REACHED: Error = js.native
  
  @JSImport("@ionic/utils-process", "createProcessEnv")
  @js.native
  def createProcessEnv(sources: StringDictionary[js.UndefOr[String]]*): ProcessEnv = js.native
  
  @JSImport("@ionic/utils-process", "getPathParts")
  @js.native
  def getPathParts(): js.Array[String] = js.native
  @JSImport("@ionic/utils-process", "getPathParts")
  @js.native
  def getPathParts(envpath: String): js.Array[String] = js.native
  
  @JSImport("@ionic/utils-process", "killProcessTree")
  @js.native
  def killProcessTree(pid: Double): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-process", "killProcessTree")
  @js.native
  def killProcessTree(pid: Double, signal: String): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-process", "killProcessTree")
  @js.native
  def killProcessTree(pid: Double, signal: Double): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/utils-process", "offBeforeExit")
  @js.native
  def offBeforeExit(fn: ExitFn): Unit = js.native
  
  @JSImport("@ionic/utils-process", "onBeforeExit")
  @js.native
  def onBeforeExit(fn: ExitFn): Unit = js.native
  
  @JSImport("@ionic/utils-process", "onExit")
  @js.native
  def onExit(fn: js.Function0[Unit]): Unit = js.native
  
  @JSImport("@ionic/utils-process", "processExit")
  @js.native
  def processExit(): js.Promise[Unit] = js.native
  @JSImport("@ionic/utils-process", "processExit")
  @js.native
  def processExit(exitCode: Double): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/utils-process", "sleep")
  @js.native
  def sleep(ms: Double): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/utils-process", "sleepForever")
  @js.native
  def sleepForever(): js.Promise[scala.Nothing] = js.native
  
  @JSImport("@ionic/utils-process", "sleepUntil")
  @js.native
  def sleepUntil(predicate: js.Function0[Boolean], hasIntervalTimeout: Interval): js.Promise[Unit] = js.native
  
  type ExitFn = js.Function0[js.Promise[Unit]]
}
