package typings.lasso.libDependenciesMod

import org.scalablytyped.runtime.StringDictionary
import typings.lasso.libLassoContextMod.default
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
  /* InferMemberOverrides */
  override def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def calculateKey(lassoContext: default, callback: Callback): js.Any = js.native
  def calculateKeyFromProps(): String = js.native
  def createPackageManifest(): js.Any = js.native
  def createPackageManifest(manifest: js.Any): js.Any = js.native
  def createPackageManifest(manifest: js.Any, dirname: String): js.Any = js.native
  def createPackageManifest(manifest: js.Any, dirname: String, filename: String): js.Any = js.native
  def createReadStream(lassoContext: default): js.Any = js.native
  def doCalculateKey(lassoContext: default, callback: Callback): js.Any = js.native
  def doGetLastModified(lassoContext: js.Any, callback: Callback): js.Any = js.native
  def doInit(lassoContext: default, callback: Callback): Unit = js.native
  /* InferMemberOverrides */
  override def emit(event: String, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[String | js.Symbol] = js.native
  def getContentType(): js.Any = js.native
  def getDefaultBundleName(): String = js.native
  def getDefaultBundleName(pageBundleName: String): String = js.native
  def getDefaultBundleName(pageBundleName: String, lassoContext: default): String = js.native
  def getDir(): String | Null = js.native
  def getFileLastModified(path: String, callback: Callback): js.Any = js.native
  def getJavaScriptSlot(): js.Any = js.native
  def getKey(): js.Any = js.native
  def getLastModified(lassoContext: default, callback: Callback): js.Any = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): Double = js.native
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
  /* InferMemberOverrides */
  override def listenerCount(`type`: String): Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def onAddToAsyncPageBundle(bundle: Bundle, lassoContext: default): Unit = js.native
  def onAddToPageBundle(bundle: Bundle, lassoContext: default): Unit = js.native
  /* InferMemberOverrides */
  override def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  def read(context: js.Any, callback: Callback): js.Any = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def resolvePath(path: String): String = js.native
  def resolvePath(path: String, from: String): String = js.native
  def set(props: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: Double): this.type = js.native
  def shouldCache(lassoContext: default): Boolean = js.native
}

