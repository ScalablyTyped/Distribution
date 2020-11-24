package typings.iobroker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.StateACL> */
@js.native
trait PartialStateACL extends js.Object {
  
  var `object`: js.UndefOr[Double] = js.native
  
  var owner: js.UndefOr[String] = js.native
  
  var ownerGroup: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[Double] = js.native
}
object PartialStateACL {
  
  @scala.inline
  def apply(): PartialStateACL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStateACL]
  }
  
  @scala.inline
  implicit class PartialStateACLOps[Self <: PartialStateACL] (val x: Self) extends AnyVal {
    
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
    def setObject(value: Double): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setOwnerGroup(value: String): Self = this.set("ownerGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerGroup: Self = this.set("ownerGroup", js.undefined)
    
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
