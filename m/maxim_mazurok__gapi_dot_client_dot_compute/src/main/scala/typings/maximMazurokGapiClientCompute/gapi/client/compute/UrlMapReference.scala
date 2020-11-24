package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMapReference extends js.Object {
  
  var urlMap: js.UndefOr[String] = js.native
}
object UrlMapReference {
  
  @scala.inline
  def apply(): UrlMapReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapReference]
  }
  
  @scala.inline
  implicit class UrlMapReferenceOps[Self <: UrlMapReference] (val x: Self) extends AnyVal {
    
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
    def setUrlMap(value: String): Self = this.set("urlMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlMap: Self = this.set("urlMap", js.undefined)
  }
}
