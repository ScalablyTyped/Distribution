package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.execute
import typings.iobroker.iobrokerStrings.http
import typings.iobroker.iobrokerStrings.other
import typings.iobroker.iobrokerStrings.sendto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherPermission
  extends StObject
     with Permission {
  
  @JSName("operation")
  var operation_OtherPermission: execute | http | sendto
  
  @JSName("type")
  var type_OtherPermission: other
}
object OtherPermission {
  
  @scala.inline
  def apply(operation: execute | http | sendto): OtherPermission = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("other")
    __obj.asInstanceOf[OtherPermission]
  }
  
  @scala.inline
  implicit class OtherPermissionMutableBuilder[Self <: OtherPermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperation(value: execute | http | sendto): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
