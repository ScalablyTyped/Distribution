package typings.lasso.lassoMod

import typings.lasso.anon.Parts
import typings.lasso.dependenciesMod.DependencyRegistry
import typings.lasso.lassoPageResultMod.LassoPageResult
import typings.lasso.writerMod.Writer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lasso extends EventEmitter {
  
  def addTransform(transform: js.Any): Unit = js.native
  
  def buildLassoCacheKey(lassoContext: typings.lasso.lassoContextMod.default): Parts = js.native
  
  def buildPageBundles(options: js.Any, lassoContext: typings.lasso.lassoContextMod.default, callback: Callback): Unit = js.native
  
  var config: LassoConfig = js.native
  
  def createAppBundleMappings(bundleSetConfig: js.Any, lassoContext: typings.lasso.lassoContextMod.default, callback: Callback): js.Any = js.native
  
  def createLassoContext(): typings.lasso.lassoContextMod.default = js.native
  def createLassoContext(options: js.Any): typings.lasso.lassoContextMod.default = js.native
  
  var dependencies: DependencyRegistry = js.native
  
  def getAppBundleMappingsCached(bundleSetConfig: js.Any, lassoContext: typings.lasso.lassoContextMod.default, callback: Callback): Unit = js.native
  
  def getCSSDependencyHtml(url: String): String = js.native
  def getCSSDependencyHtml(url: String, attributes: js.Any): String = js.native
  
  def getConfig(): LassoConfig = js.native
  
  def getDependencyRegistry(): DependencyRegistry = js.native
  
  def getJavaScriptDependencyHtml(url: String): String = js.native
  def getJavaScriptDependencyHtml(url: String, attributes: js.Any): String = js.native
  
  def getLassoCache(lassoContext: typings.lasso.lassoContextMod.default): js.Any = js.native
  
  def initPlugins(): Unit = js.native
  
  var lassoCacheLookup: js.Any = js.native
  
  def lassoPage(options: PageConfig): js.Promise[_] = js.native
  def lassoPage(
    options: PageConfig,
    callback: js.Function2[/* err */ Error | Null, /* result */ LassoPageResult, Unit]
  ): js.Promise[_] = js.native
  @JSName("lassoPage")
  var lassoPage_Original: LassoPage = js.native
  
  def lassoResource(path: String): Unit = js.native
  def lassoResource(path: String, options: js.UndefOr[scala.Nothing], callback: Callback): Unit = js.native
  def lassoResource(path: String, options: js.Any): Unit = js.native
  def lassoResource(path: String, options: js.Any, callback: Callback): Unit = js.native
  @JSName("lassoResource")
  var lassoResource_Original: LassoResource = js.native
  
  def setCSPNonceProvider(func: js.Any): js.Any = js.native
  
  def writer(impl: js.Any): Writer = js.native
  @JSName("writer")
  var writer_Original: typings.lasso.writersMod.Writer = js.native
}
