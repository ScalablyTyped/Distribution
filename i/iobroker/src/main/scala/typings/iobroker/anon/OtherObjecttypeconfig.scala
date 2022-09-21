package typings.iobroker.anon

import typings.iobroker.iobrokerStrings.chart
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.objectsMod.global.ioBroker.ObjectACL
import typings.iobroker.objectsMod.global.ioBroker.OtherCommon
import typings.iobroker.objectsMod.global.ioBroker._InferGetObjectViewItemType
import typings.iobroker.objectsMod.global.ioBroker._ObjectIdToObjectType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined iobroker.iobroker/objects.<global>.ioBroker.OtherObject & {  type :'config'} */
trait OtherObjecttypeconfig
  extends StObject
     with _InferGetObjectViewItemType[Any, Any]
     with _ObjectIdToObjectType[Any, Any] {
  
  /** The ID of this object */
  var _id: String
  
  var acl: js.UndefOr[ObjectACL] = js.undefined
  
  var common: OtherCommon
  
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  // specified in the derived interfaces
  // Ideally we would limit this to JSON-serializable objects, but TypeScript doesn't allow this
  // without bugging users to change their code --> https://github.com/microsoft/TypeScript/issues/15300
  var native: Record[String, Any]
  
  var ts: js.UndefOr[Double] = js.undefined
  
  var `type`: (config | chart) & config
  
  /** The user who created or updated this object */
  var user: js.UndefOr[String] = js.undefined
}
object OtherObjecttypeconfig {
  
  inline def apply(_id: String, common: OtherCommon, native: Record[String, Any], `type`: (config | chart) & config): OtherObjecttypeconfig = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherObjecttypeconfig]
  }
  
  extension [Self <: OtherObjecttypeconfig](x: Self) {
    
    inline def setAcl(value: ObjectACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setCommon(value: OtherCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setEnums(value: Record[String, String]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    inline def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setNative(value: Record[String, Any]): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setType(value: (config | chart) & config): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
