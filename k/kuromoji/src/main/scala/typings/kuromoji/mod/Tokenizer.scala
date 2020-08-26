package typings.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokenizer[T] extends js.Object {
  var formatter: Formatter[T] = js.native
  var token_info_dictionary: TokenInfoDictionary = js.native
  var unknown_dictionary: UnknownDictionary = js.native
  var viterbi_builder: ViterbiBuilder = js.native
  var viterbi_searcher: ViterbiSearcher = js.native
  def getLattice(text: String): ViterbiLattice = js.native
  def tokenize(text: String): js.Array[T] = js.native
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
  @scala.inline
  implicit class TokenizerOps[Self <: Tokenizer[_], T] (val x: Self with Tokenizer[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormatter(value: Formatter[T]): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetLattice(value: String => ViterbiLattice): Self = this.set("getLattice", js.Any.fromFunction1(value))
    @scala.inline
    def setToken_info_dictionary(value: TokenInfoDictionary): Self = this.set("token_info_dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenize(value: String => js.Array[T]): Self = this.set("tokenize", js.Any.fromFunction1(value))
    @scala.inline
    def setUnknown_dictionary(value: UnknownDictionary): Self = this.set("unknown_dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setViterbi_builder(value: ViterbiBuilder): Self = this.set("viterbi_builder", value.asInstanceOf[js.Any])
    @scala.inline
    def setViterbi_searcher(value: ViterbiSearcher): Self = this.set("viterbi_searcher", value.asInstanceOf[js.Any])
  }
  
}

