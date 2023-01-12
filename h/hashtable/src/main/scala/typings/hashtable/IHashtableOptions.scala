package typings.hashtable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHashtableOptions[TKey] extends StObject {
  
  @JSName("equals")
  var equals_FIHashtableOptions: js.UndefOr[js.Function2[/* key1 */ TKey, /* key2 */ TKey, Boolean]] = js.undefined
  
  @JSName("hashCode")
  var hashCode_FIHashtableOptions: js.UndefOr[js.Function1[/* key */ TKey, Any]] = js.undefined
  
  var replaceDuplicateKey: js.UndefOr[Boolean] = js.undefined
}
object IHashtableOptions {
  
  inline def apply[TKey](): IHashtableOptions[TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHashtableOptions[TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHashtableOptions[?], TKey] (val x: Self & IHashtableOptions[TKey]) extends AnyVal {
    
    inline def setEquals_(value: (/* key1 */ TKey, /* key2 */ TKey) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    inline def setHashCode_(value: /* key */ TKey => Any): Self = StObject.set(x, "hashCode", js.Any.fromFunction1(value))
    
    inline def setHashCode_Undefined: Self = StObject.set(x, "hashCode", js.undefined)
    
    inline def setReplaceDuplicateKey(value: Boolean): Self = StObject.set(x, "replaceDuplicateKey", value.asInstanceOf[js.Any])
    
    inline def setReplaceDuplicateKeyUndefined: Self = StObject.set(x, "replaceDuplicateKey", js.undefined)
  }
}
