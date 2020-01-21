package typings.loaderRunner.mod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loader-runner", "runLoaders")
@js.native
object runLoaders extends js.Object {
  def apply(
    options: RunLoaderOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ RunLoaderResult, _]
  ): Unit = js.native
}

