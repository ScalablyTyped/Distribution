package typings.atIonicUtilsDashProcess.atIonicUtilsDashProcessMod

import org.scalablytyped.runtime.StringDictionary
import typings.atIonicUtilsDashProcess.Anon_Interval
import typings.node.NodeJSNs.ProcessEnv
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-process", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ERROR_TIMEOUT_REACHED: Error = js.native
  def createProcessEnv(sources: StringDictionary[js.UndefOr[String]]*): ProcessEnv = js.native
  def getPathParts(): js.Array[String] = js.native
  def getPathParts(envpath: String): js.Array[String] = js.native
  def killProcessTree(pid: Double): js.Promise[Unit] = js.native
  def killProcessTree(pid: Double, signal: String): js.Promise[Unit] = js.native
  def killProcessTree(pid: Double, signal: Double): js.Promise[Unit] = js.native
  def offBeforeExit(fn: ExitFn): Unit = js.native
  def onBeforeExit(fn: ExitFn): Unit = js.native
  def onExit(fn: js.Function0[Unit]): Unit = js.native
  def processExit(): js.Promise[Unit] = js.native
  def processExit(exitCode: Double): js.Promise[Unit] = js.native
  def sleep(ms: Double): js.Promise[Unit] = js.native
  def sleepForever(): js.Promise[scala.Nothing] = js.native
  def sleepUntil(predicate: js.Function0[Boolean], hasIntervalTimeout: Anon_Interval): js.Promise[Unit] = js.native
}

