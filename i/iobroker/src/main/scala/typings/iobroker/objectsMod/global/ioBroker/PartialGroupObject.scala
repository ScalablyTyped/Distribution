package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.PartialGroupCommon
import typings.iobroker.iobrokerStrings.group
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Omit<iobroker.iobroker/objects.<global>.ioBroker.GroupObject, 'common'>> */
trait PartialGroupObject
  extends StObject
     with AnyPartialObject {
  
  var _id: js.UndefOr[String] = js.undefined
  
  var acl: js.UndefOr[ObjectACL] = js.undefined
  
  var common: js.UndefOr[PartialGroupCommon] = js.undefined
  
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var native: js.UndefOr[Record[String, Any]] = js.undefined
  
  var ts: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[group] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object PartialGroupObject {
  
  inline def apply(): PartialGroupObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGroupObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialGroupObject] (val x: Self) extends AnyVal {
    
    inline def setAcl(value: ObjectACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setCommon(value: PartialGroupCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setEnums(value: Record[String, String]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    inline def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setNative(value: Record[String, Any]): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setType(value: group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
