package typings.kuromoji.mod

import typings.doublearray.doublearray.DoubleArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViterbiBuilder extends StObject {
  
  def build(sentence_str: String): ViterbiLattice = js.native
  
  var token_info_dictionary: TokenInfoDictionary = js.native
  
  var trie: DoubleArray = js.native
  
  var unknown_dictionary: UnknownDictionary = js.native
}
object ViterbiBuilder {
  
  @scala.inline
  def apply(
    build: String => ViterbiLattice,
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): ViterbiBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any], unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViterbiBuilder]
  }
  
  @scala.inline
  implicit class ViterbiBuilderMutableBuilder[Self <: ViterbiBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: String => ViterbiLattice): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToken_info_dictionary(value: TokenInfoDictionary): Self = StObject.set(x, "token_info_dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrie(value: DoubleArray): Self = StObject.set(x, "trie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown_dictionary(value: UnknownDictionary): Self = StObject.set(x, "unknown_dictionary", value.asInstanceOf[js.Any])
  }
}
