package typings.iobroker.iobrokerMod._Global_.ioBroker

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<iobroker.iobroker._Global_.ioBroker.OtherObject, '_id' | 'native' | 'enums' | 'type' | 'acl'> ]:? std.Pick<iobroker.iobroker._Global_.ioBroker.OtherObject, '_id' | 'native' | 'enums' | 'type' | 'acl'>[P]} */ trait PartialOtherObject extends PartialObject {
  var common: js.UndefOr[Partial[ObjectCommon]] = js.undefined
}

object PartialOtherObject {
  @scala.inline
  def apply(common: Partial[ObjectCommon] = null): PartialOtherObject = {
    val __obj = js.Dynamic.literal()
    if (common != null) __obj.updateDynamic("common")(common)
    __obj.asInstanceOf[PartialOtherObject]
  }
}

