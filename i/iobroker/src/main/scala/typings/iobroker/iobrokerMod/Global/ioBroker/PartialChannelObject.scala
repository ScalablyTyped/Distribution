package typings.iobroker.iobrokerMod.Global.ioBroker

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.ChannelObject, '_id' | 'native' | 'enums' | 'type' | 'acl'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.ChannelObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>[P]} */ trait PartialChannelObject extends PartialObject {
  var common: js.UndefOr[Partial[ChannelCommon]] = js.undefined
}

object PartialChannelObject {
  @scala.inline
  def apply(common: Partial[ChannelCommon] = null): PartialChannelObject = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common)
    __obj.asInstanceOf[PartialChannelObject]
  }
}

