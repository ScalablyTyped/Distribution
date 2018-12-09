package typings
package lassoLib.libLassoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lasso
  extends nodeLib.eventsMod.EventEmitter {
  var config: LassoConfig = js.native
  var dependencies: lassoLib.libDependenciesMod.DependencyRegistry = js.native
  var lassoCacheLookup: js.Any = js.native
  @JSName("lassoPage")
  var lassoPage_Original: LassoPage = js.native
  @JSName("lassoResource")
  var lassoResource_Original: LassoResource = js.native
  var writer: lassoLib.libWritersMod.Writer = js.native
  def addTransform(transform: js.Any): scala.Unit = js.native
  def buildLassoCacheKey(lassoContext: lassoLib.libLassoContextMod.default): lassoLib.Anon_Value = js.native
  def buildPageBundles(options: js.Any, lassoContext: lassoLib.libLassoContextMod.default, callback: Callback): scala.Unit = js.native
  def createAppBundleMappings(bundleSetConfig: js.Any, lassoContext: lassoLib.libLassoContextMod.default, callback: Callback): js.Any = js.native
  def createLassoContext(): lassoLib.libLassoContextMod.default = js.native
  def createLassoContext(options: js.Any): lassoLib.libLassoContextMod.default = js.native
  def getAppBundleMappingsCached(bundleSetConfig: js.Any, lassoContext: lassoLib.libLassoContextMod.default, callback: Callback): scala.Unit = js.native
  def getCSSDependencyHtml(url: java.lang.String): java.lang.String = js.native
  def getCSSDependencyHtml(url: java.lang.String, attributes: js.Any): java.lang.String = js.native
  def getConfig(): LassoConfig = js.native
  def getDependencyRegistry(): lassoLib.libDependenciesMod.DependencyRegistry = js.native
  def getJavaScriptDependencyHtml(url: java.lang.String): java.lang.String = js.native
  def getJavaScriptDependencyHtml(url: java.lang.String, attributes: js.Any): java.lang.String = js.native
  def getLassoCache(lassoContext: lassoLib.libLassoContextMod.default): js.Any = js.native
  def initPlugins(): scala.Unit = js.native
  def lassoPage(options: PageConfig): js.Promise[_] = js.native
  def lassoPage(
    options: PageConfig,
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* result */ lassoLib.libLassoPageResultMod.LassoPageResult, 
      scala.Unit
    ]
  ): js.Promise[_] = js.native
  def lassoResource(path: java.lang.String): scala.Unit = js.native
  def lassoResource(path: java.lang.String, options: js.Any): scala.Unit = js.native
  def lassoResource(path: java.lang.String, options: js.Any, callback: Callback): scala.Unit = js.native
  def setCSPNonceProvider(func: js.Any): js.Any = js.native
}

