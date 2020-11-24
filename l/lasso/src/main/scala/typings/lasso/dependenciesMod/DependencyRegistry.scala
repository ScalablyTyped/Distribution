package typings.lasso.dependenciesMod

import typings.lasso.lassoContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyRegistry extends js.Object {
  
  def addNormalizer(normalizerFunc: js.Any): js.Any = js.native
  
  def createDependency(config: js.Any, dirname: String): js.Any = js.native
  def createDependency(config: js.Any, dirname: String, filename: String): js.Any = js.native
  
  def createRequireHandler(path: String, lassoContext: default, userOptions: js.Any): js.Any = js.native
  
  def createResourceTransformType(transformFunc: js.Any): js.Any = js.native
  
  var extensions: js.Any = js.native
  
  def getRequireExtensionNames(): js.Any = js.native
  
  def getRequireHandler(path: String, lassoContext: default): js.Any = js.native
  
  def getType(`type`: String): js.Any = js.native
  
  def normalizeDependencies(dependencies: js.Array[_], dirname: String, filename: String, callback: Callback): js.Any = js.native
  
  def registerDefaults(): Unit = js.native
  
  def registerExtension(extension: String, `type`: String): Unit = js.native
  
  def registerJavaScriptType(`type`: String, mixins: js.Any): Unit = js.native
  
  def registerPackageType(`type`: String, mixins: js.Any): Unit = js.native
  
  def registerRequireExtension(ext: String, options: js.Any): Unit = js.native
  
  def registerRequireType(`type`: String, options: js.Any): Unit = js.native
  
  def registerStyleSheetType(`type`: String, mixins: js.Any): Unit = js.native
  
  def registerType(`type`: String, mixins: js.Any): Unit = js.native
  
  var registeredTypes: js.Any = js.native
  
  var requireExtensionNames: js.Any = js.native
  
  var requireExtensions: js.Any = js.native
  
  def typeForPath(path: String): String = js.native
}
