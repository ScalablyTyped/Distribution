package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options for the horizontal pod autoscaling feature, which
  * increases or decreases the number of replica pods a replication controller
  * has based on the resource usage of the existing pods.
  */
trait SchemaHorizontalPodAutoscaling extends StObject {
  
  /**
    * Whether the Horizontal Pod Autoscaling feature is enabled in the cluster.
    * When enabled, it ensures that a Heapster pod is running in the cluster,
    * which is also used by the Cloud Monitoring service.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaHorizontalPodAutoscaling {
  
  inline def apply(): SchemaHorizontalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHorizontalPodAutoscaling]
  }
  
  extension [Self <: SchemaHorizontalPodAutoscaling](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
