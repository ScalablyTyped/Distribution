package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalData extends js.Object {
  
  /** The base-64 encoded SHA-256 hash of the content hosted at url. If the content doesn't match this hash, Android Device Policy won't use the data. */
  var sha256Hash: js.UndefOr[String] = js.native
  
  /**
    * The absolute URL to the data, which must use either the http or https scheme. Android Device Policy doesn't provide any credentials in the GET request, so the URL must be publicly
    * accessible. Including a long, random component in the URL may be used to prevent attackers from discovering the URL.
    */
  var url: js.UndefOr[String] = js.native
}
object ExternalData {
  
  @scala.inline
  def apply(): ExternalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalData]
  }
  
  @scala.inline
  implicit class ExternalDataOps[Self <: ExternalData] (val x: Self) extends AnyVal {
    
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
    def setSha256Hash(value: String): Self = this.set("sha256Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256Hash: Self = this.set("sha256Hash", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
