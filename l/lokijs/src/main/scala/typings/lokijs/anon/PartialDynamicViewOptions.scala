package typings.lokijs.anon

import typings.lokijs.lokijsStrings.active
import typings.lokijs.lokijsStrings.passive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.DynamicViewOptions> */
@js.native
trait PartialDynamicViewOptions extends js.Object {
  
  var minRebuildInterval: js.UndefOr[Double] = js.native
  
  var persistent: js.UndefOr[Boolean] = js.native
  
  var sortPriority: js.UndefOr[active | passive] = js.native
}
object PartialDynamicViewOptions {
  
  @scala.inline
  def apply(): PartialDynamicViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDynamicViewOptions]
  }
  
  @scala.inline
  implicit class PartialDynamicViewOptionsOps[Self <: PartialDynamicViewOptions] (val x: Self) extends AnyVal {
    
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
    def setMinRebuildInterval(value: Double): Self = this.set("minRebuildInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRebuildInterval: Self = this.set("minRebuildInterval", js.undefined)
    
    @scala.inline
    def setPersistent(value: Boolean): Self = this.set("persistent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistent: Self = this.set("persistent", js.undefined)
    
    @scala.inline
    def setSortPriority(value: active | passive): Self = this.set("sortPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortPriority: Self = this.set("sortPriority", js.undefined)
  }
}
