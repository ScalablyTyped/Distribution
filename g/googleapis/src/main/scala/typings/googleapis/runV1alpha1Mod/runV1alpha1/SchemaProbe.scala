package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Probe describes a health check to be performed against a container to
  * determine whether it is alive or ready to receive traffic.
  */
trait SchemaProbe extends StObject {
  
  /**
    * Minimum consecutive failures for the probe to be considered failed after
    * having succeeded. Defaults to 3. Minimum value is 1. +optional
    */
  var failureThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * The action taken to determine the health of a container
    */
  var handler: js.UndefOr[SchemaHandler] = js.undefined
  
  /**
    * Number of seconds after the container has started before liveness probes
    * are initiated. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var initialDelaySeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * How often (in seconds) to perform the probe. Default to 10 seconds.
    * Minimum value is 1. +optional
    */
  var periodSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum consecutive successes for the probe to be considered successful
    * after having failed. Defaults to 1. Must be 1 for liveness. Minimum value
    * is 1. +optional
    */
  var successThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of seconds after which the probe times out. Defaults to 1 second.
    * Minimum value is 1. More info:
    * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
    * +optional
    */
  var timeoutSeconds: js.UndefOr[Double] = js.undefined
}
object SchemaProbe {
  
  inline def apply(): SchemaProbe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProbe]
  }
  
  extension [Self <: SchemaProbe](x: Self) {
    
    inline def setFailureThreshold(value: Double): Self = StObject.set(x, "failureThreshold", value.asInstanceOf[js.Any])
    
    inline def setFailureThresholdUndefined: Self = StObject.set(x, "failureThreshold", js.undefined)
    
    inline def setHandler(value: SchemaHandler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setInitialDelaySeconds(value: Double): Self = StObject.set(x, "initialDelaySeconds", value.asInstanceOf[js.Any])
    
    inline def setInitialDelaySecondsUndefined: Self = StObject.set(x, "initialDelaySeconds", js.undefined)
    
    inline def setPeriodSeconds(value: Double): Self = StObject.set(x, "periodSeconds", value.asInstanceOf[js.Any])
    
    inline def setPeriodSecondsUndefined: Self = StObject.set(x, "periodSeconds", js.undefined)
    
    inline def setSuccessThreshold(value: Double): Self = StObject.set(x, "successThreshold", value.asInstanceOf[js.Any])
    
    inline def setSuccessThresholdUndefined: Self = StObject.set(x, "successThreshold", js.undefined)
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecondsUndefined: Self = StObject.set(x, "timeoutSeconds", js.undefined)
  }
}
