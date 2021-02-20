package typings.iobroker.objectsMod.global.ioBroker

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseObject extends StObject {
  
  /** The ID of this object */
  var _id: String = js.native
  
  var acl: js.UndefOr[ObjectACL] = js.native
  
  var common: Record[String, _] = js.native
  
  var enums: js.UndefOr[Record[String, String]] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  // specified in the derived interfaces
  // Ideally we would limit this to JSON-serializable objects, but TypeScript doesn't allow this
  // without bugging users to change their code --> https://github.com/microsoft/TypeScript/issues/15300
  var native: Record[String, _] = js.native
  
  var ts: js.UndefOr[Double] = js.native
  
  var `type`: ObjectType = js.native
  
  /** The user who created or updated this object */
  var user: js.UndefOr[String] = js.native
}
object BaseObject {
  
  @scala.inline
  def apply(_id: String, common: Record[String, _], native: Record[String, _], `type`: ObjectType): BaseObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseObject]
  }
  
  @scala.inline
  implicit class BaseObjectMutableBuilder[Self <: BaseObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: ObjectACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setCommon(value: Record[String, _]): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnums(value: Record[String, String]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setNative(value: Record[String, _]): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    @scala.inline
    def setType(value: ObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
