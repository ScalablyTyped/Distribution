package typings.kuromoji.kuromojiMod

import typings.doublearray.doublearrayNs.DoubleArray
import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicDictionaries extends js.Object {
  var connection_costs: ConnectionCosts
  var token_info_dictionary: TokenInfoDictionary
  var trie: DoubleArray
  var unknown_dictionary: UnknownDictionary
  def loadTrie(base_buffer: Int32Array, check_buffer: Int32Array): DynamicDictionaries
}

object DynamicDictionaries {
  @scala.inline
  def apply(
    connection_costs: ConnectionCosts,
    loadTrie: (Int32Array, Int32Array) => DynamicDictionaries,
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): DynamicDictionaries = {
    val __obj = js.Dynamic.literal(connection_costs = connection_costs, loadTrie = js.Any.fromFunction2(loadTrie), token_info_dictionary = token_info_dictionary, trie = trie, unknown_dictionary = unknown_dictionary)
  
    __obj.asInstanceOf[DynamicDictionaries]
  }
}

