package typings
package lassoLib.libDependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DependencyRegistry extends js.Object {
  var extensions: js.Any = js.native
  var registeredTypes: js.Any = js.native
  var requireExtensionNames: js.Any = js.native
  var requireExtensions: js.Any = js.native
  def addNormalizer(normalizerFunc: js.Any): js.Any = js.native
  def createDependency(config: js.Any, dirname: java.lang.String): js.Any = js.native
  def createDependency(config: js.Any, dirname: java.lang.String, filename: java.lang.String): js.Any = js.native
  def createRequireHandler(path: java.lang.String, lassoContext: lassoLib.libLassoContextMod.default, userOptions: js.Any): js.Any = js.native
  def createResourceTransformType(transformFunc: js.Any): js.Any = js.native
  def getRequireExtensionNames(): js.Any = js.native
  def getRequireHandler(path: java.lang.String, lassoContext: lassoLib.libLassoContextMod.default): js.Any = js.native
  def getType(`type`: java.lang.String): js.Any = js.native
  def normalizeDependencies(
    dependencies: js.Array[_],
    dirname: java.lang.String,
    filename: java.lang.String,
    callback: Callback
  ): js.Any = js.native
  def registerDefaults(): scala.Unit = js.native
  def registerExtension(extension: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def registerJavaScriptType(`type`: java.lang.String, mixins: js.Any): scala.Unit = js.native
  def registerPackageType(`type`: java.lang.String, mixins: js.Any): scala.Unit = js.native
  def registerRequireExtension(ext: java.lang.String, options: js.Any): scala.Unit = js.native
  def registerRequireType(`type`: java.lang.String, options: js.Any): scala.Unit = js.native
  def registerStyleSheetType(`type`: java.lang.String, mixins: js.Any): scala.Unit = js.native
  def registerType(`type`: java.lang.String, mixins: js.Any): scala.Unit = js.native
  def typeForPath(path: java.lang.String): java.lang.String = js.native
}

