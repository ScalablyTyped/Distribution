package typings.highlightJs

import typings.highlightJs.anon.LanguageName
import typings.highlightJs.anon.PartialHLJSOptions
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicApi extends js.Object {
  
  def addPlugin(plugin: HLJSPlugin): Unit = js.native
  
  def autoDetection(languageName: String): Boolean = js.native
  
  def configure(options: PartialHLJSOptions): Unit = js.native
  
  def debugMode(): Unit = js.native
  
  def fixMarkup(html: String): String = js.native
  
  def getLanguage(languageName: String): js.UndefOr[Language] = js.native
  
  def highlight(languageName: String, code: String): HighlightResult = js.native
  def highlight(languageName: String, code: String, ignoreIllegals: js.UndefOr[scala.Nothing], continuation: Mode): HighlightResult = js.native
  def highlight(languageName: String, code: String, ignoreIllegals: Boolean): HighlightResult = js.native
  def highlight(languageName: String, code: String, ignoreIllegals: Boolean, continuation: Mode): HighlightResult = js.native
  
  def highlightAuto(code: String): AutoHighlightResult = js.native
  def highlightAuto(code: String, languageSubset: js.Array[String]): AutoHighlightResult = js.native
  
  def highlightBlock(element: HTMLElement): Unit = js.native
  
  def inherit[T](original: T, args: (Record[String, _])*): T = js.native
  
  def initHighlighting(): Unit = js.native
  
  def initHighlightingOnLoad(): Unit = js.native
  
  def listLanguages(): js.Array[String] = js.native
  
  def registerAliases(aliasList: String, hasLanguageName: LanguageName): Unit = js.native
  def registerAliases(aliasList: js.Array[String], hasLanguageName: LanguageName): Unit = js.native
  
  def registerLanguage(languageName: String, language: LanguageFn): Unit = js.native
  
  def requireLanguage(languageName: String): Language | scala.Nothing = js.native
  
  def safeMode(): Unit = js.native
  
  var versionString: String = js.native
  
  def vuePlugin(): VuePlugin = js.native
}
