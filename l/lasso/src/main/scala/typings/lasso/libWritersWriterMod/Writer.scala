package typings.lasso.libWritersWriterMod

import typings.lasso.libDependenciesMod.Bundle
import typings.lasso.libLassoMod.LassoConfig
import typings.lasso.libLassoMod.default
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Writer extends EventEmitter {
  var config: LassoConfig = js.native
  var impl: js.Any = js.native
  var lasso: default = js.native
  def apply(impl: js.Any): Writer = js.native
  def buildResourceCacheKey(cacheKey: String, lassoContext: typings.lasso.libLassoContextMod.default): String = js.native
  def checkBundleUpToDate(bundle: Bundle, lassoContext: typings.lasso.libLassoContextMod.default, callback: js.Any): js.Any = js.native
  def checkResourceUpToDate(path: String, lassoContext: typings.lasso.libLassoContextMod.default, callback: js.Any): js.Any = js.native
  def getInPlaceUrlForBundle(bundle: Bundle, lassoContext: typings.lasso.libLassoContextMod.default): String = js.native
  def getInPlaceUrlForFile(path: String, lassoContext: typings.lasso.libLassoContextMod.default): String | Null = js.native
  def getLasso(): default = js.native
  def setLasso(lasso: default): Unit = js.native
  def writeBundle(
    bundle: Bundle,
    onBundleWrittenCallback: js.Any,
    lassoContext: typings.lasso.libLassoContextMod.default,
    callback: js.Any
  ): js.Any = js.native
  def writeBundles(
    iteratorFunc: js.Any,
    onBundleWrittenCallback: js.Any,
    lassoContext: typings.lasso.libLassoContextMod.default,
    callback: js.Any
  ): Unit = js.native
  def writeResource(path: String, lassoContext: typings.lasso.libLassoContextMod.default, callback: js.Any): js.Any = js.native
}

