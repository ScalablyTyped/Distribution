package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.channel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_ChannelObject: ChannelCommon
  
  @JSName("type")
  var type_ChannelObject: channel
}
object ChannelObject {
  
  inline def apply(_id: String, common: ChannelCommon, native: Record[String, js.Any]): ChannelObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[ChannelObject]
  }
  
  extension [Self <: ChannelObject](x: Self) {
    
    inline def setCommon(value: ChannelCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
