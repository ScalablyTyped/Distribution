package typings.maximMazurokGapiClientDigitalassetlinks.gapi.client.digitalassetlinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asset extends js.Object {
  
  /** Set if this is an Android App asset. */
  var androidApp: js.UndefOr[AndroidAppAsset] = js.native
  
  /** Set if this is a web asset. */
  var web: js.UndefOr[WebAsset] = js.native
}
object Asset {
  
  @scala.inline
  def apply(): Asset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asset]
  }
  
  @scala.inline
  implicit class AssetOps[Self <: Asset] (val x: Self) extends AnyVal {
    
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
    def setAndroidApp(value: AndroidAppAsset): Self = this.set("androidApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidApp: Self = this.set("androidApp", js.undefined)
    
    @scala.inline
    def setWeb(value: WebAsset): Self = this.set("web", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
  }
}
