package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJSONWebKeysResponse extends js.Object {
  
  /** OnePlatform automatically extracts this field and uses it to set the HTTP Cache-Control header. */
  var cacheHeader: js.UndefOr[HttpCacheControlResponseHeader] = js.native
  
  /** The public component of the keys used by the cluster to sign token requests. */
  var keys: js.UndefOr[js.Array[Jwk]] = js.native
}
object GetJSONWebKeysResponse {
  
  @scala.inline
  def apply(): GetJSONWebKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJSONWebKeysResponse]
  }
  
  @scala.inline
  implicit class GetJSONWebKeysResponseOps[Self <: GetJSONWebKeysResponse] (val x: Self) extends AnyVal {
    
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
    def setCacheHeader(value: HttpCacheControlResponseHeader): Self = this.set("cacheHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheHeader: Self = this.set("cacheHeader", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: Jwk*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[Jwk]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
  }
}
