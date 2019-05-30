package typings
package kyLib.kyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof ky.ky.Options, 'body'> ]: ky.ky.Options[P]} */ trait OptionsWithoutBody extends js.Object {
  var method: js.UndefOr[kyLib.kyLibStrings.get | kyLib.kyLibStrings.head] = js.undefined
}

object OptionsWithoutBody {
  @scala.inline
  def apply(method: kyLib.kyLibStrings.get | kyLib.kyLibStrings.head = null): OptionsWithoutBody = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsWithoutBody]
  }
}

