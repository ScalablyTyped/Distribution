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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("token_info_dictionary")(token_info_dictionary)
    __obj.updateDynamic("trie")(trie)
    __obj.asInstanceOf[Anon_Tokeninfodictionary]
  }
}

