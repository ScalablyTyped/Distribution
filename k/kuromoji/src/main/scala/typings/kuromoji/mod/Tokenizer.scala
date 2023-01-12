package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokenizer[T] extends StObject {
  
  var formatter: Formatter[T]
  
  def getLattice(text: String): ViterbiLattice
  
  var token_info_dictionary: TokenInfoDictionary
  
  def tokenize(text: String): js.Array[T]
  
  var unknown_dictionary: UnknownDictionary
  
  var viterbi_builder: ViterbiBuilder
  
  var viterbi_searcher: ViterbiSearcher
}
object Tokenizer {
  
  inline def apply[T](
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
  implicit open class MutableBuilder[Self <: Tokenizer[?], T] (val x: Self & Tokenizer[T]) extends AnyVal {
    
    inline def setFormatter(value: Formatter[T]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setGetLattice(value: String => ViterbiLattice): Self = StObject.set(x, "getLattice", js.Any.fromFunction1(value))
    
    inline def setToken_info_dictionary(value: TokenInfoDictionary): Self = StObject.set(x, "token_info_dictionary", value.asInstanceOf[js.Any])
    
    inline def setTokenize(value: String => js.Array[T]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    
    inline def setUnknown_dictionary(value: UnknownDictionary): Self = StObject.set(x, "unknown_dictionary", value.asInstanceOf[js.Any])
    
    inline def setViterbi_builder(value: ViterbiBuilder): Self = StObject.set(x, "viterbi_builder", value.asInstanceOf[js.Any])
    
    inline def setViterbi_searcher(value: ViterbiSearcher): Self = StObject.set(x, "viterbi_searcher", value.asInstanceOf[js.Any])
  }
}
