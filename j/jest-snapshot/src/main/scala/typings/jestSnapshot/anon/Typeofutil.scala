package typings.jestSnapshot.anon

import typings.jestSnapshot.jestSnapshotStrings.Apostrophe
import typings.jestSnapshot.jestSnapshotStrings.Quotationmark
import typings.prettier.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofutil extends js.Object {
  
  def addDanglingComment(node: js.Any, commentNode: js.Any): Unit = js.native
  
  def addLeadingComment(node: js.Any, commentNode: js.Any): Unit = js.native
  
  def addTrailingComment(node: js.Any, commentNode: js.Any): Unit = js.native
  
  def getNextNonSpaceNonCommentCharacterIndex(text: String, node: js.Any, options: ParserOptions[_]): Double = js.native
  
  def isNextLineEmpty(text: String, node: js.Any, locEnd: js.Function1[/* node */ js.Any, Double]): Boolean = js.native
  
  def isNextLineEmptyAfterIndex(text: String, index: Double): Boolean = js.native
  
  def isPreviousLineEmpty(text: String, node: js.Any, locStart: js.Function1[/* node */ js.Any, Double]): Boolean = js.native
  
  def makeString(rawContent: String, enclosingQuote: Apostrophe, unescapeUnnecessaryEscapes: Boolean): String = js.native
  def makeString(rawContent: String, enclosingQuote: Quotationmark, unescapeUnnecessaryEscapes: Boolean): String = js.native
}
