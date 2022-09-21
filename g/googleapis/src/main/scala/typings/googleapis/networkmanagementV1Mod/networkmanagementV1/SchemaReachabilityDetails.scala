package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReachabilityDetails extends StObject {
  
  /**
    * The details of a failure or a cancellation of reachability analysis.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * The overall result of the test's configuration analysis.
    */
  var result: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends.
    */
  var traces: js.UndefOr[js.Array[SchemaTrace]] = js.undefined
  
  /**
    * The time of the configuration analysis.
    */
  var verifyTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaReachabilityDetails {
  
  inline def apply(): SchemaReachabilityDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReachabilityDetails]
  }
  
  extension [Self <: SchemaReachabilityDetails](x: Self) {
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setTraces(value: js.Array[SchemaTrace]): Self = StObject.set(x, "traces", value.asInstanceOf[js.Any])
    
    inline def setTracesUndefined: Self = StObject.set(x, "traces", js.undefined)
    
    inline def setTracesVarargs(value: SchemaTrace*): Self = StObject.set(x, "traces", js.Array(value*))
    
    inline def setVerifyTime(value: String): Self = StObject.set(x, "verifyTime", value.asInstanceOf[js.Any])
    
    inline def setVerifyTimeNull: Self = StObject.set(x, "verifyTime", null)
    
    inline def setVerifyTimeUndefined: Self = StObject.set(x, "verifyTime", js.undefined)
  }
}
