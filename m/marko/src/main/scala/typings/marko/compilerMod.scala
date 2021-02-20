package typings.marko

import typings.marko.configMod.Config
import typings.marko.markoBooleans.`true`
import typings.marko.tagMod.^
import typings.marko.taglibLookupMod.TaglibLookup
import typings.marko.taglibMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compilerMod {
  
  @JSImport("marko/src/compiler", "buildTaglibLookup")
  @js.native
  def buildTaglibLookup(dirname: String): TaglibLookup = js.native
  
  @JSImport("marko/src/compiler", "builder")
  @js.native
  val builder: js.Any = js.native
  
  @JSImport("marko/src/compiler", "checkUpToDate")
  @js.native
  def checkUpToDate(templateFile: js.Any, templateJsFile: js.Any): Boolean = js.native
  
  @JSImport("marko/src/compiler", "clearCaches")
  @js.native
  def clearCaches(): Unit = js.native
  
  @JSImport("marko/src/compiler", "compile")
  @js.native
  def compile(src: js.Any, filename: String, optionsOrCallback: js.Any): js.Any = js.native
  @JSImport("marko/src/compiler", "compile")
  @js.native
  def compile(src: js.Any, filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  
  @JSImport("marko/src/compiler", "compileFile")
  @js.native
  def compileFile(filename: String): js.Any = js.native
  @JSImport("marko/src/compiler", "compileFile")
  @js.native
  def compileFile(filename: String, optionsOrCallback: js.UndefOr[scala.Nothing], callback: js.Any): js.Any = js.native
  @JSImport("marko/src/compiler", "compileFile")
  @js.native
  def compileFile(filename: String, optionsOrCallback: js.Any): js.Any = js.native
  @JSImport("marko/src/compiler", "compileFile")
  @js.native
  def compileFile(filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  
  @JSImport("marko/src/compiler", "compileFileForBrowser")
  @js.native
  def compileFileForBrowser(filename: String): js.Any = js.native
  @JSImport("marko/src/compiler", "compileFileForBrowser")
  @js.native
  def compileFileForBrowser(filename: String, optionsOrCallback: js.UndefOr[scala.Nothing], callback: js.Any): js.Any = js.native
  @JSImport("marko/src/compiler", "compileFileForBrowser")
  @js.native
  def compileFileForBrowser(filename: String, optionsOrCallback: js.Any): js.Any = js.native
  @JSImport("marko/src/compiler", "compileFileForBrowser")
  @js.native
  def compileFileForBrowser(filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  
  @JSImport("marko/src/compiler", "compileForBrowser")
  @js.native
  def compileForBrowser(src: js.Any, filename: String, optionsOrCallback: js.Any): js.Any = js.native
  @JSImport("marko/src/compiler", "compileForBrowser")
  @js.native
  def compileForBrowser(src: js.Any, filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  
  @JSImport("marko/src/compiler", "config")
  @js.native
  val config: Config = js.native
  
  @JSImport("marko/src/compiler", "configure")
  @js.native
  def configure(): Unit = js.native
  @JSImport("marko/src/compiler", "configure")
  @js.native
  def configure(newConfig: Config): Unit = js.native
  
  @JSImport("marko/src/compiler", "createBuilder")
  @js.native
  def createBuilder(options: js.Any): js.Any = js.native
  
  @JSImport("marko/src/compiler", "createInlineCompiler")
  @js.native
  def createInlineCompiler(filename: String): js.Any = js.native
  @JSImport("marko/src/compiler", "createInlineCompiler")
  @js.native
  def createInlineCompiler(filename: String, userOptions: js.Any): js.Any = js.native
  
  @JSImport("marko/src/compiler", "createWalker")
  @js.native
  def createWalker(options: js.Any): js.Any = js.native
  
  @JSImport("marko/src/compiler", "defaultOptions")
  @js.native
  val defaultOptions: Config = js.native
  
  @JSImport("marko/src/compiler", "getLastModified")
  @js.native
  def getLastModified(path: String, optionsOrCallback: js.Any, callback: js.Any): Unit = js.native
  
  @JSImport("marko/src/compiler", "isVDOMSupported")
  @js.native
  val isVDOMSupported: `true` = js.native
  
  object modules {
    
    @JSImport("marko/src/compiler", "modules.deresolve")
    @js.native
    def deresolve(targetFilename: String, from: String): String = js.native
    
    @JSImport("marko/src/compiler", "modules.require")
    @js.native
    def require(path: String): js.Any = js.native
    
    @JSImport("marko/src/compiler", "modules.resolve")
    @js.native
    def resolve(path: String): String = js.native
    
    @JSImport("marko/src/compiler", "modules.resolveFrom")
    @js.native
    def resolveFrom(from: String, target: String): String | Null = js.native
  }
  
  @JSImport("marko/src/compiler", "parseRaw")
  @js.native
  def parseRaw(templateSrc: js.Any, filename: String): js.Any = js.native
  
  @JSImport("marko/src/compiler", "registerTaglib")
  @js.native
  def registerTaglib(filePath: String): Unit = js.native
  
  object taglibFinder {
    
    @JSImport("marko/src/compiler", "taglibFinder.clearCache")
    @js.native
    def clearCache(): Unit = js.native
    
    @JSImport("marko/src/compiler", "taglibFinder.excludeDir")
    @js.native
    def excludeDir(dir: String): Unit = js.native
    
    @JSImport("marko/src/compiler", "taglibFinder.excludePackage")
    @js.native
    def excludePackage(name: String): Unit = js.native
    
    @JSImport("marko/src/compiler", "taglibFinder.find")
    @js.native
    def find(dirname: String, registeredTaglibs: js.Array[default]): js.Array[default] = js.native
    
    @JSImport("marko/src/compiler", "taglibFinder.reset")
    @js.native
    def reset(): Unit = js.native
  }
  
  object taglibLoader {
    
    @JSImport("marko/src/compiler", "taglibLoader.Taglib")
    @js.native
    class Taglib protected ()
      extends typings.marko.taglibLoaderMod.Taglib {
      def this(filePath: String) = this()
    }
    
    @JSImport("marko/src/compiler", "taglibLoader.clearCache")
    @js.native
    def clearCache(): Unit = js.native
    
    @JSImport("marko/src/compiler", "taglibLoader.createTaglib")
    @js.native
    def createTaglib(filePath: String): typings.marko.taglibLoaderMod.Taglib = js.native
    
    @JSImport("marko/src/compiler", "taglibLoader.loadTag")
    @js.native
    def loadTag(tagProps: js.Any, filePath: String): ^ = js.native
    
    @JSImport("marko/src/compiler", "taglibLoader.loadTaglibFromFile")
    @js.native
    def loadTaglibFromFile(filePath: String): typings.marko.taglibLoaderMod.Taglib = js.native
    
    @JSImport("marko/src/compiler", "taglibLoader.loadTaglibFromProps")
    @js.native
    def loadTaglibFromProps(taglib: typings.marko.taglibLoaderMod.Taglib, taglibProps: js.Any): typings.marko.taglibLoaderMod.Taglib = js.native
  }
  
  object taglibLookup {
    
    @JSImport("marko/src/compiler", "taglibLookup.TaglibLookup")
    @js.native
    class TaglibLookup ()
      extends typings.marko.taglibLookupMod.TaglibLookup
    
    @JSImport("marko/src/compiler", "taglibLookup.buildLookup")
    @js.native
    def buildLookup(dirname: String): typings.marko.taglibLookupMod.TaglibLookup = js.native
    
    @JSImport("marko/src/compiler", "taglibLookup.clearCache")
    @js.native
    def clearCache(): Unit = js.native
    
    @JSImport("marko/src/compiler", "taglibLookup.registerTaglib")
    @js.native
    def registerTaglib(taglib: default): Unit = js.native
    
    @JSImport("marko/src/compiler", "taglibLookup.registeredTaglibs")
    @js.native
    val registeredTaglibs: js.Array[default] = js.native
  }
}
