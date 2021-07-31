package typings.ionic

import typings.ionic.anon.PartialPkgManagerOptions
import typings.ionic.definitionsMod.NpmClient
import typings.ionicCliFramework.definitionsMod.PackageJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object npmMod {
  
  @JSImport("ionic/lib/utils/npm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def pkgFromRegistry(npmClient: NpmClient, options: PartialPkgManagerOptions): js.Promise[js.UndefOr[PackageJson]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pkgFromRegistry")(npmClient.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[PackageJson]]]
  
  @scala.inline
  def pkgManagerArgs(npmClient: NpmClient, options: PkgManagerOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pkgManagerArgs")(npmClient.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionic.ionicStrings.dedupe
    - typings.ionic.ionicStrings.rebuild
    - typings.ionic.ionicStrings.install
    - typings.ionic.ionicStrings.uninstall
    - typings.ionic.ionicStrings.run
    - typings.ionic.ionicStrings.info
  */
  trait PkgManagerCommand extends StObject
  object PkgManagerCommand {
    
    @scala.inline
    def dedupe: typings.ionic.ionicStrings.dedupe = "dedupe".asInstanceOf[typings.ionic.ionicStrings.dedupe]
    
    @scala.inline
    def info: typings.ionic.ionicStrings.info = "info".asInstanceOf[typings.ionic.ionicStrings.info]
    
    @scala.inline
    def install: typings.ionic.ionicStrings.install = "install".asInstanceOf[typings.ionic.ionicStrings.install]
    
    @scala.inline
    def rebuild: typings.ionic.ionicStrings.rebuild = "rebuild".asInstanceOf[typings.ionic.ionicStrings.rebuild]
    
    @scala.inline
    def run: typings.ionic.ionicStrings.run = "run".asInstanceOf[typings.ionic.ionicStrings.run]
    
    @scala.inline
    def uninstall: typings.ionic.ionicStrings.uninstall = "uninstall".asInstanceOf[typings.ionic.ionicStrings.uninstall]
  }
  
  trait PkgManagerOptions extends StObject {
    
    var command: PkgManagerCommand
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var pkg: js.UndefOr[String] = js.undefined
    
    var save: js.UndefOr[Boolean] = js.undefined
    
    var saveDev: js.UndefOr[Boolean] = js.undefined
    
    var saveExact: js.UndefOr[Boolean] = js.undefined
    
    var script: js.UndefOr[String] = js.undefined
    
    var scriptArgs: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PkgManagerOptions {
    
    @scala.inline
    def apply(command: PkgManagerCommand): PkgManagerOptions = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[PkgManagerOptions]
    }
    
    @scala.inline
    implicit class PkgManagerOptionsMutableBuilder[Self <: PkgManagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: PkgManagerCommand): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
      
      @scala.inline
      def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveDev(value: Boolean): Self = StObject.set(x, "saveDev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveDevUndefined: Self = StObject.set(x, "saveDev", js.undefined)
      
      @scala.inline
      def setSaveExact(value: Boolean): Self = StObject.set(x, "saveExact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveExactUndefined: Self = StObject.set(x, "saveExact", js.undefined)
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptArgs(value: js.Array[String]): Self = StObject.set(x, "scriptArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptArgsUndefined: Self = StObject.set(x, "scriptArgs", js.undefined)
      
      @scala.inline
      def setScriptArgsVarargs(value: String*): Self = StObject.set(x, "scriptArgs", js.Array(value :_*))
      
      @scala.inline
      def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    }
  }
}
