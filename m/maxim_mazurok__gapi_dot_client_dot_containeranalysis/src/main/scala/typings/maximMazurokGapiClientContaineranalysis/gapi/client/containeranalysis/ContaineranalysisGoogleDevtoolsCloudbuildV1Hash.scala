package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContaineranalysisGoogleDevtoolsCloudbuildV1Hash extends StObject {
  
  /** The type of hash that was performed. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The hash value. */
  var value: js.UndefOr[String] = js.undefined
}
object ContaineranalysisGoogleDevtoolsCloudbuildV1Hash {
  
  inline def apply(): ContaineranalysisGoogleDevtoolsCloudbuildV1Hash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContaineranalysisGoogleDevtoolsCloudbuildV1Hash]
  }
  
  extension [Self <: ContaineranalysisGoogleDevtoolsCloudbuildV1Hash](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
