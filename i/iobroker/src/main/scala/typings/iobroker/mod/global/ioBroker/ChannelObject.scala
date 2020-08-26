package typings.iobroker.mod.global.ioBroker

import typings.iobroker.iobrokerStrings.channel
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(_id: String, common: ChannelCommon, native: Record[String, ObjectField], `type`: channel): ChannelObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelObject]
  }
  @scala.inline
  implicit class ChannelObjectOps[Self <: ChannelObject] (val x: Self) extends AnyVal {
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
    def setCommon(value: ChannelCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: channel): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

