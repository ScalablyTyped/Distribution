package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalPodAutoscaling extends StObject {
  
  /** Whether the Horizontal Pod Autoscaling feature is enabled in the cluster. When enabled, it ensures that metrics are collected into Stackdriver Monitoring. */
  var disabled: js.UndefOr[Boolean] = js.undefined
}
object HorizontalPodAutoscaling {
  
  @scala.inline
  def apply(): HorizontalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalPodAutoscaling]
  }
  
  @scala.inline
  implicit class HorizontalPodAutoscalingMutableBuilder[Self <: HorizontalPodAutoscaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
