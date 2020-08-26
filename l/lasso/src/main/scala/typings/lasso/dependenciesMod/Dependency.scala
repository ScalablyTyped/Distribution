package typings.lasso.dependenciesMod

import org.scalablytyped.runtime.StringDictionary
import typings.lasso.lassoContextMod.default
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dependency
  extends EventEmitter
     with DependencyConfig {
  var _packageDependency: js.UndefOr[Boolean] = js.native
  var contentType: js.UndefOr[String] = js.native
  var properties: js.UndefOr[StringDictionary[String]] = js.native
  def apply(dependencyConfig: DependencyConfig, dirname: String): Dependency = js.native
  def apply(dependencyConfig: DependencyConfig, dirname: String, filename: String): Dependency = js.native
  def calculateKey(lassoContext: default, callback: Callback): js.Any = js.native
  def calculateKeyFromProps(): String = js.native
  def createPackageManifest(): js.Any = js.native
  def createPackageManifest(manifest: js.UndefOr[scala.Nothing], dirname: js.UndefOr[scala.Nothing], filename: String): js.Any = js.native
  def createPackageManifest(manifest: js.UndefOr[scala.Nothing], dirname: String): js.Any = js.native
  def createPackageManifest(manifest: js.UndefOr[scala.Nothing], dirname: String, filename: String): js.Any = js.native
  def createPackageManifest(manifest: js.Any): js.Any = js.native
  def createPackageManifest(manifest: js.Any, dirname: js.UndefOr[scala.Nothing], filename: String): js.Any = js.native
  def createPackageManifest(manifest: js.Any, dirname: String): js.Any = js.native
  def createPackageManifest(manifest: js.Any, dirname: String, filename: String): js.Any = js.native
  def createReadStream(lassoContext: default): js.Any = js.native
  def doCalculateKey(lassoContext: default, callback: Callback): js.Any = js.native
  def doGetLastModified(lassoContext: js.Any, callback: Callback): js.Any = js.native
  def doInit(lassoContext: default, callback: Callback): Unit = js.native
  def getContentType(): js.Any = js.native
  def getDefaultBundleName(): String = js.native
  def getDefaultBundleName(pageBundleName: js.UndefOr[scala.Nothing], lassoContext: default): String = js.native
  def getDefaultBundleName(pageBundleName: String): String = js.native
  def getDefaultBundleName(pageBundleName: String, lassoContext: default): String = js.native
  def getDir(): String | Null = js.native
  def getFileLastModified(path: String, callback: Callback): js.Any = js.native
  def getJavaScriptSlot(): js.Any = js.native
  def getKey(): js.Any = js.native
  def getLastModified(lassoContext: default, callback: Callback): js.Any = js.native
  def getPackageManifest(lassoContext: default, callback: Callback): js.Any = js.native
  def getParentManifestDir(): String = js.native
  def getParentManifestPath(): String = js.native
  def getPropsKey(): js.Any = js.native
  def getReadCacheKey(): js.Any = js.native
  def getSlot(): js.Any = js.native
  def getSourceFile(): js.Any = js.native
  def getStyleSheetSlot(): js.Any = js.native
  def hasContent(): Boolean = js.native
  def hasModifiedFingerprint(): Boolean = js.native
  def init(lassoContext: default, callback: Callback): js.Any = js.native
  def inspect(): js.Any = js.native
  def isCompiled(): Boolean = js.native
  def isExternalResource(): Boolean = js.native
  def isInPlaceDeploymentAllowed(): Boolean = js.native
  def isJavaScript(): Boolean = js.native
  def isPackageDependency(): Boolean = js.native
  def isPageBundleOnlyDependency(): Boolean = js.native
  def isStyleSheet(): Boolean = js.native
  def onAddToAsyncPageBundle(bundle: Bundle, lassoContext: default): Unit = js.native
  def onAddToPageBundle(bundle: Bundle, lassoContext: default): Unit = js.native
  def read(context: js.Any, callback: Callback): js.Any = js.native
  def resolvePath(path: String): String = js.native
  def resolvePath(path: String, from: String): String = js.native
  def set(props: js.Any): Unit = js.native
  def shouldCache(lassoContext: default): Boolean = js.native
}

