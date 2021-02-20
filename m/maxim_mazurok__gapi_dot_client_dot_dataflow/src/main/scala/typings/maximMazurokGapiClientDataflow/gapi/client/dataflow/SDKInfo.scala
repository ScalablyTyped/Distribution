package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDKInfo extends StObject {
  
  /** Required. The SDK Language. */
  var language: js.UndefOr[String] = js.native
  
  /** Optional. The SDK version. */
  var version: js.UndefOr[String] = js.native
}
object SDKInfo {
  
  @scala.inline
  def apply(): SDKInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SDKInfo]
  }
  
  @scala.inline
  implicit class SDKInfoMutableBuilder[Self <: SDKInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
