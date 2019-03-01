package typings
package kuromojiLib.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokenizer[T] extends js.Object {
  var formatter: Formatter[T]
  var token_info_dictionary: TokenInfoDictionary
  var unknown_dictionary: UnknownDictionary
  var viterbi_builder: ViterbiBuilder
  var viterbi_searcher: ViterbiSearcher
  def getLattice(text: java.lang.String): ViterbiLattice
  def tokenize(text: java.lang.String): js.Array[T]
}

object Tokenizer {
  @scala.inline
  def apply[T](
    formatter: Formatter[T],
    getLattice: js.Function1[java.lang.String, ViterbiLattice],
    token_info_dictionary: TokenInfoDictionary,
    tokenize: js.Function1[java.lang.String, js.Array[T]],
    unknown_dictionary: UnknownDictionary,
    viterbi_builder: ViterbiBuilder,
    viterbi_searcher: ViterbiSearcher
  ): Tokenizer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formatter")(formatter)
    __obj.updateDynamic("getLattice")(getLattice)
    __obj.updateDynamic("token_info_dictionary")(token_info_dictionary)
    __obj.updateDynamic("tokenize")(tokenize)
    __obj.updateDynamic("unknown_dictionary")(unknown_dictionary)
    __obj.updateDynamic("viterbi_builder")(viterbi_builder)
    __obj.updateDynamic("viterbi_searcher")(viterbi_searcher)
    __obj.asInstanceOf[Tokenizer[T]]
  }
}

