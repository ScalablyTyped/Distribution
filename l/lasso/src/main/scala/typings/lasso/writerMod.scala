package typings.lasso

import typings.lasso.dependenciesMod.Bundle
import typings.lasso.lassoMod.LassoConfig
import typings.lasso.lassoMod.default
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/lib/writers/Writer", JSImport.Namespace)
@js.native
object writerMod extends js.Object {
  @js.native
  trait Writer extends EventEmitter {
    var config: LassoConfig = js.native
    var impl: js.Any = js.native
    var lasso: default = js.native
    def apply(impl: js.Any): Writer = js.native
    def buildResourceCacheKey(cacheKey: String, lassoContext: typings.lasso.lassoContextMod.default): String = js.native
    def checkBundleUpToDate(bundle: Bundle, lassoContext: typings.lasso.lassoContextMod.default, callback: js.Any): js.Any = js.native
    def checkResourceUpToDate(path: String, lassoContext: typings.lasso.lassoContextMod.default, callback: js.Any): js.Any = js.native
    def getInPlaceUrlForBundle(bundle: Bundle, lassoContext: typings.lasso.lassoContextMod.default): String = js.native
    def getInPlaceUrlForFile(path: String, lassoContext: typings.lasso.lassoContextMod.default): String | Null = js.native
    def getLasso(): default = js.native
    def setLasso(lasso: default): Unit = js.native
    def writeBundle(
      bundle: Bundle,
      onBundleWrittenCallback: js.Any,
      lassoContext: typings.lasso.lassoContextMod.default,
      callback: js.Any
    ): js.Any = js.native
    def writeBundles(
      iteratorFunc: js.Any,
      onBundleWrittenCallback: js.Any,
      lassoContext: typings.lasso.lassoContextMod.default,
      callback: js.Any
    ): Unit = js.native
    def writeResource(path: String, lassoContext: typings.lasso.lassoContextMod.default, callback: js.Any): js.Any = js.native
  }
  
}

