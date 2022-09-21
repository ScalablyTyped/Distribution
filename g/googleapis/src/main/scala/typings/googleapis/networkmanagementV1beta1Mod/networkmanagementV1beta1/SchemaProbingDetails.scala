package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProbingDetails extends StObject {
  
  /**
    * The reason probing was aborted.
    */
  var abortCause: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The EdgeLocation from which a packet destined for/originating from the internet will egress/ingress the Google network. This will only be populated for a connectivity test which has an internet destination/source address. The absence of this field *must not* be used as an indication that the destination/source is part of the Google network.
    */
  var destinationEgressLocation: js.UndefOr[SchemaEdgeLocation] = js.undefined
  
  /**
    * The source and destination endpoints derived from the test input and used for active probing.
    */
  var endpointInfo: js.UndefOr[SchemaEndpointInfo] = js.undefined
  
  /**
    * Details about an internal failure or the cancellation of active probing.
    */
  var error: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Latency as measured by active probing in one direction: from the source to the destination endpoint.
    */
  var probingLatency: js.UndefOr[SchemaLatencyDistribution] = js.undefined
  
  /**
    * The overall result of active probing.
    */
  var result: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of probes sent.
    */
  var sentProbeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of probes that reached the destination.
    */
  var successfulProbeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The time that reachability was assessed through active probing.
    */
  var verifyTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaProbingDetails {
  
  inline def apply(): SchemaProbingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProbingDetails]
  }
  
  extension [Self <: SchemaProbingDetails](x: Self) {
    
    inline def setAbortCause(value: String): Self = StObject.set(x, "abortCause", value.asInstanceOf[js.Any])
    
    inline def setAbortCauseNull: Self = StObject.set(x, "abortCause", null)
    
    inline def setAbortCauseUndefined: Self = StObject.set(x, "abortCause", js.undefined)
    
    inline def setDestinationEgressLocation(value: SchemaEdgeLocation): Self = StObject.set(x, "destinationEgressLocation", value.asInstanceOf[js.Any])
    
    inline def setDestinationEgressLocationUndefined: Self = StObject.set(x, "destinationEgressLocation", js.undefined)
    
    inline def setEndpointInfo(value: SchemaEndpointInfo): Self = StObject.set(x, "endpointInfo", value.asInstanceOf[js.Any])
    
    inline def setEndpointInfoUndefined: Self = StObject.set(x, "endpointInfo", js.undefined)
    
    inline def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setProbingLatency(value: SchemaLatencyDistribution): Self = StObject.set(x, "probingLatency", value.asInstanceOf[js.Any])
    
    inline def setProbingLatencyUndefined: Self = StObject.set(x, "probingLatency", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setSentProbeCount(value: Double): Self = StObject.set(x, "sentProbeCount", value.asInstanceOf[js.Any])
    
    inline def setSentProbeCountNull: Self = StObject.set(x, "sentProbeCount", null)
    
    inline def setSentProbeCountUndefined: Self = StObject.set(x, "sentProbeCount", js.undefined)
    
    inline def setSuccessfulProbeCount(value: Double): Self = StObject.set(x, "successfulProbeCount", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulProbeCountNull: Self = StObject.set(x, "successfulProbeCount", null)
    
    inline def setSuccessfulProbeCountUndefined: Self = StObject.set(x, "successfulProbeCount", js.undefined)
    
    inline def setVerifyTime(value: String): Self = StObject.set(x, "verifyTime", value.asInstanceOf[js.Any])
    
    inline def setVerifyTimeNull: Self = StObject.set(x, "verifyTime", null)
    
    inline def setVerifyTimeUndefined: Self = StObject.set(x, "verifyTime", js.undefined)
  }
}
