package typings.loaderRunner.mod

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
    resourceBuffer: js.UndefOr[Null | Buffer] = js.undefined,
    result: js.Array[Buffer | Null] = null
  ): RunLoaderResult = {
    val __obj = js.Dynamic.literal(cacheable = cacheable.asInstanceOf[js.Any], contextDependencies = contextDependencies.asInstanceOf[js.Any], fileDependencies = fileDependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceBuffer)) __obj.updateDynamic("resourceBuffer")(resourceBuffer.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunLoaderResult]
  }
}

