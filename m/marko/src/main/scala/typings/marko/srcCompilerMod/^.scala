package typings.marko.srcCompilerMod

import typings.marko.markoNumbers.`true`
import typings.marko.srcCompilerConfigMod.Config
import typings.marko.srcCompilerTaglibDashLookupMod.TaglibLookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def compileFile(filename: String, optionsOrCallback: js.Any): js.Any = js.native
  def compileFile(filename: String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def compileFileForBrowser(filename: String): js.Any = js.native
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
}

