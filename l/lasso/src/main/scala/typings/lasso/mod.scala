package typings.lasso

import typings.lasso.lassoMod.LassoConfig
import typings.lasso.lassoMod.LassoPage
import typings.lasso.lassoMod.LassoResource
import typings.lasso.lassoMod.default
import typings.lasso.writersMod.Writer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lasso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clearCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCaches")().asInstanceOf[Unit]
  
  @scala.inline
  def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]
  @scala.inline
  def configure(config: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def configure(config: String, baseDir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(config: String, baseDir: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(config: String, baseDir: Unit, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(config: Unit, baseDir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(config: Unit, baseDir: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(config: Unit, baseDir: Unit, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(config: LassoConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def configure(config: LassoConfig, baseDir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(config: LassoConfig, baseDir: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def configure(config: LassoConfig, baseDir: Unit, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def create(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[default]
  @scala.inline
  def create(config: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[default]
  @scala.inline
  def create(config: String, baseDir: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[default]
  @scala.inline
  def create(config: String, baseDir: String, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  @scala.inline
  def create(config: String, baseDir: Unit, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  @scala.inline
  def create(config: Unit, baseDir: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[default]
  @scala.inline
  def create(config: Unit, baseDir: String, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  @scala.inline
  def create(config: Unit, baseDir: Unit, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  @scala.inline
  def create(config: LassoConfig): default = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[default]
  @scala.inline
  def create(config: LassoConfig, baseDir: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[default]
  @scala.inline
  def create(config: LassoConfig, baseDir: String, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  @scala.inline
  def create(config: LassoConfig, baseDir: Unit, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  
  @scala.inline
  def createFlagSet(flags: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFlagSet")(flags.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("lasso", "defaultConfig")
  @js.native
  val defaultConfig: LassoConfig = js.native
  
  @JSImport("lasso", "defaultConfigBaseDir")
  @js.native
  val defaultConfigBaseDir: String = js.native
  
  @JSImport("lasso", "defaultConfigFilename")
  @js.native
  val defaultConfigFilename: String | Null = js.native
  
  @scala.inline
  def flushAllCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushAllCaches")().asInstanceOf[Unit]
  @scala.inline
  def flushAllCaches(callback: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushAllCaches")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getClientPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getClientPath(path: String, options: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getClientPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getDefaultLasso(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLasso")().asInstanceOf[default]
  
  @scala.inline
  def handleWatchedFileChanged(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleWatchedFileChanged")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def isFlagSet(o: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlagSet")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("lasso", "lassoPage")
  @js.native
  val lassoPage: LassoPage = js.native
  
  @JSImport("lasso", "lassoResource")
  @js.native
  val lassoResource: LassoResource = js.native
  
  @scala.inline
  def setDevelopmentMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDevelopmentMode")().asInstanceOf[Unit]
  
  object transforms {
    
    @JSImport("lasso", "transforms")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createTransformer(
      unfilteredTransforms: js.Array[js.Any],
      lassoContext: typings.lasso.lassoContextMod.default,
      callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], js.Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(unfilteredTransforms.asInstanceOf[js.Any], lassoContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object writers {
    
    @JSImport("lasso", "writers")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createWriter(writerImpl: js.Any): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writerImpl.asInstanceOf[js.Any]).asInstanceOf[Writer]
    
    @scala.inline
    def fileWriter(fileWriterConfig: js.Any, lassoConfig: LassoConfig): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fileWriter")(fileWriterConfig.asInstanceOf[js.Any], lassoConfig.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
}
