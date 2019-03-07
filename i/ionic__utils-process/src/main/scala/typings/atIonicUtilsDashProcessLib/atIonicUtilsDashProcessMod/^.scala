package typings
package atIonicUtilsDashProcessLib.atIonicUtilsDashProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-process", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ERROR_TIMEOUT_REACHED: nodeLib.Error = js.native
  def createProcessEnv(sources: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]*): nodeLib.NodeJSNs.ProcessEnv = js.native
  def getPathParts(): js.Array[java.lang.String] = js.native
  def getPathParts(envpath: java.lang.String): js.Array[java.lang.String] = js.native
  def killProcessTree(pid: scala.Double): js.Promise[scala.Unit] = js.native
  def killProcessTree(pid: scala.Double, signal: java.lang.String): js.Promise[scala.Unit] = js.native
  def killProcessTree(pid: scala.Double, signal: scala.Double): js.Promise[scala.Unit] = js.native
  def offBeforeExit(fn: atIonicUtilsDashProcessLib.atIonicUtilsDashProcessMod.ExitFn): scala.Unit = js.native
  def onBeforeExit(fn: atIonicUtilsDashProcessLib.atIonicUtilsDashProcessMod.ExitFn): scala.Unit = js.native
  def onExit(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def processExit(): js.Promise[scala.Unit] = js.native
  def processExit(exitCode: scala.Double): js.Promise[scala.Unit] = js.native
  def sleep(ms: scala.Double): js.Promise[scala.Unit] = js.native
  def sleepForever(): js.Promise[scala.Nothing] = js.native
  def sleepUntil(
    predicate: js.Function0[scala.Boolean],
    hasIntervalTimeout: atIonicUtilsDashProcessLib.Anon_Interval
  ): js.Promise[scala.Unit] = js.native
}

