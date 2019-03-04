package typings
package loaderDashRunnerLib.loaderDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunLoaderResult extends js.Object {
  var cacheable: scala.Boolean
  var contextDependencies: js.Array[java.lang.String]
  var fileDependencies: js.Array[java.lang.String]
  var resourceBuffer: js.UndefOr[nodeLib.Buffer | scala.Null] = js.undefined
  var result: js.UndefOr[js.Array[nodeLib.Buffer | scala.Null]] = js.undefined
}

object RunLoaderResult {
  @scala.inline
  def apply(
    cacheable: scala.Boolean,
    contextDependencies: js.Array[java.lang.String],
    fileDependencies: js.Array[java.lang.String],
    resourceBuffer: nodeLib.Buffer = null,
    result: js.Array[nodeLib.Buffer | scala.Null] = null
  ): RunLoaderResult = {
    val __obj = js.Dynamic.literal(cacheable = cacheable, contextDependencies = contextDependencies, fileDependencies = fileDependencies)
    if (resourceBuffer != null) __obj.updateDynamic("resourceBuffer")(resourceBuffer)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[RunLoaderResult]
  }
}

