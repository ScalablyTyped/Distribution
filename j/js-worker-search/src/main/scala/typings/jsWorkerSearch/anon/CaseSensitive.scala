package typings.jsWorkerSearch.anon

import typings.jsWorkerSearch.mod.INDEX_MODES
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaseSensitive extends js.Object {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var indexMode: js.UndefOr[INDEX_MODES] = js.native
  
  var matchAnyToken: js.UndefOr[Boolean] = js.native
  
  var tokenizePattern: js.UndefOr[RegExp] = js.native
}
object CaseSensitive {
  
  @scala.inline
  def apply(): CaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseSensitive]
  }
  
  @scala.inline
  implicit class CaseSensitiveOps[Self <: CaseSensitive] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setIndexMode(value: INDEX_MODES): Self = this.set("indexMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexMode: Self = this.set("indexMode", js.undefined)
    
    @scala.inline
    def setMatchAnyToken(value: Boolean): Self = this.set("matchAnyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchAnyToken: Self = this.set("matchAnyToken", js.undefined)
    
    @scala.inline
    def setTokenizePattern(value: RegExp): Self = this.set("tokenizePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenizePattern: Self = this.set("tokenizePattern", js.undefined)
  }
}
