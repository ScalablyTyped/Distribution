package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.anon.PartialOtherCommon
import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.chart
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.info
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Omit<iobroker.iobroker/objects.<global>.ioBroker.OtherObject, 'common'>> */
@js.native
trait PartialOtherObject extends PartialObject {
  
  var _id: js.UndefOr[String] = js.native
  
  var acl: js.UndefOr[ObjectACL] = js.native
  
  var common: js.UndefOr[PartialOtherCommon] = js.native
  
  var enums: js.UndefOr[Record[String, String]] = js.native
  
  var from: js.UndefOr[String] = js.native
  
  var native: js.UndefOr[Record[String, _]] = js.native
  
  var ts: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[adapter | config | info | chart] = js.native
  
  var user: js.UndefOr[String] = js.native
}
object PartialOtherObject {
  
  @scala.inline
  def apply(): PartialOtherObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOtherObject]
  }
  
  @scala.inline
  implicit class PartialOtherObjectMutableBuilder[Self <: PartialOtherObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: ObjectACL): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setCommon(value: PartialOtherCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
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
    def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
    
    @scala.inline
    def setType(value: adapter | config | info | chart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
