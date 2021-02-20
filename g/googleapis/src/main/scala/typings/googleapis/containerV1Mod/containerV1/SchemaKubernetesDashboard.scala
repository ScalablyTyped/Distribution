package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for the Kubernetes Dashboard.
  */
@js.native
trait SchemaKubernetesDashboard extends StObject {
  
  /**
    * Whether the Kubernetes Dashboard is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean] = js.native
}
object SchemaKubernetesDashboard {
  
  @scala.inline
  def apply(): SchemaKubernetesDashboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKubernetesDashboard]
  }
  
  @scala.inline
  implicit class SchemaKubernetesDashboardMutableBuilder[Self <: SchemaKubernetesDashboard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
