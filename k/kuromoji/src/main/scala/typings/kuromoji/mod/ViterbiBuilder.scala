package typings.kuromoji.mod

import typings.doublearray.doublearray.DoubleArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViterbiBuilder extends StObject {
  
  def build(sentence_str: String): ViterbiLattice
  
  var token_info_dictionary: TokenInfoDictionary
  
  var trie: DoubleArray
  
  var unknown_dictionary: UnknownDictionary
}
object ViterbiBuilder {
  
  inline def apply(
    build: String => ViterbiLattice,
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): ViterbiBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any], unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViterbiBuilder]
  }
  
  extension [Self <: ViterbiBuilder](x: Self) {
    
    inline def setBuild(value: String => ViterbiLattice): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
    
    inline def setToken_info_dictionary(value: TokenInfoDictionary): Self = StObject.set(x, "token_info_dictionary", value.asInstanceOf[js.Any])
    
    inline def setTrie(value: DoubleArray): Self = StObject.set(x, "trie", value.asInstanceOf[js.Any])
    
    inline def setUnknown_dictionary(value: UnknownDictionary): Self = StObject.set(x, "unknown_dictionary", value.asInstanceOf[js.Any])
  }
}
