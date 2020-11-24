package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedInstanceVersion extends js.Object {
  
  /** [Output Only] The intended template of the instance. This field is empty when current_action is one of { DELETING, ABANDONING }. */
  var instanceTemplate: js.UndefOr[String] = js.native
  
  /** [Output Only] Name of the version. */
  var name: js.UndefOr[String] = js.native
}
object ManagedInstanceVersion {
  
  @scala.inline
  def apply(): ManagedInstanceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedInstanceVersion]
  }
  
  @scala.inline
  implicit class ManagedInstanceVersionOps[Self <: ManagedInstanceVersion] (val x: Self) extends AnyVal {
    
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
    def setInstanceTemplate(value: String): Self = this.set("instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTemplate: Self = this.set("instanceTemplate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
