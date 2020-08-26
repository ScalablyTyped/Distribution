package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherCommon
  extends ObjectCommon
     with /* propName */ StringDictionary[js.UndefOr[ObjectField]] {
  // Only states can have common.custom
  var custom: js.UndefOr[scala.Nothing] = js.native
}

object OtherCommon {
  @scala.inline
  def apply(name: String): OtherCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCommon]
  }
}

