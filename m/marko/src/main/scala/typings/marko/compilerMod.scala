package typings.marko

import typings.marko.configMod.Config
import typings.marko.markoBooleans.`true`
import typings.marko.tagMod.^
import typings.marko.taglibLookupMod.TaglibLookup
import typings.marko.taglibMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler", JSImport.Namespace)
@js.native
object compilerMod extends js.Object {
  val builder: js.Any = js.native
  val config: Config = js.native
  val defaultOptions: Config = js.native
  val isVDOMSupported: `true` = js.native
  def buildTaglibLookup(dirname: String): TaglibLookup = js.native
  def checkUpToDate(templateFile: js.Any, templateJsFile: js.Any): Boolean = js.native
  def clearCaches(): Unit = js.native
  def compile(src: js.Any, filename: String, optionsOrCallback: js.Any): js.Any = js.native
  def compile(src: js.Any, filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def compileFile(filename: String): js.Any = js.native
  def compileFile(filename: String, optionsOrCallback: js.UndefOr[scala.Nothing], callback: js.Any): js.Any = js.native
  def compileFile(filename: String, optionsOrCallback: js.Any): js.Any = js.native
  def compileFile(filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def compileFileForBrowser(filename: String): js.Any = js.native
  def compileFileForBrowser(filename: String, optionsOrCallback: js.UndefOr[scala.Nothing], callback: js.Any): js.Any = js.native
  def compileFileForBrowser(filename: String, optionsOrCallback: js.Any): js.Any = js.native
  def compileFileForBrowser(filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def compileForBrowser(src: js.Any, filename: String, optionsOrCallback: js.Any): js.Any = js.native
  def compileForBrowser(src: js.Any, filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def configure(): Unit = js.native
  def configure(newConfig: Config): Unit = js.native
  def createBuilder(options: js.Any): js.Any = js.native
  def createInlineCompiler(filename: String): js.Any = js.native
  def createInlineCompiler(filename: String, userOptions: js.Any): js.Any = js.native
  def createWalker(options: js.Any): js.Any = js.native
  def getLastModified(path: String, optionsOrCallback: js.Any, callback: js.Any): Unit = js.native
  def parseRaw(templateSrc: js.Any, filename: String): js.Any = js.native
  def registerTaglib(filePath: String): Unit = js.native
  @js.native
  object modules extends js.Object {
    def deresolve(targetFilename: String, from: String): String = js.native
    def require(path: String): js.Any = js.native
    def resolve(path: String): String = js.native
    def resolveFrom(from: String, target: String): String | Null = js.native
  }
  
  @js.native
  object taglibFinder extends js.Object {
    def clearCache(): Unit = js.native
    def excludeDir(dir: String): Unit = js.native
    def excludePackage(name: String): Unit = js.native
    def find(dirname: String, registeredTaglibs: js.Array[default]): js.Array[default] = js.native
    def reset(): Unit = js.native
  }
  
  @js.native
  object taglibLoader extends js.Object {
    @js.native
    class Taglib () extends default
    
    def clearCache(): Unit = js.native
    def createTaglib(filePath: String): typings.marko.taglibLoaderMod.Taglib = js.native
    def loadTag(tagProps: js.Any, filePath: String): ^ = js.native
    def loadTaglibFromFile(filePath: String): typings.marko.taglibLoaderMod.Taglib = js.native
    def loadTaglibFromProps(taglib: typings.marko.taglibLoaderMod.Taglib, taglibProps: js.Any): typings.marko.taglibLoaderMod.Taglib = js.native
  }
  
  @js.native
  object taglibLookup extends js.Object {
    @js.native
    class TaglibLookup ()
      extends typings.marko.taglibLookupTaglibLookupMod.default
    
    val registeredTaglibs: js.Array[default] = js.native
    def buildLookup(dirname: String): typings.marko.taglibLookupMod.TaglibLookup = js.native
    def clearCache(): Unit = js.native
    def registerTaglib(taglib: default): Unit = js.native
  }
  
}

