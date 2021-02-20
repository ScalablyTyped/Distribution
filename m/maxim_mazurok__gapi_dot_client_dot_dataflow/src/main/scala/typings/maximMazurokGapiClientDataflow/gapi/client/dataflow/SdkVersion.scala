package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdkVersion extends StObject {
  
  /** The support status for this SDK version. */
  var sdkSupportStatus: js.UndefOr[String] = js.native
  
  /** The version of the SDK used to run the job. */
  var version: js.UndefOr[String] = js.native
  
  /** A readable string describing the version of the SDK. */
  var versionDisplayName: js.UndefOr[String] = js.native
}
object SdkVersion {
  
  @scala.inline
  def apply(): SdkVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkVersion]
  }
  
  @scala.inline
  implicit class SdkVersionMutableBuilder[Self <: SdkVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSdkSupportStatus(value: String): Self = StObject.set(x, "sdkSupportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkSupportStatusUndefined: Self = StObject.set(x, "sdkSupportStatus", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDisplayName(value: String): Self = StObject.set(x, "versionDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDisplayNameUndefined: Self = StObject.set(x, "versionDisplayName", js.undefined)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
