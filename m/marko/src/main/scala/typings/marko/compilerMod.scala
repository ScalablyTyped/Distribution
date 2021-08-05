package typings.marko

import typings.marko.configMod.Config
import typings.marko.markoBooleans.`true`
import typings.marko.taglibLookupMod.TaglibLookup
import typings.marko.taglibMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerMod {
  
  @JSImport("marko/src/compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildTaglibLookup(dirname: String): TaglibLookup = ^.asInstanceOf[js.Dynamic].applyDynamic("buildTaglibLookup")(dirname.asInstanceOf[js.Any]).asInstanceOf[TaglibLookup]
  
  @JSImport("marko/src/compiler", "builder")
  @js.native
  val builder: js.Any = js.native
  
  inline def checkUpToDate(templateFile: js.Any, templateJsFile: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUpToDate")(templateFile.asInstanceOf[js.Any], templateJsFile.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clearCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCaches")().asInstanceOf[Unit]
  
  inline def compile(src: js.Any, filename: String, optionsOrCallback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def compile(src: js.Any, filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def compileFile(filename: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def compileFile(filename: String, optionsOrCallback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def compileFile(filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def compileFile(filename: String, optionsOrCallback: Unit, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def compileFileForBrowser(filename: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFileForBrowser")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def compileFileForBrowser(filename: String, optionsOrCallback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFileForBrowser")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def compileFileForBrowser(filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFileForBrowser")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def compileFileForBrowser(filename: String, optionsOrCallback: Unit, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFileForBrowser")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def compileForBrowser(src: js.Any, filename: String, optionsOrCallback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileForBrowser")(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def compileForBrowser(src: js.Any, filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileForBrowser")(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("marko/src/compiler", "config")
  @js.native
  val config: Config = js.native
  
  inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]
  inline def configure(newConfig: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createBuilder(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def createInlineCompiler(filename: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInlineCompiler")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def createInlineCompiler(filename: String, userOptions: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInlineCompiler")(filename.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def createWalker(options: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createWalker")(options.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("marko/src/compiler", "defaultOptions")
  @js.native
  val defaultOptions: Config = js.native
  
  inline def getLastModified(path: String, optionsOrCallback: js.Any, callback: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastModified")(path.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("marko/src/compiler", "isVDOMSupported")
  @js.native
  val isVDOMSupported: `true` = js.native
  
  object modules {
    
    @JSImport("marko/src/compiler", "modules")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deresolve(targetFilename: String, from: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("deresolve")(targetFilename.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def require(path: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def resolve(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def resolveFrom(from: String, target: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFrom")(from.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  }
  
  inline def parseRaw(templateSrc: js.Any, filename: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRaw")(templateSrc.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def registerTaglib(filePath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTaglib")(filePath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object taglibFinder {
    
    @JSImport("marko/src/compiler", "taglibFinder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    inline def excludeDir(dir: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("excludeDir")(dir.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def excludePackage(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("excludePackage")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def find(dirname: String, registeredTaglibs: js.Array[default]): js.Array[default] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(dirname.asInstanceOf[js.Any], registeredTaglibs.asInstanceOf[js.Any])).asInstanceOf[js.Array[default]]
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  }
  
  object taglibLoader {
    
    @JSImport("marko/src/compiler", "taglibLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("marko/src/compiler", "taglibLoader.Taglib")
    @js.native
    class Taglib protected ()
      extends typings.marko.taglibLoaderMod.Taglib {
      def this(filePath: String) = this()
    }
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    inline def createTaglib(filePath: String): typings.marko.taglibLoaderMod.Taglib = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaglib")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.marko.taglibLoaderMod.Taglib]
    
    inline def loadTag(tagProps: js.Any, filePath: String): typings.marko.tagMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTag")(tagProps.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[typings.marko.tagMod.^]
    
    inline def loadTaglibFromFile(filePath: String): typings.marko.taglibLoaderMod.Taglib = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTaglibFromFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.marko.taglibLoaderMod.Taglib]
    
    inline def loadTaglibFromProps(taglib: typings.marko.taglibLoaderMod.Taglib, taglibProps: js.Any): typings.marko.taglibLoaderMod.Taglib = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTaglibFromProps")(taglib.asInstanceOf[js.Any], taglibProps.asInstanceOf[js.Any])).asInstanceOf[typings.marko.taglibLoaderMod.Taglib]
  }
  
  object taglibLookup {
    
    @JSImport("marko/src/compiler", "taglibLookup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("marko/src/compiler", "taglibLookup.TaglibLookup")
    @js.native
    class TaglibLookup ()
      extends typings.marko.taglibLookupMod.TaglibLookup
    
    inline def buildLookup(dirname: String): typings.marko.taglibLookupMod.TaglibLookup = ^.asInstanceOf[js.Dynamic].applyDynamic("buildLookup")(dirname.asInstanceOf[js.Any]).asInstanceOf[typings.marko.taglibLookupMod.TaglibLookup]
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    inline def registerTaglib(taglib: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTaglib")(taglib.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("marko/src/compiler", "taglibLookup.registeredTaglibs")
    @js.native
    val registeredTaglibs: js.Array[default] = js.native
  }
}
