package typings.leafletGeosearch.mod

import typings.leafletGeosearch.leafletGeosearchNumbers.`0`
import typings.leafletGeosearch.leafletGeosearchNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenStreetMapProviderOptionsOther extends js.Object {
  
  var debug: js.UndefOr[`0` | `1`] = js.native
  
  var dedupe: js.UndefOr[`0` | `1`] = js.native
  
  var email: js.UndefOr[String] = js.native
}
object OpenStreetMapProviderOptionsOther {
  
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsOther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsOther]
  }
  
  @scala.inline
  implicit class OpenStreetMapProviderOptionsOtherOps[Self <: OpenStreetMapProviderOptionsOther] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: `0` | `1`): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDedupe(value: `0` | `1`): Self = this.set("dedupe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDedupe: Self = this.set("dedupe", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
  }
}
