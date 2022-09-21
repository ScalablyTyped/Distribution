package typings.marked.mod.marked

import typings.marked.markedStrings.`inline`
import typings.marked.markedStrings.block
import typings.marked.mod.marked.Tokens.Generic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenizerExtension extends StObject {
  
  var childTokens: js.UndefOr[js.Array[String]] = js.native
  
  var level: block | `inline` = js.native
  
  var name: String = js.native
  
  var start: js.UndefOr[js.ThisFunction1[/* this */ TokenizerThis, /* src */ String, Double | Unit]] = js.native
  
  def tokenizer(src: String, tokens: js.Array[Token]): Generic | Unit = js.native
  def tokenizer(src: String, tokens: TokensList): Generic | Unit = js.native
}
