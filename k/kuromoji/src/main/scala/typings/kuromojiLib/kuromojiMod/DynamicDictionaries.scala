package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicDictionaries extends js.Object {
  var connection_costs: ConnectionCosts
  var token_info_dictionary: TokenInfoDictionary
  var trie: doublearrayLib.doublearrayNs.DoubleArray
  var unknown_dictionary: UnknownDictionary
  def loadTrie(base_buffer: stdLib.Int32Array, check_buffer: stdLib.Int32Array): DynamicDictionaries
}

object DynamicDictionaries {
  @scala.inline
  def apply(
    connection_costs: ConnectionCosts,
    loadTrie: js.Function2[stdLib.Int32Array, stdLib.Int32Array, DynamicDictionaries],
    token_info_dictionary: TokenInfoDictionary,
    trie: doublearrayLib.doublearrayNs.DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): DynamicDictionaries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection_costs")(connection_costs)
    __obj.updateDynamic("loadTrie")(loadTrie)
    __obj.updateDynamic("token_info_dictionary")(token_info_dictionary)
    __obj.updateDynamic("trie")(trie)
    __obj.updateDynamic("unknown_dictionary")(unknown_dictionary)
    __obj.asInstanceOf[DynamicDictionaries]
  }
}

