package typings.lasso

import typings.lasso.lassoMod.LassoConfig
import typings.lasso.lassoMod.LassoPage
import typings.lasso.lassoMod.LassoResource
import typings.lasso.lassoMod.default
import typings.lasso.writersMod.Writer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  val defaultConfig: LassoConfig = js.native
  val defaultConfigBaseDir: String = js.native
  val defaultConfigFilename: String | Null = js.native
  val lassoPage: LassoPage = js.native
  val lassoResource: LassoResource = js.native
  def clearCaches(): Unit = js.native
  def configure(): Unit = js.native
  def configure(config: js.UndefOr[scala.Nothing], baseDir: js.UndefOr[scala.Nothing], filename: String): Unit = js.native
  def configure(config: js.UndefOr[scala.Nothing], baseDir: String): Unit = js.native
  def configure(config: js.UndefOr[scala.Nothing], baseDir: String, filename: String): Unit = js.native
  def configure(config: String): Unit = js.native
  def configure(config: String, baseDir: js.UndefOr[scala.Nothing], filename: String): Unit = js.native
  def configure(config: String, baseDir: String): Unit = js.native
  def configure(config: String, baseDir: String, filename: String): Unit = js.native
  def configure(config: LassoConfig): Unit = js.native
  def configure(config: LassoConfig, baseDir: js.UndefOr[scala.Nothing], filename: String): Unit = js.native
  def configure(config: LassoConfig, baseDir: String): Unit = js.native
  def configure(config: LassoConfig, baseDir: String, filename: String): Unit = js.native
  def create(): default = js.native
  def create(config: js.UndefOr[scala.Nothing], baseDir: js.UndefOr[scala.Nothing], filename: String): default = js.native
  def create(config: js.UndefOr[scala.Nothing], baseDir: String): default = js.native
  def create(config: js.UndefOr[scala.Nothing], baseDir: String, filename: String): default = js.native
  def create(config: String): default = js.native
  def create(config: String, baseDir: js.UndefOr[scala.Nothing], filename: String): default = js.native
  def create(config: String, baseDir: String): default = js.native
  def create(config: String, baseDir: String, filename: String): default = js.native
  def create(config: LassoConfig): default = js.native
  def create(config: LassoConfig, baseDir: js.UndefOr[scala.Nothing], filename: String): default = js.native
  def create(config: LassoConfig, baseDir: String): default = js.native
  def create(config: LassoConfig, baseDir: String, filename: String): default = js.native
  def createFlagSet(flags: js.Any): js.Any = js.native
  def flushAllCaches(): Unit = js.native
  def flushAllCaches(callback: js.Any): Unit = js.native
  def getClientPath(path: String): String = js.native
  def getClientPath(path: String, options: js.Any): String = js.native
  def getDefaultLasso(): default = js.native
  def handleWatchedFileChanged(path: String): Unit = js.native
  def isFlagSet(o: js.Any): Boolean = js.native
  def setDevelopmentMode(): Unit = js.native
  @js.native
  object transforms extends js.Object {
    def createTransformer(
      unfilteredTransforms: js.Array[_],
      lassoContext: typings.lasso.lassoContextMod.default,
      callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], _]
    ): Unit = js.native
  }
  
  @js.native
  object writers extends js.Object {
    def createWriter(writerImpl: js.Any): Writer = js.native
    def fileWriter(fileWriterConfig: js.Any, lassoConfig: LassoConfig): js.Any = js.native
  }
  
}

