package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsesPermission extends js.Object {
  
  /** Optionally, the maximum SDK version for which the permission is required. */
  var maxSdkVersion: js.UndefOr[Double] = js.native
  
  /** The name of the permission requested. */
  var name: js.UndefOr[String] = js.native
}
object UsesPermission {
  
  @scala.inline
  def apply(): UsesPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsesPermission]
  }
  
  @scala.inline
  implicit class UsesPermissionOps[Self <: UsesPermission] (val x: Self) extends AnyVal {
    
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
    def setMaxSdkVersion(value: Double): Self = this.set("maxSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSdkVersion: Self = this.set("maxSdkVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
