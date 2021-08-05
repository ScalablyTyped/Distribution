package typings.gulpTypescript

import typings.gulpTypescript.anon.Character
import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.typesMod.VinylFile
import typings.std.Error
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reporterMod {
  
  @JSImport("gulp-typescript/release/reporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def countErrors(results: CompilationResult): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countErrors")(results.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def defaultReporter(): Reporter = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultReporter")().asInstanceOf[Reporter]
  
  inline def emptyCompilationResult(noEmit: Boolean): CompilationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyCompilationResult")(noEmit.asInstanceOf[js.Any]).asInstanceOf[CompilationResult]
  
  inline def fullReporter(): Reporter = ^.asInstanceOf[js.Dynamic].applyDynamic("fullReporter")().asInstanceOf[Reporter]
  inline def fullReporter(fullFilename: Boolean): Reporter = ^.asInstanceOf[js.Dynamic].applyDynamic("fullReporter")(fullFilename.asInstanceOf[js.Any]).asInstanceOf[Reporter]
  
  inline def longReporter(): Reporter = ^.asInstanceOf[js.Dynamic].applyDynamic("longReporter")().asInstanceOf[Reporter]
  
  inline def nullReporter(): Reporter = ^.asInstanceOf[js.Dynamic].applyDynamic("nullReporter")().asInstanceOf[Reporter]
  
  trait CompilationResult extends StObject {
    
    var declarationErrors: Double
    
    var emitErrors: Double
    
    var emitSkipped: Boolean
    
    var globalErrors: Double
    
    var noEmit: Boolean
    
    var optionsErrors: Double
    
    var semanticErrors: Double
    
    var syntaxErrors: Double
    
    /**
      * Only used when using isolatedModules.
      */
    var transpileErrors: Double
  }
  object CompilationResult {
    
    inline def apply(
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
    
    extension [Self <: CompilationResult](x: Self) {
      
      inline def setDeclarationErrors(value: Double): Self = StObject.set(x, "declarationErrors", value.asInstanceOf[js.Any])
      
      inline def setEmitErrors(value: Double): Self = StObject.set(x, "emitErrors", value.asInstanceOf[js.Any])
      
      inline def setEmitSkipped(value: Boolean): Self = StObject.set(x, "emitSkipped", value.asInstanceOf[js.Any])
      
      inline def setGlobalErrors(value: Double): Self = StObject.set(x, "globalErrors", value.asInstanceOf[js.Any])
      
      inline def setNoEmit(value: Boolean): Self = StObject.set(x, "noEmit", value.asInstanceOf[js.Any])
      
      inline def setOptionsErrors(value: Double): Self = StObject.set(x, "optionsErrors", value.asInstanceOf[js.Any])
      
      inline def setSemanticErrors(value: Double): Self = StObject.set(x, "semanticErrors", value.asInstanceOf[js.Any])
      
      inline def setSyntaxErrors(value: Double): Self = StObject.set(x, "syntaxErrors", value.asInstanceOf[js.Any])
      
      inline def setTranspileErrors(value: Double): Self = StObject.set(x, "transpileErrors", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reporter extends StObject {
    
    var error: js.UndefOr[js.Function2[/* error */ TypeScriptError, /* typescript */ Typeofts, Unit]] = js.undefined
    
    var finish: js.UndefOr[js.Function1[/* results */ CompilationResult, Unit]] = js.undefined
  }
  object Reporter {
    
    inline def apply(): Reporter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reporter]
    }
    
    extension [Self <: Reporter](x: Self) {
      
      inline def setError(value: (/* error */ TypeScriptError, /* typescript */ Typeofts) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFinish(value: /* results */ CompilationResult => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction1(value))
      
      inline def setFinishUndefined: Self = StObject.set(x, "finish", js.undefined)
    }
  }
  
  trait TypeScriptError
    extends StObject
       with Error {
    
    var diagnostic: Diagnostic
    
    var endPosition: js.UndefOr[Character] = js.undefined
    
    var file: js.UndefOr[VinylFile] = js.undefined
    
    var fullFilename: js.UndefOr[String] = js.undefined
    
    var relativeFilename: js.UndefOr[String] = js.undefined
    
    var startPosition: js.UndefOr[Character] = js.undefined
    
    var tsFile: js.UndefOr[SourceFile] = js.undefined
  }
  object TypeScriptError {
    
    inline def apply(diagnostic: Diagnostic, message: String, name: String): TypeScriptError = {
      val __obj = js.Dynamic.literal(diagnostic = diagnostic.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeScriptError]
    }
    
    extension [Self <: TypeScriptError](x: Self) {
      
      inline def setDiagnostic(value: Diagnostic): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
      
      inline def setEndPosition(value: Character): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
      
      inline def setEndPositionUndefined: Self = StObject.set(x, "endPosition", js.undefined)
      
      inline def setFile(value: VinylFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFullFilename(value: String): Self = StObject.set(x, "fullFilename", value.asInstanceOf[js.Any])
      
      inline def setFullFilenameUndefined: Self = StObject.set(x, "fullFilename", js.undefined)
      
      inline def setRelativeFilename(value: String): Self = StObject.set(x, "relativeFilename", value.asInstanceOf[js.Any])
      
      inline def setRelativeFilenameUndefined: Self = StObject.set(x, "relativeFilename", js.undefined)
      
      inline def setStartPosition(value: Character): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
      
      inline def setStartPositionUndefined: Self = StObject.set(x, "startPosition", js.undefined)
      
      inline def setTsFile(value: SourceFile): Self = StObject.set(x, "tsFile", value.asInstanceOf[js.Any])
      
      inline def setTsFileUndefined: Self = StObject.set(x, "tsFile", js.undefined)
    }
  }
}
