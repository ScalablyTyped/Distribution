package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KubernetesDashboard extends StObject {
  
  /** Whether the Kubernetes Dashboard is enabled for this cluster. */
  var disabled: js.UndefOr[Boolean] = js.native
}
object KubernetesDashboard {
  
  @scala.inline
  def apply(): KubernetesDashboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesDashboard]
  }
  
  @scala.inline
  implicit class KubernetesDashboardMutableBuilder[Self <: KubernetesDashboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
