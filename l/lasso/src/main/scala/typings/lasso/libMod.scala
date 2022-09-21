package typings.lasso

import typings.lasso.lassoMod.LassoConfig
import typings.lasso.lassoMod.LassoPage
import typings.lasso.lassoMod.LassoResource
import typings.lasso.lassoMod.default
import typings.lasso.writersMod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("lasso/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCaches")().asInstanceOf[Unit]
  
  inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]
  inline def configure(config: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(config: String, baseDir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def configure(config: String, baseDir: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def configure(config: String, baseDir: Unit, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def configure(config: Unit, baseDir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def configure(config: Unit, baseDir: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def configure(config: Unit, baseDir: Unit, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def configure(config: LassoConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def configure(config: LassoConfig, baseDir: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def configure(config: LassoConfig, baseDir: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def configure(config: LassoConfig, baseDir: Unit, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def create(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[default]
  inline def create(config: String): default = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def create(config: String, baseDir: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def create(config: String, baseDir: String, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def create(config: String, baseDir: Unit, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def create(config: Unit, baseDir: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def create(config: Unit, baseDir: String, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def create(config: Unit, baseDir: Unit, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def create(config: LassoConfig): default = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def create(config: LassoConfig, baseDir: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def create(config: LassoConfig, baseDir: String, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def create(config: LassoConfig, baseDir: Unit, filename: String): default = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], baseDir.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createFlagSet(flags: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFlagSet")(flags.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("lasso/lib", "defaultConfig")
  @js.native
  val defaultConfig: LassoConfig = js.native
  
  @JSImport("lasso/lib", "defaultConfigBaseDir")
  @js.native
  val defaultConfigBaseDir: String = js.native
  
  @JSImport("lasso/lib", "defaultConfigFilename")
  @js.native
  val defaultConfigFilename: String | Null = js.native
  
  inline def flushAllCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushAllCaches")().asInstanceOf[Unit]
  inline def flushAllCaches(callback: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flushAllCaches")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getClientPath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientPath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getClientPath(path: String, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getClientPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getDefaultLasso(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultLasso")().asInstanceOf[default]
  
  inline def handleWatchedFileChanged(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleWatchedFileChanged")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isFlagSet(o: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlagSet")(o.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("lasso/lib", "lassoPage")
  @js.native
  val lassoPage: LassoPage = js.native
  
  @JSImport("lasso/lib", "lassoResource")
  @js.native
  val lassoResource: LassoResource = js.native
  
  inline def setDevelopmentMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDevelopmentMode")().asInstanceOf[Unit]
  
  object transforms {
    
    @JSImport("lasso/lib", "transforms")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createTransformer(
      unfilteredTransforms: js.Array[Any],
      lassoContext: typings.lasso.lassoContextMod.default,
      callback: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Any], Any]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(unfilteredTransforms.asInstanceOf[js.Any], lassoContext.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object writers {
    
    @JSImport("lasso/lib", "writers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createWriter(writerImpl: Any): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writerImpl.asInstanceOf[js.Any]).asInstanceOf[Writer]
    
    inline def fileWriter(fileWriterConfig: Any, lassoConfig: LassoConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fileWriter")(fileWriterConfig.asInstanceOf[js.Any], lassoConfig.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
