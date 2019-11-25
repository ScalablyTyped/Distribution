package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapResultTupleOptions
  extends /**
	 * Option for OlapResultTupleOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Optional="false" array of $.ig.OlapResultAxisMember objects which form the tuple object.
  	 */
  var members: js.UndefOr[js.Array[_]] = js.undefined
}

object OlapResultTupleOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapResultTupleOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    members: js.Array[_] = null
  ): OlapResultTupleOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlapResultTupleOptions]
  }
}

