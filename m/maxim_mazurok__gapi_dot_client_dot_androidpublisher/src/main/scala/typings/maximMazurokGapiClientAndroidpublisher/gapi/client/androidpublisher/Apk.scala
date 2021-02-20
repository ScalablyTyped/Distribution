package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Apk extends StObject {
  
  /** Information about the binary payload of this APK. */
  var binary: js.UndefOr[ApkBinary] = js.native
  
  /** The version code of the APK, as specified in the manifest file. */
  var versionCode: js.UndefOr[Double] = js.native
}
object Apk {
  
  @scala.inline
  def apply(): Apk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Apk]
  }
  
  @scala.inline
  implicit class ApkMutableBuilder[Self <: Apk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: ApkBinary): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setVersionCode(value: Double): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
  }
}
