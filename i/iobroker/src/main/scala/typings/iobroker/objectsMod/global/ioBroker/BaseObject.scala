package typings.iobroker.objectsMod.global.ioBroker

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseObject extends js.Object {
  
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
  implicit class BaseObjectOps[Self <: BaseObject] (val x: Self) extends AnyVal {
    
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
    def set_id(value: String): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommon(value: Record[String, _]): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: Record[String, _]): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ObjectType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcl(value: ObjectACL): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    
    @scala.inline
    def setEnums(value: Record[String, String]): Self = this.set("enums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnums: Self = this.set("enums", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setTs(value: Double): Self = this.set("ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTs: Self = this.set("ts", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
