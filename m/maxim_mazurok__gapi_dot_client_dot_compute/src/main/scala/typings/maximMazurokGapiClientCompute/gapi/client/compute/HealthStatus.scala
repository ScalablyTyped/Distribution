package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthStatus extends js.Object {
  
  /** Metadata defined as annotations for network endpoint. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.HealthStatus with TopLevel[js.Any]
  ] = js.native
  
  /** Health state of the instance. */
  var healthState: js.UndefOr[String] = js.native
  
  /** URL of the instance resource. */
  var instance: js.UndefOr[String] = js.native
  
  /** A forwarding rule IP address assigned to this instance. */
  var ipAddress: js.UndefOr[String] = js.native
  
  /** The named port of the instance group, not necessarily the port that is health-checked. */
  var port: js.UndefOr[Double] = js.native
}
object HealthStatus {
  
  @scala.inline
  def apply(): HealthStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthStatus]
  }
  
  @scala.inline
  implicit class HealthStatusOps[Self <: HealthStatus] (val x: Self) extends AnyVal {
    
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
    def setAnnotations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.HealthStatus with TopLevel[js.Any]
    ): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setHealthState(value: String): Self = this.set("healthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthState: Self = this.set("healthState", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
