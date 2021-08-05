package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetSearchApplicationRequest extends StObject {
  
  /** Common debug options. */
  var debugOptions: js.UndefOr[DebugOptions] = js.undefined
}
object ResetSearchApplicationRequest {
  
  inline def apply(): ResetSearchApplicationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetSearchApplicationRequest]
  }
  
  extension [Self <: ResetSearchApplicationRequest](x: Self) {
    
    inline def setDebugOptions(value: DebugOptions): Self = StObject.set(x, "debugOptions", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsUndefined: Self = StObject.set(x, "debugOptions", js.undefined)
  }
}
