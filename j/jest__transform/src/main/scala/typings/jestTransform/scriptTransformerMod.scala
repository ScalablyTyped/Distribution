package typings.jestTransform

import typings.jestTransform.jestTransformStrings.ObjectDotLessthansignanonymousGreaterthansign
import typings.jestTransform.typesMod.Options
import typings.jestTransform.typesMod.TransformResult
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/transform/build/ScriptTransformer", JSImport.Namespace)
@js.native
object scriptTransformerMod extends js.Object {
  @js.native
  trait ScriptTransformer extends js.Object {
    var _cache: js.Any = js.native
    var _config: js.Any = js.native
    var _getCacheKey: js.Any = js.native
    var _getFileCachePath: js.Any = js.native
    var _getRealPath: js.Any = js.native
    var _getTransformPath: js.Any = js.native
    var _getTransformer: js.Any = js.native
    var _instrumentFile: js.Any = js.native
    /**
      * @deprecated use `this.shouldTransform` instead
      */
    var _shouldTransform: js.Any = js.native
    var _transformAndBuildScript: js.Any = js.native
    var _transformCache: js.Any = js.native
    var _transformConfigCache: js.Any = js.native
    def preloadTransformer(filepath: Path): Unit = js.native
    def requireAndTranspileModule[ModuleType](moduleName: String): ModuleType = js.native
    def requireAndTranspileModule[ModuleType](moduleName: String, callback: js.Function1[/* module */ ModuleType, Unit]): ModuleType = js.native
    @JSName("requireAndTranspileModule")
    def requireAndTranspileModule_ModuleType_Promise[ModuleType](moduleName: String): js.Promise[ModuleType] = js.native
    @JSName("requireAndTranspileModule")
    def requireAndTranspileModule_ModuleType_Promise[ModuleType](moduleName: String, callback: js.Function1[/* module */ ModuleType, js.Promise[Unit]]): js.Promise[ModuleType] = js.native
    def shouldTransform(filename: Path): Boolean = js.native
    def transform(filename: Path, options: Options): TransformResult = js.native
    def transform(filename: Path, options: Options, fileSource: String): TransformResult = js.native
    def transformJson(filename: Path, options: Options, fileSource: String): String = js.native
    def transformSource(filepath: Path, content: String, instrument: Boolean): AnonCode = js.native
  }
  
  @js.native
  class default protected () extends ScriptTransformer {
    def this(config: ProjectConfig) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var EVAL_RESULT_VARIABLE: ObjectDotLessthansignanonymousGreaterthansign = js.native
  }
  
}

