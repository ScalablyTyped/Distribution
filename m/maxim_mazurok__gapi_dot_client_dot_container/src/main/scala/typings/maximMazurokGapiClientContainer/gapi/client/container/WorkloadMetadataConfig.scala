package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkloadMetadataConfig extends StObject {
  
  /** Mode is the configuration for how to expose metadata to workloads running on the node pool. */
  var mode: js.UndefOr[String] = js.native
}
object WorkloadMetadataConfig {
  
  @scala.inline
  def apply(): WorkloadMetadataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadMetadataConfig]
  }
  
  @scala.inline
  implicit class WorkloadMetadataConfigMutableBuilder[Self <: WorkloadMetadataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
