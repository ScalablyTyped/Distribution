package typings.kuromoji.mod

import typings.doublearray.doublearray.DoubleArray
import typings.std.Int32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicDictionaries extends StObject {
  
  var connection_costs: ConnectionCosts = js.native
  
  def loadTrie(base_buffer: Int32Array, check_buffer: Int32Array): DynamicDictionaries = js.native
  
  var token_info_dictionary: TokenInfoDictionary = js.native
  
  var trie: DoubleArray = js.native
  
  var unknown_dictionary: UnknownDictionary = js.native
}
object DynamicDictionaries {
  
  @scala.inline
  def apply(
    connection_costs: ConnectionCosts,
    loadTrie: (Int32Array, Int32Array) => DynamicDictionaries,
    token_info_dictionary: TokenInfoDictionary,
    trie: DoubleArray,
    unknown_dictionary: UnknownDictionary
  ): DynamicDictionaries = {
    val __obj = js.Dynamic.literal(connection_costs = connection_costs.asInstanceOf[js.Any], loadTrie = js.Any.fromFunction2(loadTrie), token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any], unknown_dictionary = unknown_dictionary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicDictionaries]
  }
  
  @scala.inline
  implicit class DynamicDictionariesMutableBuilder[Self <: DynamicDictionaries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection_costs(value: ConnectionCosts): Self = StObject.set(x, "connection_costs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadTrie(value: (Int32Array, Int32Array) => DynamicDictionaries): Self = StObject.set(x, "loadTrie", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToken_info_dictionary(value: TokenInfoDictionary): Self = StObject.set(x, "token_info_dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrie(value: DoubleArray): Self = StObject.set(x, "trie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown_dictionary(value: UnknownDictionary): Self = StObject.set(x, "unknown_dictionary", value.asInstanceOf[js.Any])
  }
}
