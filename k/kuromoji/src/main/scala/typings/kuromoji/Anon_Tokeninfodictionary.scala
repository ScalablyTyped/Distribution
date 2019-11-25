package typings.kuromoji

import typings.doublearray.doublearray.DoubleArray
import typings.kuromoji.kuromojiMod.TokenInfoDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tokeninfodictionary extends js.Object {
  var token_info_dictionary: TokenInfoDictionary
  var trie: DoubleArray
}

object Anon_Tokeninfodictionary {
  @scala.inline
  def apply(token_info_dictionary: TokenInfoDictionary, trie: DoubleArray): Anon_Tokeninfodictionary = {
    val __obj = js.Dynamic.literal(token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Tokeninfodictionary]
  }
}

