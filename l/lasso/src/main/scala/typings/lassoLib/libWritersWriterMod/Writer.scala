package typings
package lassoLib.libWritersWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Writer
  extends eventsLib.eventsMod.EventEmitter {
  var config: lassoLib.libLassoMod.LassoConfig = js.native
  var impl: js.Any = js.native
  var lasso: lassoLib.libLassoMod.default = js.native
  def apply(impl: js.Any): Writer = js.native
  def buildResourceCacheKey(cacheKey: java.lang.String, lassoContext: lassoLib.libLassoContextMod.default): java.lang.String = js.native
  def checkBundleUpToDate(
    bundle: lassoLib.libDependenciesMod.Bundle,
    lassoContext: lassoLib.libLassoContextMod.default,
    callback: js.Any
  ): js.Any = js.native
  def checkResourceUpToDate(path: java.lang.String, lassoContext: lassoLib.libLassoContextMod.default, callback: js.Any): js.Any = js.native
  def getInPlaceUrlForBundle(bundle: lassoLib.libDependenciesMod.Bundle, lassoContext: lassoLib.libLassoContextMod.default): java.lang.String = js.native
  def getInPlaceUrlForFile(path: java.lang.String, lassoContext: lassoLib.libLassoContextMod.default): java.lang.String | scala.Null = js.native
  def getLasso(): lassoLib.libLassoMod.default = js.native
  def setLasso(lasso: lassoLib.libLassoMod.default): scala.Unit = js.native
  def writeBundle(
    bundle: lassoLib.libDependenciesMod.Bundle,
    onBundleWrittenCallback: js.Any,
    lassoContext: lassoLib.libLassoContextMod.default,
    callback: js.Any
  ): js.Any = js.native
  def writeBundles(
    iteratorFunc: js.Any,
    onBundleWrittenCallback: js.Any,
    lassoContext: lassoLib.libLassoContextMod.default,
    callback: js.Any
  ): scala.Unit = js.native
  def writeResource(path: java.lang.String, lassoContext: lassoLib.libLassoContextMod.default, callback: js.Any): js.Any = js.native
}

