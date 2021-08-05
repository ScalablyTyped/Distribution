package typings.googleapis.serviceusageV1Mod.serviceusageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `BatchEnableServices` method. This response
  * message is assigned to the `response` field of the returned Operation when
  * that operation is done.
  */
trait SchemaBatchEnableServicesResponse extends StObject {
  
  /**
    * If allow_partial_success is true, and one or more services could not be
    * enabled, this field contains the details about each failure.
    */
  var failures: js.UndefOr[js.Array[SchemaEnableFailure]] = js.undefined
  
  /**
    * The new state of the services after enabling.
    */
  var services: js.UndefOr[js.Array[SchemaGoogleApiServiceusageV1Service]] = js.undefined
}
object SchemaBatchEnableServicesResponse {
  
  inline def apply(): SchemaBatchEnableServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchEnableServicesResponse]
  }
  
  extension [Self <: SchemaBatchEnableServicesResponse](x: Self) {
    
    inline def setFailures(value: js.Array[SchemaEnableFailure]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: SchemaEnableFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    inline def setServices(value: js.Array[SchemaGoogleApiServiceusageV1Service]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setServicesVarargs(value: SchemaGoogleApiServiceusageV1Service*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
