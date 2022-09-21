package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaKubernetesDashboard extends StObject {
  
  /**
    * Whether the Kubernetes Dashboard is enabled for this cluster.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaKubernetesDashboard {
  
  inline def apply(): SchemaKubernetesDashboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKubernetesDashboard]
  }
  
  extension [Self <: SchemaKubernetesDashboard](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
