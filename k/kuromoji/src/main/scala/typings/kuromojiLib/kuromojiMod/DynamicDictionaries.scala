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

