package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.PartialAdapterCommon
import typings.iobroker.iobrokerStrings.adapter
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Omit<iobroker.iobroker/objects.<global>.ioBroker.AdapterObject, 'common'>> */
trait PartialAdapterObject
  extends StObject
     with AnyPartialObject {
  
  var _id: js.UndefOr[String] = js.undefined
  
  var acl: js.UndefOr[ObjectACL] = js.undefined
  
  var common: js.UndefOr[PartialAdapterCommon] = js.undefined
  
  var encryptedNative: js.UndefOr[js.Array[String]] = js.undefined
  
  var enums: js.UndefOr[Record[String, String]] = js.undefined
  
  var from: js.UndefOr[String] = js.undefined
  
  var native: js.UndefOr[Record[String, Any]] = js.undefined
  
  var protectedNative: js.UndefOr[js.Array[String]] = js.undefined
  
  var ts: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[adapter] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
}
object PartialAdapterObject {
  
  inline def apply(): PartialAdapterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAdapterObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAdapterObject] (val x: Self) extends AnyVal {
    
    inline def setAcl(value: ObjectACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    inline def setCommon(value: PartialAdapterCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setEncryptedNative(value: js.Array[String]): Self = StObject.set(x, "encryptedNative", value.asInstanceOf[js.Any])
    
    inline def setEncryptedNativeUndefined: Self = StObject.set(x, "encryptedNative", js.undefined)
    
    inline def setEncryptedNativeVarargs(value: String*): Self = StObject.set(x, "encryptedNative", js.Array(value*))
    
    inline def setEnums(value: Record[String, String]): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    inline def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setNative(value: Record[String, Any]): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    inline def setProtectedNative(value: js.Array[String]): Self = StObject.set(x, "protectedNative", value.asInstanceOf[js.Any])
    
    inline def setProtectedNativeUndefined: Self = StObject.set(x, "protectedNative", js.undefined)
    
    inline def setProtectedNativeVarargs(value: String*): Self = StObject.set(x, "protectedNative", js.Array(value*))
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    inline def setType(value: adapter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
