package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDKInfo extends StObject {
  
  /** Required. The SDK Language. */
  var language: js.UndefOr[String] = js.undefined
  
  /** Optional. The SDK version. */
  var version: js.UndefOr[String] = js.undefined
}
object SDKInfo {
  
  inline def apply(): SDKInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SDKInfo]
  }
  
  extension [Self <: SDKInfo](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
