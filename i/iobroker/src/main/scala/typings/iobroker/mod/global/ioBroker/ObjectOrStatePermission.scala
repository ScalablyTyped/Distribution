package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.`object`
import typings.iobroker.iobrokerStrings.create
import typings.iobroker.iobrokerStrings.delete
import typings.iobroker.iobrokerStrings.file
import typings.iobroker.iobrokerStrings.list
import typings.iobroker.iobrokerStrings.read
import typings.iobroker.iobrokerStrings.state
import typings.iobroker.iobrokerStrings.users
import typings.iobroker.iobrokerStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectOrStatePermission
  extends StObject
     with Permission {
  
  @JSName("operation")
  var operation_ObjectOrStatePermission: list | read | write | create | delete
  
  @JSName("type")
  var type_ObjectOrStatePermission: `object` | file | users | state
}
object ObjectOrStatePermission {
  
  @scala.inline
  def apply(operation: list | read | write | create | delete, `type`: `object` | file | users | state): ObjectOrStatePermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOrStatePermission]
  }
  
  @scala.inline
  implicit class ObjectOrStatePermissionMutableBuilder[Self <: ObjectOrStatePermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: list | read | write | create | delete): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `object` | file | users | state): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
