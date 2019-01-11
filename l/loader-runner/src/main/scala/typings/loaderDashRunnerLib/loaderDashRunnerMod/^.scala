package typings
package loaderDashRunnerLib.loaderDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loader-runner", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getContext(resource: java.lang.String): java.lang.String = js.native
  def runLoaders(
    options: loaderDashRunnerLib.loaderDashRunnerMod.RunLoaderOption,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* result */ loaderDashRunnerLib.loaderDashRunnerMod.RunLoaderResult, 
      _
    ]
  ): scala.Unit = js.native
}

