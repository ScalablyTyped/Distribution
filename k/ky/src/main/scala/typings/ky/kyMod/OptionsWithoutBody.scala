package typings.ky.kyMod

import typings.ky.kyStrings.get
import typings.ky.kyStrings.head
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ky.ky.Options, 'body'> ]: ky.ky.Options[P]} */ trait OptionsWithoutBody extends js.Object {
  var method: js.UndefOr[get | head] = js.undefined
}

object OptionsWithoutBody {
  @scala.inline
  def apply(method: get | head = null): OptionsWithoutBody = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithoutBody]
  }
}

