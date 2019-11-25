package typings.kuromoji.kuromojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokenizer[T] extends js.Object {
  var formatter: Formatter[T]
  var token_info_dictionary: TokenInfoDictionary
  var unknown_dictionary: UnknownDictionary
  var viterbi_builder: ViterbiBuilder
  var viterbi_searcher: ViterbiSearcher
  def getLattice(text: String): ViterbiLattice
  def tokenize(text: String): js.Array[T]
}

object Tokenizer {
  @scala.inline
  def apply[T](
    formatter: Formatter[T],
    getLattice: String => ViterbiLattice,
    token_info_dictionary: TokenInfoDictionary,
    tokenize: String => js.Array[T],
    unknown_dictionary: UnknownDictionary,
    viterbi_builder: ViterbiBuilder,
    viterbi_searcher: ViterbiSearcher
  ): Tokenizer[T] = {
    val __obj = js.Dynamic.literal(formatter = formatter.asInstanceOf[js.Any], getLattice = js.Any.fromFunction1(getLattice), token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], tokenize = js.Any.fromFunction1(tokenize), unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any], viterbi_builder = viterbi_builder.asInstanceOf[js.Any], viterbi_searcher = viterbi_searcher.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tokenizer[T]]
  }
}

