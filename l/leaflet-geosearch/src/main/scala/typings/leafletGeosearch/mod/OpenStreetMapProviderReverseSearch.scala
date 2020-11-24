package typings.leafletGeosearch.mod

import typings.leafletGeosearch.anon.Raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapProviderReverseSearch extends js.Object {
  
  var data: Raw = js.native
}
object OpenStreetMapProviderReverseSearch {
  
  @scala.inline
  def apply(data: Raw): OpenStreetMapProviderReverseSearch = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenStreetMapProviderReverseSearch]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderReverseSearchOps[Self <: OpenStreetMapProviderReverseSearch] (val x: Self) extends AnyVal {
    
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
    def setData(value: Raw): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
