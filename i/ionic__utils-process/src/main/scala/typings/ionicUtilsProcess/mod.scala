package typings.ionicUtilsProcess

import org.scalablytyped.runtime.StringDictionary
import typings.ionicUtilsProcess.anon.Interval
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/utils-process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/utils-process", "ERROR_TIMEOUT_REACHED")
  @js.native
  val ERROR_TIMEOUT_REACHED: Error = js.native
  
  @scala.inline
  def createProcessEnv(sources: StringDictionary[js.UndefOr[String]]*): ProcessEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("createProcessEnv")(sources.asInstanceOf[js.Any]).asInstanceOf[ProcessEnv]
  
  @scala.inline
  def getPathParts(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathParts")().asInstanceOf[js.Array[String]]
  @scala.inline
  def getPathParts(envpath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathParts")(envpath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def killProcessTree(pid: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("killProcessTree")(pid.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def killProcessTree(pid: Double, signal: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("killProcessTree")(pid.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def killProcessTree(pid: Double, signal: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("killProcessTree")(pid.asInstanceOf[js.Any], signal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def offBeforeExit(fn: ExitFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offBeforeExit")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def onBeforeExit(fn: ExitFn): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onBeforeExit")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def onExit(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onExit")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def processExit(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processExit")().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def processExit(exitCode: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("processExit")(exitCode.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def sleepForever(): js.Promise[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleepForever")().asInstanceOf[js.Promise[scala.Nothing]]
  
  @scala.inline
  def sleepUntil(predicate: js.Function0[Boolean], hasIntervalTimeout: Interval): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("sleepUntil")(predicate.asInstanceOf[js.Any], hasIntervalTimeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type ExitFn = js.Function0[js.Promise[Unit]]
}
