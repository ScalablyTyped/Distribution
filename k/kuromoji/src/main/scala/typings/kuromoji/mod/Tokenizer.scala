package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokenizer[T] extends StObject {
  
  var formatter: Formatter[T] = js.native
  
  def getLattice(text: String): ViterbiLattice = js.native
  
  var token_info_dictionary: TokenInfoDictionary = js.native
  
  def tokenize(text: String): js.Array[T] = js.native
  
  var unknown_dictionary: UnknownDictionary = js.native
  
  var viterbi_builder: ViterbiBuilder = js.native
  
  var viterbi_searcher: ViterbiSearcher = js.native
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
  implicit class TokenizerMutableBuilder[Self <: Tokenizer[_], T] (val x: Self with Tokenizer[T]) extends AnyVal {
    
    @scala.inline
    def setFormatter(value: Formatter[T]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLattice(value: String => ViterbiLattice): Self = StObject.set(x, "getLattice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToken_info_dictionary(value: TokenInfoDictionary): Self = StObject.set(x, "token_info_dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenize(value: String => js.Array[T]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnknown_dictionary(value: UnknownDictionary): Self = StObject.set(x, "unknown_dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViterbi_builder(value: ViterbiBuilder): Self = StObject.set(x, "viterbi_builder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViterbi_searcher(value: ViterbiSearcher): Self = StObject.set(x, "viterbi_searcher", value.asInstanceOf[js.Any])
  }
}
