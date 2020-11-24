package typings.kuromoji.mod

import typings.doublearray.doublearray.DoubleArray
import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicDictionaries extends js.Object {
  
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
  implicit class DynamicDictionariesOps[Self <: DynamicDictionaries] (val x: Self) extends AnyVal {
    
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
    def setConnection_costs(value: ConnectionCosts): Self = this.set("connection_costs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadTrie(value: (Int32Array, Int32Array) => DynamicDictionaries): Self = this.set("loadTrie", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToken_info_dictionary(value: TokenInfoDictionary): Self = this.set("token_info_dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrie(value: DoubleArray): Self = this.set("trie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknown_dictionary(value: UnknownDictionary): Self = this.set("unknown_dictionary", value.asInstanceOf[js.Any])
  }
}
