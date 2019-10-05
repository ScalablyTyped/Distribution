package typings.iobroker.iobrokerMod.Global.ioBroker

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<iobroker.iobroker.Global.ioBroker.StateObject, '_id' | 'native' | 'enums' | 'type'> ]:? std.Pick<iobroker.iobroker.Global.ioBroker.StateObject, '_id' | 'native' | 'enums' | 'type'>[P]} */ trait PartialStateObject extends PartialObject {
  var acl: js.UndefOr[Partial[StateACL]] = js.undefined
  var common: js.UndefOr[Partial[StateCommon]] = js.undefined
}

object PartialStateObject {
  @scala.inline
  def apply(acl: Partial[StateACL] = null, common: Partial[StateCommon] = null): PartialStateObject = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl)
    if (common != null) __obj.updateDynamic("common")(common)
    __obj.asInstanceOf[PartialStateObject]
  }
}

