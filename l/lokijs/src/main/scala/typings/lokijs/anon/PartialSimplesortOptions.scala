package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.SimplesortOptions> */
@js.native
trait PartialSimplesortOptions extends js.Object {
  
  var desc: js.UndefOr[Boolean] = js.native
  
  var disableIndexIntersect: js.UndefOr[Boolean] = js.native
  
  var forceIndexIntersect: js.UndefOr[Boolean] = js.native
  
  var useJavascriptSorting: js.UndefOr[Boolean] = js.native
}
object PartialSimplesortOptions {
  
  @scala.inline
  def apply(): PartialSimplesortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSimplesortOptions]
  }
  
  @scala.inline
  implicit class PartialSimplesortOptionsOps[Self <: PartialSimplesortOptions] (val x: Self) extends AnyVal {
    
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
    def setDesc(value: Boolean): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    
    @scala.inline
    def setDisableIndexIntersect(value: Boolean): Self = this.set("disableIndexIntersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableIndexIntersect: Self = this.set("disableIndexIntersect", js.undefined)
    
    @scala.inline
    def setForceIndexIntersect(value: Boolean): Self = this.set("forceIndexIntersect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceIndexIntersect: Self = this.set("forceIndexIntersect", js.undefined)
    
    @scala.inline
    def setUseJavascriptSorting(value: Boolean): Self = this.set("useJavascriptSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseJavascriptSorting: Self = this.set("useJavascriptSorting", js.undefined)
  }
}
