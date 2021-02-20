package typings.gulpTypescript

import typings.gulpTypescript.anon.Character
import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.typesMod.VinylFile
import typings.std.Error
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterMod {
  
  @JSImport("gulp-typescript/release/reporter", "countErrors")
  @js.native
  def countErrors(results: CompilationResult): Double = js.native
  
  @JSImport("gulp-typescript/release/reporter", "defaultReporter")
  @js.native
  def defaultReporter(): Reporter = js.native
  
  @JSImport("gulp-typescript/release/reporter", "emptyCompilationResult")
  @js.native
  def emptyCompilationResult(noEmit: Boolean): CompilationResult = js.native
  
  @JSImport("gulp-typescript/release/reporter", "fullReporter")
  @js.native
  def fullReporter(): Reporter = js.native
  @JSImport("gulp-typescript/release/reporter", "fullReporter")
  @js.native
  def fullReporter(fullFilename: Boolean): Reporter = js.native
  
  @JSImport("gulp-typescript/release/reporter", "longReporter")
  @js.native
  def longReporter(): Reporter = js.native
  
  @JSImport("gulp-typescript/release/reporter", "nullReporter")
  @js.native
  def nullReporter(): Reporter = js.native
  
  @js.native
  trait CompilationResult extends StObject {
    
    var declarationErrors: Double = js.native
    
    var emitErrors: Double = js.native
    
    var emitSkipped: Boolean = js.native
    
    var globalErrors: Double = js.native
    
    var noEmit: Boolean = js.native
    
    var optionsErrors: Double = js.native
    
    var semanticErrors: Double = js.native
    
    var syntaxErrors: Double = js.native
    
    /**
      * Only used when using isolatedModules.
      */
    var transpileErrors: Double = js.native
  }
  object CompilationResult {
    
    @scala.inline
    def apply(
      declarationErrors: Double,
      emitErrors: Double,
      emitSkipped: Boolean,
      globalErrors: Double,
      noEmit: Boolean,
      optionsErrors: Double,
      semanticErrors: Double,
      syntaxErrors: Double,
      transpileErrors: Double
    ): CompilationResult = {
      val __obj = js.Dynamic.literal(declarationErrors = declarationErrors.asInstanceOf[js.Any], emitErrors = emitErrors.asInstanceOf[js.Any], emitSkipped = emitSkipped.asInstanceOf[js.Any], globalErrors = globalErrors.asInstanceOf[js.Any], noEmit = noEmit.asInstanceOf[js.Any], optionsErrors = optionsErrors.asInstanceOf[js.Any], semanticErrors = semanticErrors.asInstanceOf[js.Any], syntaxErrors = syntaxErrors.asInstanceOf[js.Any], transpileErrors = transpileErrors.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilationResult]
    }
    
    @scala.inline
    implicit class CompilationResultMutableBuilder[Self <: CompilationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclarationErrors(value: Double): Self = StObject.set(x, "declarationErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitErrors(value: Double): Self = StObject.set(x, "emitErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitSkipped(value: Boolean): Self = StObject.set(x, "emitSkipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalErrors(value: Double): Self = StObject.set(x, "globalErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmit(value: Boolean): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsErrors(value: Double): Self = StObject.set(x, "optionsErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemanticErrors(value: Double): Self = StObject.set(x, "semanticErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyntaxErrors(value: Double): Self = StObject.set(x, "syntaxErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileErrors(value: Double): Self = StObject.set(x, "transpileErrors", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Reporter extends StObject {
    
    var error: js.UndefOr[js.Function2[/* error */ TypeScriptError, /* typescript */ Typeofts, Unit]] = js.native
    
    var finish: js.UndefOr[js.Function1[/* results */ CompilationResult, Unit]] = js.native
  }
  object Reporter {
    
    @scala.inline
    def apply(): Reporter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reporter]
    }
    
    @scala.inline
    implicit class ReporterMutableBuilder[Self <: Reporter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: (/* error */ TypeScriptError, /* typescript */ Typeofts) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFinish(value: /* results */ CompilationResult => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    }
  }
  
  @js.native
  trait TypeScriptError extends Error {
    
    var diagnostic: Diagnostic = js.native
    
    var endPosition: js.UndefOr[Character] = js.native
    
    var file: js.UndefOr[VinylFile] = js.native
    
    var fullFilename: js.UndefOr[String] = js.native
    
    var relativeFilename: js.UndefOr[String] = js.native
    
    var startPosition: js.UndefOr[Character] = js.native
    
    var tsFile: js.UndefOr[SourceFile] = js.native
  }
  object TypeScriptError {
    
    @scala.inline
    def apply(diagnostic: Diagnostic, message: String, name: String): TypeScriptError = {
      val __obj = js.Dynamic.literal(diagnostic = diagnostic.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptError]
    }
    
    @scala.inline
    implicit class TypeScriptErrorMutableBuilder[Self <: TypeScriptError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagnostic(value: Diagnostic): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndPosition(value: Character): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
      
      @scala.inline
      def setFile(value: VinylFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFullFilename(value: String): Self = StObject.set(x, "fullFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullFilenameUndefined: Self = StObject.set(x, "fullFilename", js.undefined)
      
      @scala.inline
      def setRelativeFilename(value: String): Self = StObject.set(x, "relativeFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFilenameUndefined: Self = StObject.set(x, "relativeFilename", js.undefined)
      
      @scala.inline
      def setStartPosition(value: Character): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      @scala.inline
      def setTsFile(value: SourceFile): Self = StObject.set(x, "tsFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsFileUndefined: Self = StObject.set(x, "tsFile", js.undefined)
    }
  }
}
