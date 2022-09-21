package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProbe extends StObject {
  
  /**
    * (Optional) Not supported by Cloud Run One and only one of the following should be specified. Exec specifies the action to take. A field inlined from the Handler message.
    */
  var exec: js.UndefOr[SchemaExecAction] = js.undefined
  
  /**
    * (Optional) Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
    */
  var failureThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Optional) GRPCAction specifies an action involving a GRPC port. A field inlined from the Handler message.
    */
  var grpc: js.UndefOr[SchemaGRPCAction] = js.undefined
  
  /**
    * (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler message.
    */
  var httpGet: js.UndefOr[SchemaHTTPGetAction] = js.undefined
  
  /**
    * (Optional) Number of seconds after the container has started before the probe is initiated. Defaults to 0 seconds. Minimum value is 0. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var initialDelaySeconds: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. Must be greater or equal than timeout_seconds.
    */
  var periodSeconds: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Optional) Minimum consecutive successes for the probe to be considered successful after having failed. Must be 1 if set.
    */
  var successThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined from the Handler message.
    */
  var tcpSocket: js.UndefOr[SchemaTCPSocketAction] = js.undefined
  
  /**
    * (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 3600. Must be smaller than period_seconds. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    */
  var timeoutSeconds: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProbe {
  
  inline def apply(): SchemaProbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProbe]
  }
  
  extension [Self <: SchemaProbe](x: Self) {
    
    inline def setExec(value: SchemaExecAction): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    inline def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    inline def setFailureThresholdNull: Self = StObject.set(x, "failureThreshold", null)
    
    inline def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    
    inline def setGrpc(value: SchemaGRPCAction): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    
    inline def setGrpcUndefined: Self = StObject.set(x, "grpc", js.undefined)
    
    inline def setHttpGet(value: SchemaHTTPGetAction): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    inline def setHttpGetUndefined: Self = StObject.set(x, "httpGet", js.undefined)
    
    inline def setInitialDelaySeconds(value: Double): Self = StObject.set(x, "initialDelaySeconds", value.asInstanceOf[js.Any])
    
    inline def setInitialDelaySecondsNull: Self = StObject.set(x, "initialDelaySeconds", null)
    
    inline def setInitialDelaySecondsUndefined: Self = StObject.set(x, "initialDelaySeconds", js.undefined)
    
    inline def setPeriodSeconds(value: Double): Self = StObject.set(x, "periodSeconds", value.asInstanceOf[js.Any])
    
    inline def setPeriodSecondsNull: Self = StObject.set(x, "periodSeconds", null)
    
    inline def setPeriodSecondsUndefined: Self = StObject.set(x, "periodSeconds", js.undefined)
    
    inline def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    inline def setSuccessThresholdNull: Self = StObject.set(x, "successThreshold", null)
    
    inline def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
    
    inline def setTcpSocket(value: SchemaTCPSocketAction): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
    
    inline def setTcpSocketUndefined: Self = StObject.set(x, "tcpSocket", js.undefined)
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsNull: Self = StObject.set(x, "timeoutSeconds", null)
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
