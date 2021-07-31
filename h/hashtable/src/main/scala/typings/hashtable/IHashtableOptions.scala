package typings.hashtable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashtableOptions[TKey] extends StObject {
  
  @JSName("equals")
  var equals_FIHashtableOptions: js.UndefOr[js.Function2[/* key1 */ TKey, /* key2 */ TKey, Boolean]] = js.undefined
  
  @JSName("hashCode")
  var hashCode_FIHashtableOptions: js.UndefOr[js.Function1[/* key */ TKey, js.Any]] = js.undefined
  
  var replaceDuplicateKey: js.UndefOr[Boolean] = js.undefined
}
object IHashtableOptions {
  
  @scala.inline
  def apply[TKey](): IHashtableOptions[TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHashtableOptions[TKey]]
  }
  
  @scala.inline
  implicit class IHashtableOptionsMutableBuilder[Self <: IHashtableOptions[?], TKey] (val x: Self & IHashtableOptions[TKey]) extends AnyVal {
    
    @scala.inline
    def setEquals_(value: (/* key1 */ TKey, /* key2 */ TKey) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    @scala.inline
    def setHashCode_(value: /* key */ TKey => js.Any): Self = StObject.set(x, "hashCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHashCode_Undefined: Self = StObject.set(x, "hashCode", js.undefined)
    
    @scala.inline
    def setReplaceDuplicateKey(value: Boolean): Self = StObject.set(x, "replaceDuplicateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceDuplicateKeyUndefined: Self = StObject.set(x, "replaceDuplicateKey", js.undefined)
  }
}
