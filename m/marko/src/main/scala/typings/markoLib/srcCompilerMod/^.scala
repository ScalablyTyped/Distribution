package typings
package markoLib.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val builder: js.Any = js.native
  val config: markoLib.srcCompilerConfigMod.Config = js.native
  val defaultOptions: markoLib.srcCompilerConfigMod.Config = js.native
  val isVDOMSupported: markoLib.markoLibNumbers.`true` = js.native
  def buildTaglibLookup(dirname: java.lang.String): markoLib.srcCompilerTaglibDashLookupMod.TaglibLookup = js.native
  def checkUpToDate(templateFile: js.Any, templateJsFile: js.Any): scala.Boolean = js.native
  def clearCaches(): scala.Unit = js.native
  def compile(src: js.Any, filename: java.lang.String, optionsOrCallback: js.Any): js.Any = js.native
  def compile(src: js.Any, filename: java.lang.String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def compileFile(filename: java.lang.String): js.Any = js.native
  def compileFile(filename: java.lang.String, optionsOrCallback: js.Any): js.Any = js.native
  def compileFile(filename: java.lang.String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def compileFileForBrowser(filename: java.lang.String): js.Any = js.native
  def compileFileForBrowser(filename: java.lang.String, optionsOrCallback: js.Any): js.Any = js.native
  def compileFileForBrowser(filename: java.lang.String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def compileForBrowser(src: js.Any, filename: java.lang.String, optionsOrCallback: js.Any): js.Any = js.native
  def compileForBrowser(src: js.Any, filename: java.lang.String, optionsOrCallback: js.Any, callback: js.Any): js.Any = js.native
  def configure(): scala.Unit = js.native
  def configure(newConfig: markoLib.srcCompilerConfigMod.Config): scala.Unit = js.native
  def createBuilder(options: js.Any): js.Any = js.native
  def createInlineCompiler(filename: java.lang.String): js.Any = js.native
  def createInlineCompiler(filename: java.lang.String, userOptions: js.Any): js.Any = js.native
  def createWalker(options: js.Any): js.Any = js.native
  def getLastModified(path: java.lang.String, optionsOrCallback: js.Any, callback: js.Any): scala.Unit = js.native
  def parseRaw(templateSrc: js.Any, filename: java.lang.String): js.Any = js.native
  def registerTaglib(filePath: java.lang.String): scala.Unit = js.native
}

