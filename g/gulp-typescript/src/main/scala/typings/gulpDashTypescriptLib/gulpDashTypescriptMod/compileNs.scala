package typings
package gulpDashTypescriptLib.gulpDashTypescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript", "compile")
@js.native
object compileNs extends js.Object {
  
  trait Settings
    extends /* name */ ScalablyTyped.runtime.StringDictionary[js.Any] {
    var allowNonTsExtensions: js.UndefOr[scala.Boolean] = js.undefined
    var charset: js.UndefOr[java.lang.String] = js.undefined
    var codepage: js.UndefOr[scala.Double] = js.undefined
    var declaration: js.UndefOr[scala.Boolean] = js.undefined
    var declarationFiles: js.UndefOr[scala.Boolean] = js.undefined
    var experimentalDecorators: js.UndefOr[scala.Boolean] = js.undefined
    var isolatedModules: js.UndefOr[scala.Boolean] = js.undefined
    var jsx: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var lib: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var locale: js.UndefOr[java.lang.String] = js.undefined
    var mapRoot: js.UndefOr[java.lang.String] = js.undefined
    var module: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.tsNs.ModuleKind] = js.undefined
    var moduleResolution: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var noEmitOnError: js.UndefOr[scala.Boolean] = js.undefined
    var noExternalResolve: js.UndefOr[scala.Boolean] = js.undefined
    var noImplicitAny: js.UndefOr[scala.Boolean] = js.undefined
    var noLib: js.UndefOr[scala.Boolean] = js.undefined
    var noLibCheck: js.UndefOr[scala.Boolean] = js.undefined
    var noResolve: js.UndefOr[scala.Boolean] = js.undefined
    var out: js.UndefOr[java.lang.String] = js.undefined
    var outDir: js.UndefOr[java.lang.String] = js.undefined
    var outFile: js.UndefOr[java.lang.String] = js.undefined
    var preserveConstEnums: js.UndefOr[scala.Boolean] = js.undefined
    var removeComments: js.UndefOr[scala.Boolean] = js.undefined
    var rootDir: js.UndefOr[java.lang.String] = js.undefined
    var rootDirs: js.UndefOr[js.Any] = js.undefined
    var sortOutput: js.UndefOr[scala.Boolean] = js.undefined
    var sourceRoot: js.UndefOr[java.lang.String] = js.undefined
    var suppressImplicitAnyIndexErrors: js.UndefOr[scala.Boolean] = js.undefined
    var target: js.UndefOr[java.lang.String | typescriptLib.typescriptMod.tsNs.ScriptTarget] = js.undefined
    var typescript: js.UndefOr[js.Any] = js.undefined
  }
  
  @JSName("reporter")
  @js.native
  object reporterNs extends js.Object {
    
    trait CompilationResult extends js.Object {
      var declarationErrors: scala.Double
      var emitErrors: scala.Double
      var emitSkipped: scala.Boolean
      var globalErrors: scala.Double
      var noEmit: scala.Boolean
      var optionsErrors: scala.Double
      var semanticErrors: scala.Double
      var syntaxErrors: scala.Double
      /**
           * Only used when using isolatedModules.
           */
      var transpileErrors: scala.Double
    }
    
    
    trait Reporter extends js.Object {
      var error: js.UndefOr[
            js.Function2[
              /* error */ gulpDashTypescriptLib.releaseReporterMod.TypeScriptError, 
              /* typescript */ js.Any, 
              scala.Unit
            ]
          ] = js.undefined
      var finish: js.UndefOr[
            js.Function1[
              /* results */ gulpDashTypescriptLib.releaseReporterMod.CompilationResult, 
              scala.Unit
            ]
          ] = js.undefined
    }
    
    
    trait TypeScriptError
      extends nodeLib.Error {
      var diagnostic: typescriptLib.typescriptMod.tsNs.Diagnostic
      var endPosition: js.UndefOr[gulpDashTypescriptLib.Anon_Position] = js.undefined
      var file: js.UndefOr[vinylLib.vinylMod.File] = js.undefined
      var fullFilename: js.UndefOr[java.lang.String] = js.undefined
      var relativeFilename: js.UndefOr[java.lang.String] = js.undefined
      var startPosition: js.UndefOr[gulpDashTypescriptLib.Anon_Position] = js.undefined
      var tsFile: js.UndefOr[typescriptLib.typescriptMod.tsNs.SourceFile] = js.undefined
    }
    
    def countErrors(results: gulpDashTypescriptLib.releaseReporterMod.CompilationResult): scala.Double = js.native
    def defaultReporter(): gulpDashTypescriptLib.releaseReporterMod.Reporter = js.native
    def emptyCompilationResult(noEmit: scala.Boolean): gulpDashTypescriptLib.releaseReporterMod.CompilationResult = js.native
    def fullReporter(): gulpDashTypescriptLib.releaseReporterMod.Reporter = js.native
    def fullReporter(fullFilename: scala.Boolean): gulpDashTypescriptLib.releaseReporterMod.Reporter = js.native
    def longReporter(): gulpDashTypescriptLib.releaseReporterMod.Reporter = js.native
    def nullReporter(): gulpDashTypescriptLib.releaseReporterMod.Reporter = js.native
  }
  
  type CompileStream = gulpDashTypescriptLib.releaseProjectMod.ICompileStream
  type Project = gulpDashTypescriptLib.releaseProjectMod.Project
}

