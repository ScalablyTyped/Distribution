package typings.kuromoji.anon

import typings.doublearray.doublearray.DoubleArray
import typings.kuromoji.mod.TokenInfoDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokeninfodictionary extends js.Object {
  
  var token_info_dictionary: TokenInfoDictionary = js.native
  
  var trie: DoubleArray = js.native
}
object Tokeninfodictionary {
  
  @scala.inline
  def apply(token_info_dictionary: TokenInfoDictionary, trie: DoubleArray): Tokeninfodictionary = {
    val __obj = js.Dynamic.literal(token_info_dictionary = token_info_dictionary.asInstanceOf[js.Any], trie = trie.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokeninfodictionary]
  }
  
  @scala.inline
  implicit class TokeninfodictionaryOps[Self <: Tokeninfodictionary] (val x: Self) extends AnyVal {
    
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
    def setToken_info_dictionary(value: TokenInfoDictionary): Self = this.set("token_info_dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrie(value: DoubleArray): Self = this.set("trie", value.asInstanceOf[js.Any])
  }
}
