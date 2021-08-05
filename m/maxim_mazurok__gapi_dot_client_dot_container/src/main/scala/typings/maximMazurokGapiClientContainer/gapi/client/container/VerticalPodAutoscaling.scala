package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerticalPodAutoscaling extends StObject {
  
  /** Enables vertical pod autoscaling. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object VerticalPodAutoscaling {
  
  inline def apply(): VerticalPodAutoscaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalPodAutoscaling]
  }
  
  extension [Self <: VerticalPodAutoscaling](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
