package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.channel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelObject
  extends BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_ChannelObject: ChannelCommon = js.native
  
  @JSName("type")
  var type_ChannelObject: channel = js.native
}
object ChannelObject {
  
  @scala.inline
  def apply(_id: String, common: ChannelCommon, native: Record[String, _], `type`: channel): ChannelObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelObject]
  }
  
  @scala.inline
  implicit class ChannelObjectMutableBuilder[Self <: ChannelObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: ChannelCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
