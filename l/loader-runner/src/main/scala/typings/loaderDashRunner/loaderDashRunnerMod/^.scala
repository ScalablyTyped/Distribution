package typings.loaderDashRunner.loaderDashRunnerMod

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loader-runner", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getContext(resource: String): String = js.native
  def runLoaders(
    options: RunLoaderOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ RunLoaderResult, _]
  ): Unit = js.native
}

