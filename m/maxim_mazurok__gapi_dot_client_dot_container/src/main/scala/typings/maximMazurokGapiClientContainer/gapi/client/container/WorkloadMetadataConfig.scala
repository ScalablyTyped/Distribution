package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkloadMetadataConfig extends js.Object {
  
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
  implicit class WorkloadMetadataConfigOps[Self <: WorkloadMetadataConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
