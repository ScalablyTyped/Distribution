package typings.lasso.libLassoMod

import typings.lasso.Anon_Parts
import typings.lasso.libDependenciesMod.DependencyRegistry
import typings.lasso.libLassoPageResultMod.LassoPageResult
import typings.lasso.libWritersMod.Writer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lasso extends EventEmitter {
  var config: LassoConfig = js.native
  var dependencies: DependencyRegistry = js.native
  var lassoCacheLookup: js.Any = js.native
  @JSName("lassoPage")
  var lassoPage_Original: LassoPage = js.native
  @JSName("lassoResource")
  var lassoResource_Original: LassoResource = js.native
  @JSName("writer")
  var writer_Original: Writer = js.native
  def addTransform(transform: js.Any): Unit = js.native
  def buildLassoCacheKey(lassoContext: typings.lasso.libLassoContextMod.default): Anon_Parts = js.native
  def buildPageBundles(options: js.Any, lassoContext: typings.lasso.libLassoContextMod.default, callback: Callback): Unit = js.native
  def createAppBundleMappings(
    bundleSetConfig: js.Any,
    lassoContext: typings.lasso.libLassoContextMod.default,
    callback: Callback
  ): js.Any = js.native
  def createLassoContext(): typings.lasso.libLassoContextMod.default = js.native
  def createLassoContext(options: js.Any): typings.lasso.libLassoContextMod.default = js.native
  def getAppBundleMappingsCached(
    bundleSetConfig: js.Any,
    lassoContext: typings.lasso.libLassoContextMod.default,
    callback: Callback
  ): Unit = js.native
  def getCSSDependencyHtml(url: String): String = js.native
  def getCSSDependencyHtml(url: String, attributes: js.Any): String = js.native
  def getConfig(): LassoConfig = js.native
  def getDependencyRegistry(): DependencyRegistry = js.native
  def getJavaScriptDependencyHtml(url: String): String = js.native
  def getJavaScriptDependencyHtml(url: String, attributes: js.Any): String = js.native
  def getLassoCache(lassoContext: typings.lasso.libLassoContextMod.default): js.Any = js.native
  def initPlugins(): Unit = js.native
  def lassoPage(options: PageConfig): js.Promise[_] = js.native
  def lassoPage(
    options: PageConfig,
    callback: js.Function2[/* err */ Error | Null, /* result */ LassoPageResult, Unit]
  ): js.Promise[_] = js.native
  def lassoResource(path: String): Unit = js.native
  def lassoResource(path: String, options: js.Any): Unit = js.native
  def lassoResource(path: String, options: js.Any, callback: Callback): Unit = js.native
  def setCSPNonceProvider(func: js.Any): js.Any = js.native
  def writer(impl: js.Any): typings.lasso.libWritersWriterMod.Writer = js.native
}

