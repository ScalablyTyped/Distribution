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

object ViterbiBuilder {
  @scala.inline
  def apply(
    build: js.Function1[java.lang.String, ViterbiLattice],
    token_info_dictionary: TokenInfoDictionary,
    trie: doublearrayLib.doublearrayNs.DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): ViterbiBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("token_info_dictionary")(token_info_dictionary)
    __obj.updateDynamic("trie")(trie)
    __obj.updateDynamic("unknown_dictionary")(unknown_dictionary)
    __obj.asInstanceOf[ViterbiBuilder]
  }
}

