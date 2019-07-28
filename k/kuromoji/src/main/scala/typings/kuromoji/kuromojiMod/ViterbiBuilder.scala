package typings.kuromoji.kuromojiMod

import typings.doublearray.doublearrayNs.DoubleArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViterbiBuilder extends js.Object {
  var token_info_dictionary: TokenInfoDictionary
  var trie: DoubleArray
  var unknown_dictionary: UnknownDictionary
  def build(sentence_str: String): ViterbiLattice
}

object ViterbiBuilder {
  @scala.inline
  def apply(
    build: String => ViterbiLattice,
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): ViterbiBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), token_info_dictionary = token_info_dictionary, trie = trie, unknown_dictionary = unknown_dictionary)
  
    __obj.asInstanceOf[ViterbiBuilder]
  }
}

