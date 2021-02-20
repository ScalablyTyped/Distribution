package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Androidrelease extends StObject {
  
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
  implicit class AndroidreleaseMutableBuilder[Self <: Androidrelease] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid_release(value: String): Self = StObject.set(x, "android_release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroid_version(value: String): Self = StObject.set(x, "android_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
