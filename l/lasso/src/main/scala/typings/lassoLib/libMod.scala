package typings
package lassoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  val defaultConfig: lassoLib.libLassoMod.LassoConfig = js.native
  val defaultConfigBaseDir: java.lang.String = js.native
  val defaultConfigFilename: java.lang.String | scala.Null = js.native
  val lassoPage: lassoLib.libLassoMod.LassoPage = js.native
  val lassoResource: lassoLib.libLassoMod.LassoResource = js.native
  def clearCaches(): scala.Unit = js.native
  def configure(): scala.Unit = js.native
  def configure(config: java.lang.String): scala.Unit = js.native
  def configure(config: java.lang.String, baseDir: java.lang.String): scala.Unit = js.native
  def configure(config: java.lang.String, baseDir: java.lang.String, filename: java.lang.String): scala.Unit = js.native
  def configure(config: lassoLib.libLassoMod.LassoConfig): scala.Unit = js.native
  def configure(config: lassoLib.libLassoMod.LassoConfig, baseDir: java.lang.String): scala.Unit = js.native
  def configure(config: lassoLib.libLassoMod.LassoConfig, baseDir: java.lang.String, filename: java.lang.String): scala.Unit = js.native
  def create(): lassoLib.libLassoMod.default = js.native
  def create(config: java.lang.String): lassoLib.libLassoMod.default = js.native
  def create(config: java.lang.String, baseDir: java.lang.String): lassoLib.libLassoMod.default = js.native
  def create(config: java.lang.String, baseDir: java.lang.String, filename: java.lang.String): lassoLib.libLassoMod.default = js.native
  def create(config: lassoLib.libLassoMod.LassoConfig): lassoLib.libLassoMod.default = js.native
  def create(config: lassoLib.libLassoMod.LassoConfig, baseDir: java.lang.String): lassoLib.libLassoMod.default = js.native
  def create(config: lassoLib.libLassoMod.LassoConfig, baseDir: java.lang.String, filename: java.lang.String): lassoLib.libLassoMod.default = js.native
  def createFlagSet(flags: js.Any): js.Any = js.native
  def flushAllCaches(): scala.Unit = js.native
  def flushAllCaches(callback: js.Any): scala.Unit = js.native
  def getClientPath(path: java.lang.String): java.lang.String = js.native
  def getClientPath(path: java.lang.String, options: js.Any): java.lang.String = js.native
  def getDefaultLasso(): lassoLib.libLassoMod.default = js.native
  def handleWatchedFileChanged(path: java.lang.String): scala.Unit = js.native
  def isFlagSet(o: js.Any): scala.Boolean = js.native
  def setDevelopmentMode(): scala.Unit = js.native
  @JSName("transforms")
  @js.native
  object transformsNs extends js.Object {
    def createTransformer(
      unfilteredTransforms: js.Array[_],
      lassoContext: lassoLib.libLassoContextMod.default,
      callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], _]
    ): scala.Unit = js.native
  }
  
  @JSName("writers")
  @js.native
  object writersNs extends js.Object {
    def createWriter(writerImpl: js.Any): lassoLib.libWritersMod.Writer = js.native
    def fileWriter(fileWriterConfig: js.Any, lassoConfig: lassoLib.libLassoMod.LassoConfig): js.Any = js.native
  }
  
}

