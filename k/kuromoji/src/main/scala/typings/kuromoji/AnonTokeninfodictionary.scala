package typings.kuromoji

import typings.doublearray.doublearray.DoubleArray
import typings.kuromoji.mod.TokenInfoDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTokeninfodictionary extends js.Object {
  var token_info_dictionary: TokenInfoDictionary
  var trie: DoubleArray
}

object AnonTokeninfodictionary {
  @scala.inline
  def apply(token_info_dictionary: TokenInfoDictionary, trie: DoubleArray): AnonTokeninfodictionary = {
    val __obj = js.Dynamic.literal(token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTokeninfodictionary]
  }
}

