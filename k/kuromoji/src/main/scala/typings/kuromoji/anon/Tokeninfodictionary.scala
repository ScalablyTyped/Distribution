package typings.kuromoji.anon

import typings.doublearray.doublearray.DoubleArray
import typings.kuromoji.mod.TokenInfoDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokeninfodictionary extends js.Object {
  var token_info_dictionary: TokenInfoDictionary
  var trie: DoubleArray
}

object Tokeninfodictionary {
  @scala.inline
  def apply(token_info_dictionary: TokenInfoDictionary, trie: DoubleArray): Tokeninfodictionary = {
    val __obj = js.Dynamic.literal(token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokeninfodictionary]
  }
}

