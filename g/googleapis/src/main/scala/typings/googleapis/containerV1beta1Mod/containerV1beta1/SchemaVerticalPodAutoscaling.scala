package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VerticalPodAutoscaling contains global, per-cluster information required by
  * Vertical Pod Autoscaler to automatically adjust the resources of pods
  * controlled by it.
  */
trait SchemaVerticalPodAutoscaling extends StObject {
  
  /**
    * Enables vertical pod autoscaling.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaVerticalPodAutoscaling {
  
  @scala.inline
  def apply(): SchemaVerticalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerticalPodAutoscaling]
  }
  
  @scala.inline
  implicit class SchemaVerticalPodAutoscalingMutableBuilder[Self <: SchemaVerticalPodAutoscaling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
