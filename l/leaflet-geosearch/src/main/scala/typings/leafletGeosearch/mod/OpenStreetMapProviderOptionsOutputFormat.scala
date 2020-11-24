package typings.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapProviderOptionsOutputFormat extends js.Object {
  
  var json_callback: js.UndefOr[String] = js.native
}
object OpenStreetMapProviderOptionsOutputFormat {
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsOutputFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOutputFormat]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsOutputFormatOps[Self <: OpenStreetMapProviderOptionsOutputFormat] (val x: Self) extends AnyVal {
    
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
    def setJson_callback(value: String): Self = this.set("json_callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson_callback: Self = this.set("json_callback", js.undefined)
  }
}
