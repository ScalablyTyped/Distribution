package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo extends StObject {
  
  /** Explains the failure issue in more detail using hard-coded text. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** The name of the failure. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo]
  }
  
  extension [Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1BuildFailureInfo](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
