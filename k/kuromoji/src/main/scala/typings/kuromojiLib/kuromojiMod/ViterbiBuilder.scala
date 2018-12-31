package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiBuilder extends js.Object {
  var token_info_dictionary: TokenInfoDictionary
  var trie: doublearrayLib.doublearrayNs.DoubleArray
  var unknown_dictionary: UnknownDictionary
  def build(sentence_str: java.lang.String): ViterbiLattice
}

