package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatacatalogV1beta1SystemTimestamps extends js.Object {
  
  /** The creation time of the resource within the given system. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The expiration time of the resource within the given system. Currently only apllicable to BigQuery resources. */
  var expireTime: js.UndefOr[String] = js.native
  
  /** The last-modified time of the resource within the given system. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleCloudDatacatalogV1beta1SystemTimestamps {
  
  @scala.inline
  def apply(): GoogleCloudDatacatalogV1beta1SystemTimestamps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1SystemTimestamps]
  }
  
  @scala.inline
  implicit class GoogleCloudDatacatalogV1beta1SystemTimestampsOps[Self <: GoogleCloudDatacatalogV1beta1SystemTimestamps] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
