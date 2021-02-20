package typings.kuromoji

import typings.doublearray.doublearray.DoubleArray
import typings.kuromoji.mod.TokenInfoDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Tokeninfodictionary extends StObject {
    
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
    implicit class TokeninfodictionaryMutableBuilder[Self <: Tokeninfodictionary] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToken_info_dictionary(value: TokenInfoDictionary): Self = StObject.set(x, "token_info_dictionary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrie(value: DoubleArray): Self = StObject.set(x, "trie", value.asInstanceOf[js.Any])
    }
  }
}
