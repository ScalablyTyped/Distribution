package typings.loaderDashRunner.loaderDashRunnerMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunLoaderResult extends js.Object {
  var cacheable: Boolean
  var contextDependencies: js.Array[String]
  var fileDependencies: js.Array[String]
  var resourceBuffer: js.UndefOr[Buffer | Null] = js.undefined
  var result: js.UndefOr[js.Array[Buffer | Null]] = js.undefined
}

object RunLoaderResult {
  @scala.inline
  def apply(
    cacheable: Boolean,
    contextDependencies: js.Array[String],
    fileDependencies: js.Array[String],
    resourceBuffer: Buffer = null,
    result: js.Array[Buffer | Null] = null
  ): RunLoaderResult = {
    val __obj = js.Dynamic.literal(cacheable = cacheable, contextDependencies = contextDependencies, fileDependencies = fileDependencies)
    if (resourceBuffer != null) __obj.updateDynamic("resourceBuffer")(resourceBuffer)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[RunLoaderResult]
  }
}

