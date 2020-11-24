package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemApksListResponse extends js.Object {
  
  /** All system APK variants created. */
  var variants: js.UndefOr[js.Array[Variant]] = js.native
}
object SystemApksListResponse {
  
  @scala.inline
  def apply(): SystemApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemApksListResponse]
  }
  
  @scala.inline
  implicit class SystemApksListResponseOps[Self <: SystemApksListResponse] (val x: Self) extends AnyVal {
    
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
    def setVariantsVarargs(value: Variant*): Self = this.set("variants", js.Array(value :_*))
    
    @scala.inline
    def setVariants(value: js.Array[Variant]): Self = this.set("variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
}
