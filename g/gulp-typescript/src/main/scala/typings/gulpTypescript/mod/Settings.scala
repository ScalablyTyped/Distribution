package typings.gulpTypescript.mod

import org.scalablytyped.runtime.StringDictionary
import typings.gulpTypescript.anon.Typeofts
import typings.gulpTypescript.typesMod.GetCustomTransformers
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.ModuleKind
import typings.typescript.mod.Program
import typings.typescript.mod.ScriptTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowNonTsExtensions(value: Boolean): Self = this.set("allowNonTsExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNonTsExtensions: Self = this.set("allowNonTsExtensions", js.undefined)
    
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setCodepage(value: Double): Self = this.set("codepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodepage: Self = this.set("codepage", js.undefined)
    
    @scala.inline
    def setDeclaration(value: Boolean): Self = this.set("declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclaration: Self = this.set("declaration", js.undefined)
    
    @scala.inline
    def setDeclarationFiles(value: Boolean): Self = this.set("declarationFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclarationFiles: Self = this.set("declarationFiles", js.undefined)
    
    @scala.inline
    def setExperimentalDecorators(value: Boolean): Self = this.set("experimentalDecorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentalDecorators: Self = this.set("experimentalDecorators", js.undefined)
    
    @scala.inline
    def setGetCustomTransformersFunction1(value: /* program */ js.UndefOr[Program] => js.UndefOr[CustomTransformers]): Self = this.set("getCustomTransformers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCustomTransformers(value: GetCustomTransformers): Self = this.set("getCustomTransformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetCustomTransformers: Self = this.set("getCustomTransformers", js.undefined)
    
    @scala.inline
    def setIsolatedModules(value: Boolean): Self = this.set("isolatedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolatedModules: Self = this.set("isolatedModules", js.undefined)
    
    @scala.inline
    def setJsx(value: String | Double): Self = this.set("jsx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsx: Self = this.set("jsx", js.undefined)
    
    @scala.inline
    def setLibVarargs(value: String*): Self = this.set("lib", js.Array(value :_*))
    
    @scala.inline
    def setLib(value: js.Array[String]): Self = this.set("lib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLib: Self = this.set("lib", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMapRoot(value: String): Self = this.set("mapRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapRoot: Self = this.set("mapRoot", js.undefined)
    
    @scala.inline
    def setModule(value: String | ModuleKind): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setModuleResolution(value: String | Double): Self = this.set("moduleResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleResolution: Self = this.set("moduleResolution", js.undefined)
    
    @scala.inline
    def setNoEmitOnError(value: Boolean): Self = this.set("noEmitOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEmitOnError: Self = this.set("noEmitOnError", js.undefined)
    
    @scala.inline
    def setNoExternalResolve(value: Boolean): Self = this.set("noExternalResolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoExternalResolve: Self = this.set("noExternalResolve", js.undefined)
    
    @scala.inline
    def setNoImplicitAny(value: Boolean): Self = this.set("noImplicitAny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoImplicitAny: Self = this.set("noImplicitAny", js.undefined)
    
    @scala.inline
    def setNoLib(value: Boolean): Self = this.set("noLib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoLib: Self = this.set("noLib", js.undefined)
    
    @scala.inline
    def setNoLibCheck(value: Boolean): Self = this.set("noLibCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoLibCheck: Self = this.set("noLibCheck", js.undefined)
    
    @scala.inline
    def setNoResolve(value: Boolean): Self = this.set("noResolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoResolve: Self = this.set("noResolve", js.undefined)
    
    @scala.inline
    def setOut(value: String): Self = this.set("out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOut: Self = this.set("out", js.undefined)
    
    @scala.inline
    def setOutDir(value: String): Self = this.set("outDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutDir: Self = this.set("outDir", js.undefined)
    
    @scala.inline
    def setOutFile(value: String): Self = this.set("outFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutFile: Self = this.set("outFile", js.undefined)
    
    @scala.inline
    def setPreserveConstEnums(value: Boolean): Self = this.set("preserveConstEnums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveConstEnums: Self = this.set("preserveConstEnums", js.undefined)
    
    @scala.inline
    def setRemoveComments(value: Boolean): Self = this.set("removeComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveComments: Self = this.set("removeComments", js.undefined)
    
    @scala.inline
    def setRootDir(value: String): Self = this.set("rootDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDir: Self = this.set("rootDir", js.undefined)
    
    @scala.inline
    def setRootDirs(value: js.Any): Self = this.set("rootDirs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDirs: Self = this.set("rootDirs", js.undefined)
    
    @scala.inline
    def setSortOutput(value: Boolean): Self = this.set("sortOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOutput: Self = this.set("sortOutput", js.undefined)
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    
    @scala.inline
    def setSuppressImplicitAnyIndexErrors(value: Boolean): Self = this.set("suppressImplicitAnyIndexErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressImplicitAnyIndexErrors: Self = this.set("suppressImplicitAnyIndexErrors", js.undefined)
    
    @scala.inline
    def setTarget(value: String | ScriptTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTypescript(value: Typeofts): Self = this.set("typescript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypescript: Self = this.set("typescript", js.undefined)
  }
}
