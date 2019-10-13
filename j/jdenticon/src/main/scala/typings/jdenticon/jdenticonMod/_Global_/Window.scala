package typings.jdenticon.jdenticonMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  /**
    * Specifies options for generated identicons.
    * 
    * See also {@link jdenticon.config} for Node usage.
    */
  var jdenticon_config: js.UndefOr[JdenticonConfig] = js.undefined
}

object Window {
  @scala.inline
  def apply(jdenticon_config: JdenticonConfig = null): Window = {
    val __obj = js.Dynamic.literal()
    if (jdenticon_config != null) __obj.updateDynamic("jdenticon_config")(jdenticon_config)
    __obj.asInstanceOf[Window]
  }
}

