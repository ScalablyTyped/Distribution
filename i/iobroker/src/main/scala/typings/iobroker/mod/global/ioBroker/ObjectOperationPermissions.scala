package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: implement
/** Defines access rights for a single object type */
trait ObjectOperationPermissions extends StObject {
  
  /** Whether a user may create objects of this type */
  var create: Boolean
  
  /** Whether a user may delete objects of this type */
  var delete: Boolean
  
  /** Whether a user may enumerate objects of this type */
  var list: Boolean
  
  /** Whether a user may read objects of this type */
  var read: Boolean
  
  /** Whether a user may write objects of this type */
  var write: Boolean
}
object ObjectOperationPermissions {
  
  inline def apply(create: Boolean, delete: Boolean, list: Boolean, read: Boolean, write: Boolean): ObjectOperationPermissions = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectOperationPermissions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectOperationPermissions] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setList(value: Boolean): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
  }
}
