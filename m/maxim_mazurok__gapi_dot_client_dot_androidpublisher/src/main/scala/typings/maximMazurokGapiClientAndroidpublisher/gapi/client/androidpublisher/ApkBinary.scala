package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApkBinary extends js.Object {
  
  /** A sha1 hash of the APK payload, encoded as a hex string and matching the output of the sha1sum command. */
  var sha1: js.UndefOr[String] = js.native
  
  /** A sha256 hash of the APK payload, encoded as a hex string and matching the output of the sha256sum command. */
  var sha256: js.UndefOr[String] = js.native
}
object ApkBinary {
  
  @scala.inline
  def apply(): ApkBinary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApkBinary]
  }
  
  @scala.inline
  implicit class ApkBinaryOps[Self <: ApkBinary] (val x: Self) extends AnyVal {
    
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
    def setSha1(value: String): Self = this.set("sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha1: Self = this.set("sha1", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = this.set("sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha256: Self = this.set("sha256", js.undefined)
  }
}
