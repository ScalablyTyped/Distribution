package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.meta
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_MetaObject: MetaCommon
  
  @JSName("type")
  var type_MetaObject: meta
}
object MetaObject {
  
  @scala.inline
  def apply(_id: String, common: MetaCommon, native: Record[String, js.Any]): MetaObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("meta")
    __obj.asInstanceOf[MetaObject]
  }
  
  @scala.inline
  implicit class MetaObjectMutableBuilder[Self <: MetaObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: MetaCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: meta): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
