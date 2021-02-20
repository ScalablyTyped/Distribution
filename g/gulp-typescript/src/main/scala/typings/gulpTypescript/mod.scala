package typings.gulpTypescript

import org.scalablytyped.runtime.StringDictionary
import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.projectMod.ICompileStream
import typings.gulpTypescript.reporterMod.CompilationResult
import typings.gulpTypescript.reporterMod.Reporter
import typings.gulpTypescript.typesMod.GetCustomTransformers
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.ModuleKind
import typings.typescript.mod.Program
import typings.typescript.mod.ScriptTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-typescript", JSImport.Namespace)
  @js.native
  def apply(): CompileStream = js.native
  @JSImport("gulp-typescript", JSImport.Namespace)
  @js.native
  def apply(proj: typings.gulpTypescript.projectMod.Project): CompileStream = js.native
  @JSImport("gulp-typescript", JSImport.Namespace)
  @js.native
  def apply(proj: typings.gulpTypescript.projectMod.Project, theReporter: Reporter): CompileStream = js.native
  @JSImport("gulp-typescript", JSImport.Namespace)
  @js.native
  def apply(settings: Settings): CompileStream = js.native
  @JSImport("gulp-typescript", JSImport.Namespace)
  @js.native
  def apply(settings: Settings, theReporter: Reporter): CompileStream = js.native
  
  @JSImport("gulp-typescript", "createProject")
  @js.native
  def createProject(): Project = js.native
  @JSImport("gulp-typescript", "createProject")
  @js.native
  def createProject(settings: Settings): Project = js.native
  @JSImport("gulp-typescript", "createProject")
  @js.native
  def createProject(tsConfigFileName: String): Project = js.native
  @JSImport("gulp-typescript", "createProject")
  @js.native
  def createProject(tsConfigFileName: String, settings: Settings): Project = js.native
  
  @JSImport("gulp-typescript", "filter")
  @js.native
  def filter(args: js.Any*): Unit = js.native
  
  object reporter {
    
    @JSImport("gulp-typescript", "reporter.countErrors")
    @js.native
    def countErrors(results: CompilationResult): Double = js.native
    
    @JSImport("gulp-typescript", "reporter.defaultReporter")
    @js.native
    def defaultReporter(): Reporter = js.native
    
    @JSImport("gulp-typescript", "reporter.emptyCompilationResult")
    @js.native
    def emptyCompilationResult(noEmit: Boolean): CompilationResult = js.native
    
    @JSImport("gulp-typescript", "reporter.fullReporter")
    @js.native
    def fullReporter(): Reporter = js.native
    @JSImport("gulp-typescript", "reporter.fullReporter")
    @js.native
    def fullReporter(fullFilename: Boolean): Reporter = js.native
    
    @JSImport("gulp-typescript", "reporter.longReporter")
    @js.native
    def longReporter(): Reporter = js.native
    
    @JSImport("gulp-typescript", "reporter.nullReporter")
    @js.native
    def nullReporter(): Reporter = js.native
  }
  
  type CompileStream = ICompileStream
  
  type Project = typings.gulpTypescript.projectMod.Project
  
  @js.native
  trait Settings
    extends /* name */ StringDictionary[js.Any] {
    
    var allowNonTsExtensions: js.UndefOr[Boolean] = js.native
    
    var charset: js.UndefOr[String] = js.native
    
    var codepage: js.UndefOr[Double] = js.native
    
    var declaration: js.UndefOr[Boolean] = js.native
    
    var declarationFiles: js.UndefOr[Boolean] = js.native
    
    var experimentalDecorators: js.UndefOr[Boolean] = js.native
    
    var getCustomTransformers: js.UndefOr[GetCustomTransformers] = js.native
    
    var isolatedModules: js.UndefOr[Boolean] = js.native
    
    var jsx: js.UndefOr[String | Double] = js.native
    
    var lib: js.UndefOr[js.Array[String]] = js.native
    
    var locale: js.UndefOr[String] = js.native
    
    var mapRoot: js.UndefOr[String] = js.native
    
    var module: js.UndefOr[String | ModuleKind] = js.native
    
    var moduleResolution: js.UndefOr[String | Double] = js.native
    
    var noEmitOnError: js.UndefOr[Boolean] = js.native
    
    var noExternalResolve: js.UndefOr[Boolean] = js.native
    
    var noImplicitAny: js.UndefOr[Boolean] = js.native
    
    var noLib: js.UndefOr[Boolean] = js.native
    
    var noLibCheck: js.UndefOr[Boolean] = js.native
    
    var noResolve: js.UndefOr[Boolean] = js.native
    
    var out: js.UndefOr[String] = js.native
    
    var outDir: js.UndefOr[String] = js.native
    
    var outFile: js.UndefOr[String] = js.native
    
    var preserveConstEnums: js.UndefOr[Boolean] = js.native
    
    var removeComments: js.UndefOr[Boolean] = js.native
    
    var rootDir: js.UndefOr[String] = js.native
    
    var rootDirs: js.UndefOr[js.Any] = js.native
    
    var sortOutput: js.UndefOr[Boolean] = js.native
    
    var sourceRoot: js.UndefOr[String] = js.native
    
    var suppressImplicitAnyIndexErrors: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[String | ScriptTarget] = js.native
    
    var typescript: js.UndefOr[Typeofts] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNonTsExtensions(value: Boolean): Self = StObject.set(x, "allowNonTsExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNonTsExtensionsUndefined: Self = StObject.set(x, "allowNonTsExtensions", js.undefined)
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCodepage(value: Double): Self = StObject.set(x, "codepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodepageUndefined: Self = StObject.set(x, "codepage", js.undefined)
      
      @scala.inline
      def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationFiles(value: Boolean): Self = StObject.set(x, "declarationFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationFilesUndefined: Self = StObject.set(x, "declarationFiles", js.undefined)
      
      @scala.inline
      def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
      
      @scala.inline
      def setExperimentalDecorators(value: Boolean): Self = StObject.set(x, "experimentalDecorators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalDecoratorsUndefined: Self = StObject.set(x, "experimentalDecorators", js.undefined)
      
      @scala.inline
      def setGetCustomTransformers(value: GetCustomTransformers): Self = StObject.set(x, "getCustomTransformers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetCustomTransformersFunction1(value: /* program */ js.UndefOr[Program] => js.UndefOr[CustomTransformers]): Self = StObject.set(x, "getCustomTransformers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCustomTransformersUndefined: Self = StObject.set(x, "getCustomTransformers", js.undefined)
      
      @scala.inline
      def setIsolatedModules(value: Boolean): Self = StObject.set(x, "isolatedModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsolatedModulesUndefined: Self = StObject.set(x, "isolatedModules", js.undefined)
      
      @scala.inline
      def setJsx(value: String | Double): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      @scala.inline
      def setLib(value: js.Array[String]): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
      
      @scala.inline
      def setLibVarargs(value: String*): Self = StObject.set(x, "lib", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMapRoot(value: String): Self = StObject.set(x, "mapRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapRootUndefined: Self = StObject.set(x, "mapRoot", js.undefined)
      
      @scala.inline
      def setModule(value: String | ModuleKind): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleResolution(value: String | Double): Self = StObject.set(x, "moduleResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleResolutionUndefined: Self = StObject.set(x, "moduleResolution", js.undefined)
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setNoEmitOnError(value: Boolean): Self = StObject.set(x, "noEmitOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEmitOnErrorUndefined: Self = StObject.set(x, "noEmitOnError", js.undefined)
      
      @scala.inline
      def setNoExternalResolve(value: Boolean): Self = StObject.set(x, "noExternalResolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoExternalResolveUndefined: Self = StObject.set(x, "noExternalResolve", js.undefined)
      
      @scala.inline
      def setNoImplicitAny(value: Boolean): Self = StObject.set(x, "noImplicitAny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoImplicitAnyUndefined: Self = StObject.set(x, "noImplicitAny", js.undefined)
      
      @scala.inline
      def setNoLib(value: Boolean): Self = StObject.set(x, "noLib", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoLibCheck(value: Boolean): Self = StObject.set(x, "noLibCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoLibCheckUndefined: Self = StObject.set(x, "noLibCheck", js.undefined)
      
      @scala.inline
      def setNoLibUndefined: Self = StObject.set(x, "noLib", js.undefined)
      
      @scala.inline
      def setNoResolve(value: Boolean): Self = StObject.set(x, "noResolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResolveUndefined: Self = StObject.set(x, "noResolve", js.undefined)
      
      @scala.inline
      def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutDirUndefined: Self = StObject.set(x, "outDir", js.undefined)
      
      @scala.inline
      def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      @scala.inline
      def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      @scala.inline
      def setPreserveConstEnums(value: Boolean): Self = StObject.set(x, "preserveConstEnums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveConstEnumsUndefined: Self = StObject.set(x, "preserveConstEnums", js.undefined)
      
      @scala.inline
      def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
      
      @scala.inline
      def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      @scala.inline
      def setRootDirs(value: js.Any): Self = StObject.set(x, "rootDirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirsUndefined: Self = StObject.set(x, "rootDirs", js.undefined)
      
      @scala.inline
      def setSortOutput(value: Boolean): Self = StObject.set(x, "sortOutput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOutputUndefined: Self = StObject.set(x, "sortOutput", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      @scala.inline
      def setSuppressImplicitAnyIndexErrors(value: Boolean): Self = StObject.set(x, "suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressImplicitAnyIndexErrorsUndefined: Self = StObject.set(x, "suppressImplicitAnyIndexErrors", js.undefined)
      
      @scala.inline
      def setTarget(value: String | ScriptTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTypescript(value: Typeofts): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypescriptUndefined: Self = StObject.set(x, "typescript", js.undefined)
    }
  }
}
