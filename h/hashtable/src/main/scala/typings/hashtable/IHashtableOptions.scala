package typings.hashtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHashtableOptions[TKey] extends js.Object {
  
  @JSName("equals")
  var equals_FIHashtableOptions: js.UndefOr[js.Function2[/* key1 */ TKey, /* key2 */ TKey, Boolean]] = js.native
  
  @JSName("hashCode")
  var hashCode_FIHashtableOptions: js.UndefOr[js.Function1[/* key */ TKey, _]] = js.native
  
  var replaceDuplicateKey: js.UndefOr[Boolean] = js.native
}
object IHashtableOptions {
  
  @scala.inline
  def apply[TKey](): IHashtableOptions[TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHashtableOptions[TKey]]
  }
  
  @scala.inline
  implicit class IHashtableOptionsOps[Self <: IHashtableOptions[_], TKey] (val x: Self with IHashtableOptions[TKey]) extends AnyVal {
    
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
    def setEquals(value: (/* key1 */ TKey, /* key2 */ TKey) => Boolean): Self = this.set("equals", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setHashCode(value: /* key */ TKey => _): Self = this.set("hashCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHashCode: Self = this.set("hashCode", js.undefined)
    
    @scala.inline
    def setReplaceDuplicateKey(value: Boolean): Self = this.set("replaceDuplicateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceDuplicateKey: Self = this.set("replaceDuplicateKey", js.undefined)
  }
}
