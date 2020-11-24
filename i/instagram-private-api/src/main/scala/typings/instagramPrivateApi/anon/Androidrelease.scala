package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Androidrelease extends js.Object {
  
  var android_release: String = js.native
  
  var android_version: String = js.native
  
  var manufacturer: String = js.native
  
  var model: String = js.native
}
object Androidrelease {
  
  @scala.inline
  def apply(android_release: String, android_version: String, manufacturer: String, model: String): Androidrelease = {
    val __obj = js.Dynamic.literal(android_release = android_release.asInstanceOf[js.Any], android_version = android_version.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Androidrelease]
  }
  
  @scala.inline
  implicit class AndroidreleaseOps[Self <: Androidrelease] (val x: Self) extends AnyVal {
    
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
    def setAndroid_release(value: String): Self = this.set("android_release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid_version(value: String): Self = this.set("android_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
  }
}
