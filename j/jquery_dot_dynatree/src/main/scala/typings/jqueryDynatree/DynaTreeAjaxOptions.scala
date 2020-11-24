package typings.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynaTreeAjaxOptions extends js.Object {
  
  var cache: js.UndefOr[Boolean] = js.native
  
   // >0: Make sure we get an ajax error for invalid URLs
  var dataType: js.UndefOr[String] = js.native
  
   // false: Append random '_' argument to the request url to prevent caching.
  var timeout: js.UndefOr[Double] = js.native
}
object DynaTreeAjaxOptions {
  
  @scala.inline
  def apply(): DynaTreeAjaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynaTreeAjaxOptions]
  }
  
  @scala.inline
  implicit class DynaTreeAjaxOptionsOps[Self <: DynaTreeAjaxOptions] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
