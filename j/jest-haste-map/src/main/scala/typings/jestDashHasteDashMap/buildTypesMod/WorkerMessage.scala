package typings.jestDashHasteDashMap.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerMessage extends js.Object {
  var computeDependencies: Boolean
  var computeSha1: Boolean
  var dependencyExtractor: js.UndefOr[String] = js.undefined
  var filePath: String
  var hasteImplModulePath: js.UndefOr[String] = js.undefined
  var rootDir: String
}

object WorkerMessage {
  @scala.inline
  def apply(
    computeDependencies: Boolean,
    computeSha1: Boolean,
    filePath: String,
    rootDir: String,
    dependencyExtractor: String = null,
    hasteImplModulePath: String = null
  ): WorkerMessage = {
    val __obj = js.Dynamic.literal(computeDependencies = computeDependencies, computeSha1 = computeSha1, filePath = filePath, rootDir = rootDir)
    if (dependencyExtractor != null) __obj.updateDynamic("dependencyExtractor")(dependencyExtractor)
    if (hasteImplModulePath != null) __obj.updateDynamic("hasteImplModulePath")(hasteImplModulePath)
    __obj.asInstanceOf[WorkerMessage]
  }
}

