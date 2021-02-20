package typings.lasso

import typings.lasso.lassoMod.LassoConfig
import typings.lasso.lassoMod.LassoPage
import typings.lasso.lassoMod.LassoResource
import typings.lasso.lassoMod.default
import typings.lasso.writersMod.Writer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("lasso/lib", "clearCaches")
  @js.native
  def clearCaches(): Unit = js.native
  
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: js.UndefOr[scala.Nothing], baseDir: js.UndefOr[scala.Nothing], filename: String): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: js.UndefOr[scala.Nothing], baseDir: String): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: js.UndefOr[scala.Nothing], baseDir: String, filename: String): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: String): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: String, baseDir: js.UndefOr[scala.Nothing], filename: String): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: String, baseDir: String): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: String, baseDir: String, filename: String): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: LassoConfig): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: LassoConfig, baseDir: js.UndefOr[scala.Nothing], filename: String): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: LassoConfig, baseDir: String): Unit = js.native
  @JSImport("lasso/lib", "configure")
  @js.native
  def configure(config: LassoConfig, baseDir: String, filename: String): Unit = js.native
  
  @JSImport("lasso/lib", "create")
  @js.native
  def create(): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: js.UndefOr[scala.Nothing], baseDir: js.UndefOr[scala.Nothing], filename: String): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: js.UndefOr[scala.Nothing], baseDir: String): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: js.UndefOr[scala.Nothing], baseDir: String, filename: String): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: String): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: String, baseDir: js.UndefOr[scala.Nothing], filename: String): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: String, baseDir: String): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: String, baseDir: String, filename: String): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: LassoConfig): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: LassoConfig, baseDir: js.UndefOr[scala.Nothing], filename: String): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: LassoConfig, baseDir: String): default = js.native
  @JSImport("lasso/lib", "create")
  @js.native
  def create(config: LassoConfig, baseDir: String, filename: String): default = js.native
  
  @JSImport("lasso/lib", "createFlagSet")
  @js.native
  def createFlagSet(flags: js.Any): js.Any = js.native
  
  @JSImport("lasso/lib", "defaultConfig")
  @js.native
  val defaultConfig: LassoConfig = js.native
  
  @JSImport("lasso/lib", "defaultConfigBaseDir")
  @js.native
  val defaultConfigBaseDir: String = js.native
  
  @JSImport("lasso/lib", "defaultConfigFilename")
  @js.native
  val defaultConfigFilename: String | Null = js.native
  
  @JSImport("lasso/lib", "flushAllCaches")
  @js.native
  def flushAllCaches(): Unit = js.native
  @JSImport("lasso/lib", "flushAllCaches")
  @js.native
  def flushAllCaches(callback: js.Any): Unit = js.native
  
  @JSImport("lasso/lib", "getClientPath")
  @js.native
  def getClientPath(path: String): String = js.native
  @JSImport("lasso/lib", "getClientPath")
  @js.native
  def getClientPath(path: String, options: js.Any): String = js.native
  
  @JSImport("lasso/lib", "getDefaultLasso")
  @js.native
  def getDefaultLasso(): default = js.native
  
  @JSImport("lasso/lib", "handleWatchedFileChanged")
  @js.native
  def handleWatchedFileChanged(path: String): Unit = js.native
  
  @JSImport("lasso/lib", "isFlagSet")
  @js.native
  def isFlagSet(o: js.Any): Boolean = js.native
  
  @JSImport("lasso/lib", "lassoPage")
  @js.native
  val lassoPage: LassoPage = js.native
  
  @JSImport("lasso/lib", "lassoResource")
  @js.native
  val lassoResource: LassoResource = js.native
  
  @JSImport("lasso/lib", "setDevelopmentMode")
  @js.native
  def setDevelopmentMode(): Unit = js.native
  
  object transforms {
    
    @JSImport("lasso/lib", "transforms.createTransformer")
    @js.native
    def createTransformer(
      unfilteredTransforms: js.Array[_],
      lassoContext: typings.lasso.lassoContextMod.default,
      callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], _]
    ): Unit = js.native
  }
  
  object writers {
    
    @JSImport("lasso/lib", "writers.createWriter")
    @js.native
    def createWriter(writerImpl: js.Any): Writer = js.native
    
    @JSImport("lasso/lib", "writers.fileWriter")
    @js.native
    def fileWriter(fileWriterConfig: js.Any, lassoConfig: LassoConfig): js.Any = js.native
  }
}
