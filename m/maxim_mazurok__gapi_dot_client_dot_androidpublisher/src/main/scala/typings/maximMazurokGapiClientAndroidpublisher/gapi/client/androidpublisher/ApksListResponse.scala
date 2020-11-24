package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApksListResponse extends js.Object {
  
  /** All APKs. */
  var apks: js.UndefOr[js.Array[Apk]] = js.native
  
  /** The kind of this response ("androidpublisher#apksListResponse"). */
  var kind: js.UndefOr[String] = js.native
}
object ApksListResponse {
  
  @scala.inline
  def apply(): ApksListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApksListResponse]
  }
  
  @scala.inline
  implicit class ApksListResponseOps[Self <: ApksListResponse] (val x: Self) extends AnyVal {
    
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
    def setApksVarargs(value: Apk*): Self = this.set("apks", js.Array(value :_*))
    
    @scala.inline
    def setApks(value: js.Array[Apk]): Self = this.set("apks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApks: Self = this.set("apks", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
