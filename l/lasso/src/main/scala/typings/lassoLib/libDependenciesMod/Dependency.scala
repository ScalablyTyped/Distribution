package typings
package lassoLib.libDependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dependency
  extends eventsLib.eventsMod.EventEmitter
     with DependencyConfig {
  var _packageDependency: js.UndefOr[scala.Boolean] = js.native
  var contentType: js.UndefOr[java.lang.String] = js.native
  var properties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.native
  def apply(dependencyConfig: DependencyConfig, dirname: java.lang.String): Dependency = js.native
  def apply(dependencyConfig: DependencyConfig, dirname: java.lang.String, filename: java.lang.String): Dependency = js.native
  def calculateKey(lassoContext: lassoLib.libLassoContextMod.default, callback: Callback): js.Any = js.native
  def calculateKeyFromProps(): java.lang.String = js.native
  def createPackageManifest(): js.Any = js.native
  def createPackageManifest(manifest: js.Any): js.Any = js.native
  def createPackageManifest(manifest: js.Any, dirname: java.lang.String): js.Any = js.native
  def createPackageManifest(manifest: js.Any, dirname: java.lang.String, filename: java.lang.String): js.Any = js.native
  def createReadStream(lassoContext: lassoLib.libLassoContextMod.default): js.Any = js.native
  def doCalculateKey(lassoContext: lassoLib.libLassoContextMod.default, callback: Callback): js.Any = js.native
  def doGetLastModified(lassoContext: js.Any, callback: Callback): js.Any = js.native
  def doInit(lassoContext: lassoLib.libLassoContextMod.default, callback: Callback): scala.Unit = js.native
  def getContentType(): js.Any = js.native
  def getDefaultBundleName(): java.lang.String = js.native
  def getDefaultBundleName(pageBundleName: java.lang.String): java.lang.String = js.native
  def getDefaultBundleName(pageBundleName: java.lang.String, lassoContext: lassoLib.libLassoContextMod.default): java.lang.String = js.native
  def getDir(): java.lang.String | scala.Null = js.native
  def getFileLastModified(path: java.lang.String, callback: Callback): js.Any = js.native
  def getJavaScriptSlot(): js.Any = js.native
  def getKey(): js.Any = js.native
  def getLastModified(lassoContext: lassoLib.libLassoContextMod.default, callback: Callback): js.Any = js.native
  def getPackageManifest(lassoContext: lassoLib.libLassoContextMod.default, callback: Callback): js.Any = js.native
  def getParentManifestDir(): java.lang.String = js.native
  def getParentManifestPath(): java.lang.String = js.native
  def getPropsKey(): js.Any = js.native
  def getReadCacheKey(): js.Any = js.native
  def getSlot(): js.Any = js.native
  def getSourceFile(): js.Any = js.native
  def getStyleSheetSlot(): js.Any = js.native
  def hasContent(): scala.Boolean = js.native
  def hasModifiedFingerprint(): scala.Boolean = js.native
  def init(lassoContext: lassoLib.libLassoContextMod.default, callback: Callback): js.Any = js.native
  def inspect(): js.Any = js.native
  def isCompiled(): scala.Boolean = js.native
  def isExternalResource(): scala.Boolean = js.native
  def isInPlaceDeploymentAllowed(): scala.Boolean = js.native
  def isJavaScript(): scala.Boolean = js.native
  def isPackageDependency(): scala.Boolean = js.native
  def isPageBundleOnlyDependency(): scala.Boolean = js.native
  def isStyleSheet(): scala.Boolean = js.native
  def onAddToAsyncPageBundle(bundle: Bundle, lassoContext: lassoLib.libLassoContextMod.default): scala.Unit = js.native
  def onAddToPageBundle(bundle: Bundle, lassoContext: lassoLib.libLassoContextMod.default): scala.Unit = js.native
  def read(context: js.Any, callback: Callback): js.Any = js.native
  def resolvePath(path: java.lang.String): java.lang.String = js.native
  def resolvePath(path: java.lang.String, from: java.lang.String): java.lang.String = js.native
  def set(props: js.Any): scala.Unit = js.native
  def shouldCache(lassoContext: lassoLib.libLassoContextMod.default): scala.Boolean = js.native
}

