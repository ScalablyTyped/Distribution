package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceSpec extends js.Object {
  
  /** Screen dpi. */
  var screenDensity: js.UndefOr[Double] = js.native
  
  /** Supported ABI architectures in the order of preference. The values should be the string as reported by the platform, e.g. "armeabi-v7a", "x86_64". */
  var supportedAbis: js.UndefOr[js.Array[String]] = js.native
  
  /** All installed locales represented as BCP-47 strings, e.g. "en-US". */
  var supportedLocales: js.UndefOr[js.Array[String]] = js.native
}
object DeviceSpec {
  
  @scala.inline
  def apply(): DeviceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSpec]
  }
  
  @scala.inline
  implicit class DeviceSpecOps[Self <: DeviceSpec] (val x: Self) extends AnyVal {
    
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
    def setScreenDensity(value: Double): Self = this.set("screenDensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenDensity: Self = this.set("screenDensity", js.undefined)
    
    @scala.inline
    def setSupportedAbisVarargs(value: String*): Self = this.set("supportedAbis", js.Array(value :_*))
    
    @scala.inline
    def setSupportedAbis(value: js.Array[String]): Self = this.set("supportedAbis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedAbis: Self = this.set("supportedAbis", js.undefined)
    
    @scala.inline
    def setSupportedLocalesVarargs(value: String*): Self = this.set("supportedLocales", js.Array(value :_*))
    
    @scala.inline
    def setSupportedLocales(value: js.Array[String]): Self = this.set("supportedLocales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLocales: Self = this.set("supportedLocales", js.undefined)
  }
}
