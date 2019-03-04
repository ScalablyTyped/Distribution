package typings
package kuromojiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Tokeninfodictionary extends js.Object {
  var token_info_dictionary: kuromojiLib.kuromojiMod.TokenInfoDictionary
  var trie: doublearrayLib.doublearrayNs.DoubleArray
}

object Anon_Tokeninfodictionary {
  @scala.inline
  def apply(
    token_info_dictionary: kuromojiLib.kuromojiMod.TokenInfoDictionary,
    trie: doublearrayLib.doublearrayNs.DoubleArray
  ): Anon_Tokeninfodictionary = {
    val __obj = js.Dynamic.literal(token_info_dictionary = token_info_dictionary, trie = trie)
  
    __obj.asInstanceOf[Anon_Tokeninfodictionary]
  }
}

