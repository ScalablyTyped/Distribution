package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerInstanceConfig extends js.Object {
  
  /**
    * Fingerprint of this per-instance config. This field can be used in optimistic locking. It is ignored when inserting a per-instance config. An up-to-date fingerprint must be provided
    * in order to update an existing per-instance config or the field needs to be unset.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The name of a per-instance config and its corresponding instance. Serves as a merge key during UpdatePerInstanceConfigs operations, that is, if a per-instance config with the same
    * name exists then it will be updated, otherwise a new one will be created for the VM instance with the same name. An attempt to create a per-instance config for a VM instance that
    * either doesn't exist or is not part of the group will result in an error.
    */
  var name: js.UndefOr[String] = js.native
  
  /** The intended preserved state for the given instance. Does not contain preserved state generated from a stateful policy. */
  var preservedState: js.UndefOr[PreservedState] = js.native
  
  /** The status of applying this per-instance config on the corresponding managed instance. */
  var status: js.UndefOr[String] = js.native
}
object PerInstanceConfig {
  
  @scala.inline
  def apply(): PerInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerInstanceConfig]
  }
  
  @scala.inline
  implicit class PerInstanceConfigOps[Self <: PerInstanceConfig] (val x: Self) extends AnyVal {
    
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPreservedState(value: PreservedState): Self = this.set("preservedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreservedState: Self = this.set("preservedState", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
