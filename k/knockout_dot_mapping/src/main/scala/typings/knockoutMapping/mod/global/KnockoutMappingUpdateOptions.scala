package typings.knockoutMapping.mod.global

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutMappingUpdateOptions extends js.Object {
  var data: js.Any
  var observable: js.UndefOr[KnockoutObservable[_]] = js.undefined
  var parent: js.Any
  var target: js.Any
}

object KnockoutMappingUpdateOptions {
  @scala.inline
  def apply(data: js.Any, parent: js.Any, target: js.Any, observable: KnockoutObservable[_] = null): KnockoutMappingUpdateOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (observable != null) __obj.updateDynamic("observable")(observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutMappingUpdateOptions]
  }
}

