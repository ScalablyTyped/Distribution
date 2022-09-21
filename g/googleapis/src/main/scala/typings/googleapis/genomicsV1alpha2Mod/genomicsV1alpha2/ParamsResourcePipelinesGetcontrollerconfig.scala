package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePipelinesGetcontrollerconfig
  extends StObject
     with StandardParameters {
  
  /**
    * The operation to retrieve controller configuration for.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var validationToken: js.UndefOr[String] = js.undefined
}
object ParamsResourcePipelinesGetcontrollerconfig {
  
  inline def apply(): ParamsResourcePipelinesGetcontrollerconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePipelinesGetcontrollerconfig]
  }
  
  extension [Self <: ParamsResourcePipelinesGetcontrollerconfig](x: Self) {
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setValidationToken(value: String): Self = StObject.set(x, "validationToken", value.asInstanceOf[js.Any])
    
    inline def setValidationTokenUndefined: Self = StObject.set(x, "validationToken", js.undefined)
  }
}
