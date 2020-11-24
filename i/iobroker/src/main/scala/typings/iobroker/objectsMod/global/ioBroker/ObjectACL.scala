package typings.iobroker.objectsMod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines access rights for a single object */
@js.native
trait ObjectACL extends js.Object {
  
  /** Linux-type permissions defining access to this object */
  var `object`: Double = js.native
  
  /** Full name of the user who owns this object, e.g. "system.user.admin" */
  var owner: String = js.native
  
  /** Full name of the group who owns this object, e.g. "system.group.administrator" */
  var ownerGroup: String = js.native
}
object ObjectACL {
  
  @scala.inline
  def apply(`object`: Double, owner: String, ownerGroup: String): ObjectACL = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerGroup = ownerGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectACL]
  }
  
  @scala.inline
  implicit class ObjectACLOps[Self <: ObjectACL] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerGroup(value: String): Self = this.set("ownerGroup", value.asInstanceOf[js.Any])
  }
}
