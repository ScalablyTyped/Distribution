package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApkBinary extends StObject {
  
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
  implicit class ApkBinaryMutableBuilder[Self <: ApkBinary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
