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
    getLattice: java.lang.String => ViterbiLattice,
    token_info_dictionary: TokenInfoDictionary,
    tokenize: java.lang.String => js.Array[T],
    unknown_dictionary: UnknownDictionary,
    viterbi_builder: ViterbiBuilder,
    viterbi_searcher: ViterbiSearcher
  ): Tokenizer[T] = {
    val __obj = js.Dynamic.literal(formatter = formatter, getLattice = js.Any.fromFunction1(getLattice), token_info_dictionary = token_info_dictionary, tokenize = js.Any.fromFunction1(tokenize), unknown_dictionary = unknown_dictionary, viterbi_builder = viterbi_builder, viterbi_searcher = viterbi_searcher)
  
    __obj.asInstanceOf[Tokenizer[T]]
  }
}

