package typings.iobroker.objectsMod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines access rights for a single object */
@js.native
trait ObjectACL extends StObject {
  
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
  implicit class ObjectACLMutableBuilder[Self <: ObjectACL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerGroup(value: String): Self = StObject.set(x, "ownerGroup", value.asInstanceOf[js.Any])
  }
}
