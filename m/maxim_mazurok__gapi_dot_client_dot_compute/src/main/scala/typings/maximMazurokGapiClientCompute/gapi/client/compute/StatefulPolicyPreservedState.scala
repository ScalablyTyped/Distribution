package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatefulPolicyPreservedState extends js.Object {
  
  /** Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks. */
  var disks: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.StatefulPolicyPreservedStateDiskDevice}
    */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.StatefulPolicyPreservedState with TopLevel[js.Any]
  ] = js.native
}
object StatefulPolicyPreservedState {
  
  @scala.inline
  def apply(): StatefulPolicyPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPolicyPreservedState]
  }
  
  @scala.inline
  implicit class StatefulPolicyPreservedStateOps[Self <: StatefulPolicyPreservedState] (val x: Self) extends AnyVal {
    
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
    def setDisks(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.StatefulPolicyPreservedStateDiskDevice}
      */ typings.maximMazurokGapiClientCompute.maximMazurokGapiClientComputeStrings.StatefulPolicyPreservedState with TopLevel[js.Any]
    ): Self = this.set("disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
  }
}
