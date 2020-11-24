package typings.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynaTreeStringsOptions extends js.Object {
  
  var loadError: js.UndefOr[String] = js.native
  
  var loading: js.UndefOr[String] = js.native
}
object DynaTreeStringsOptions {
  
  @scala.inline
  def apply(): DynaTreeStringsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynaTreeStringsOptions]
  }
  
  @scala.inline
  implicit class DynaTreeStringsOptionsOps[Self <: DynaTreeStringsOptions] (val x: Self) extends AnyVal {
    
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
    def setLoadError(value: String): Self = this.set("loadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadError: Self = this.set("loadError", js.undefined)
    
    @scala.inline
    def setLoading(value: String): Self = this.set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
  }
}
