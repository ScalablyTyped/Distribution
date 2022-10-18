package typings.marko

import typings.marko.markoBooleans.`true`
import typings.marko.srcCompilerConfigMod.Config
import typings.marko.srcCompilerTaglibLoaderTaglibMod.default
import typings.marko.srcCompilerTaglibLookupMod.TaglibLookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCompilerMod {
  
  @JSImport("marko/src/compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildTaglibLookup(dirname: String): TaglibLookup = ^.asInstanceOf[js.Dynamic].applyDynamic("buildTaglibLookup")(dirname.asInstanceOf[js.Any]).asInstanceOf[TaglibLookup]
  
  @JSImport("marko/src/compiler", "builder")
  @js.native
  val builder: Any = js.native
  
  inline def checkUpToDate(templateFile: Any, templateJsFile: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkUpToDate")(templateFile.asInstanceOf[js.Any], templateJsFile.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def clearCaches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCaches")().asInstanceOf[Unit]
  
  inline def compile(src: Any, filename: String, optionsOrCallback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def compile(src: Any, filename: String, optionsOrCallback: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def compileFile(filename: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def compileFile(filename: String, optionsOrCallback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def compileFile(filename: String, optionsOrCallback: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def compileFile(filename: String, optionsOrCallback: Unit, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFile")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def compileFileForBrowser(filename: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFileForBrowser")(filename.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def compileFileForBrowser(filename: String, optionsOrCallback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFileForBrowser")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def compileFileForBrowser(filename: String, optionsOrCallback: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFileForBrowser")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def compileFileForBrowser(filename: String, optionsOrCallback: Unit, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFileForBrowser")(filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def compileForBrowser(src: Any, filename: String, optionsOrCallback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileForBrowser")(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def compileForBrowser(src: Any, filename: String, optionsOrCallback: Any, callback: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("compileForBrowser")(src.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("marko/src/compiler", "config")
  @js.native
  val config: Config = js.native
  
  inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]
  inline def configure(newConfig: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(newConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createBuilder(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createInlineCompiler(filename: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInlineCompiler")(filename.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def createInlineCompiler(filename: String, userOptions: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createInlineCompiler")(filename.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createWalker(options: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createWalker")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @JSImport("marko/src/compiler", "defaultOptions")
  @js.native
  val defaultOptions: Config = js.native
  
  inline def getLastModified(path: String, optionsOrCallback: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastModified")(path.asInstanceOf[js.Any], optionsOrCallback.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("marko/src/compiler", "isVDOMSupported")
  @js.native
  val isVDOMSupported: `true` = js.native
  
  object modules {
    
    @JSImport("marko/src/compiler", "modules")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deresolve(targetFilename: String, from: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("deresolve")(targetFilename.asInstanceOf[js.Any], from.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def require(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def resolve(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def resolveFrom(from: String, target: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveFrom")(from.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  }
  
  inline def parseRaw(templateSrc: Any, filename: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRaw")(templateSrc.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
    open class Taglib protected ()
      extends typings.marko.srcCompilerTaglibLoaderMod.Taglib {
      def this(filePath: String) = this()
    }
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    inline def createTaglib(filePath: String): typings.marko.srcCompilerTaglibLoaderMod.Taglib = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaglib")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.marko.srcCompilerTaglibLoaderMod.Taglib]
    
    inline def loadTag(tagProps: Any, filePath: String): typings.marko.srcCompilerTaglibLoaderTagMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTag")(tagProps.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[typings.marko.srcCompilerTaglibLoaderTagMod.^]
    
    inline def loadTaglibFromFile(filePath: String): typings.marko.srcCompilerTaglibLoaderMod.Taglib = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTaglibFromFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.marko.srcCompilerTaglibLoaderMod.Taglib]
    
    inline def loadTaglibFromProps(taglib: typings.marko.srcCompilerTaglibLoaderMod.Taglib, taglibProps: Any): typings.marko.srcCompilerTaglibLoaderMod.Taglib = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTaglibFromProps")(taglib.asInstanceOf[js.Any], taglibProps.asInstanceOf[js.Any])).asInstanceOf[typings.marko.srcCompilerTaglibLoaderMod.Taglib]
  }
  
  object taglibLookup {
    
    @JSImport("marko/src/compiler", "taglibLookup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("marko/src/compiler", "taglibLookup.TaglibLookup")
    @js.native
    open class TaglibLookup ()
      extends typings.marko.srcCompilerTaglibLookupMod.TaglibLookup
    
    inline def buildLookup(dirname: String): typings.marko.srcCompilerTaglibLookupMod.TaglibLookup = ^.asInstanceOf[js.Dynamic].applyDynamic("buildLookup")(dirname.asInstanceOf[js.Any]).asInstanceOf[typings.marko.srcCompilerTaglibLookupMod.TaglibLookup]
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    inline def registerTaglib(taglib: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTaglib")(taglib.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("marko/src/compiler", "taglibLookup.registeredTaglibs")
    @js.native
    val registeredTaglibs: js.Array[default] = js.native
  }
}
