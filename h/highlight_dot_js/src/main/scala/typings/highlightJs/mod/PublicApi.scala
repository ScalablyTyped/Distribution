package typings.highlightJs.mod

import typings.highlightJs.anon.AnyNumberOfTimes
import typings.highlightJs.anon.LanguageName
import typings.highlightJs.anon.PartialHLJSOptions
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicApi extends StObject {
  
  def addPlugin(plugin: HLJSPlugin): Unit = js.native
  
  def autoDetection(languageName: String): Boolean = js.native
  
  def configure(options: PartialHLJSOptions): Unit = js.native
  
  def debugMode(): Unit = js.native
  
  def getLanguage(languageName: String): js.UndefOr[Language] = js.native
  
  def highlight(codeOrLanguageName: String, optionsOrCode: String): HighlightResult = js.native
  def highlight(codeOrLanguageName: String, optionsOrCode: String, ignoreIllegals: Boolean): HighlightResult = js.native
  def highlight(codeOrLanguageName: String, optionsOrCode: HighlightOptions): HighlightResult = js.native
  def highlight(codeOrLanguageName: String, optionsOrCode: HighlightOptions, ignoreIllegals: Boolean): HighlightResult = js.native
  
  def highlightAll(): Unit = js.native
  
  def highlightAuto(code: String): AutoHighlightResult = js.native
  def highlightAuto(code: String, languageSubset: js.Array[String]): AutoHighlightResult = js.native
  
  def highlightBlock(element: HTMLElement): Unit = js.native
  
  def highlightElement(element: HTMLElement): Unit = js.native
  
  def inherit[T](original: T, args: (Record[String, Any])*): T = js.native
  
  def initHighlighting(): Unit = js.native
  
  def initHighlightingOnLoad(): Unit = js.native
  
  def listLanguages(): js.Array[String] = js.native
  
  var regex: AnyNumberOfTimes = js.native
  
  def registerAliases(aliasList: String, hasLanguageName: LanguageName): Unit = js.native
  def registerAliases(aliasList: js.Array[String], hasLanguageName: LanguageName): Unit = js.native
  
  def registerLanguage(languageName: String, language: LanguageFn): Unit = js.native
  
  def safeMode(): Unit = js.native
  
  def unregisterLanguage(languageName: String): Unit = js.native
  
  var versionString: String = js.native
  
  def vuePlugin(): VuePlugin = js.native
}
