package typings.jqueryFocusable.mod

import typings.jqueryFocusable.jqueryFocusableBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  findNegativeTabindex :boolean,   findPositiveTabindex :true}> */
@js.native
trait Options extends js.Object {
  
  var findNegativeTabindex: js.UndefOr[Boolean] = js.native
  
  var findPositiveTabindex: js.UndefOr[`true`] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFindNegativeTabindex(value: Boolean): Self = this.set("findNegativeTabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindNegativeTabindex: Self = this.set("findNegativeTabindex", js.undefined)
    
    @scala.inline
    def setFindPositiveTabindex(value: `true`): Self = this.set("findPositiveTabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindPositiveTabindex: Self = this.set("findPositiveTabindex", js.undefined)
  }
}
