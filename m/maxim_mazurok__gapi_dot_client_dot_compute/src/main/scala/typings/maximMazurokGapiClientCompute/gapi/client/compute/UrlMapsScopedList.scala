package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlMapsScopedList extends js.Object {
  
  /** A list of UrlMaps contained in this scope. */
  var urlMaps: js.UndefOr[js.Array[UrlMap]] = js.native
  
  /** Informational warning which replaces the list of backend services when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object UrlMapsScopedList {
  
  @scala.inline
  def apply(): UrlMapsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapsScopedList]
  }
  
  @scala.inline
  implicit class UrlMapsScopedListOps[Self <: UrlMapsScopedList] (val x: Self) extends AnyVal {
    
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
    def setUrlMapsVarargs(value: UrlMap*): Self = this.set("urlMaps", js.Array(value :_*))
    
    @scala.inline
    def setUrlMaps(value: js.Array[UrlMap]): Self = this.set("urlMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlMaps: Self = this.set("urlMaps", js.undefined)
    
    @scala.inline
    def setWarning(value: Code): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
