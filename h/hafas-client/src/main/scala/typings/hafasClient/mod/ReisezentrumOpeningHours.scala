package typings.hafasClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReisezentrumOpeningHours extends js.Object {
  var Di: js.UndefOr[String] = js.undefined
  var Do: js.UndefOr[String] = js.undefined
  var Fr: js.UndefOr[String] = js.undefined
  var Mi: js.UndefOr[String] = js.undefined
  var Mo: js.UndefOr[String] = js.undefined
  var Sa: js.UndefOr[String] = js.undefined
  var So: js.UndefOr[String] = js.undefined
}

object ReisezentrumOpeningHours {
  @scala.inline
  def apply(
    Di: String = null,
    Do: String = null,
    Fr: String = null,
    Mi: String = null,
    Mo: String = null,
    Sa: String = null,
    So: String = null
  ): ReisezentrumOpeningHours = {
    val __obj = js.Dynamic.literal()
    if (Di != null) __obj.updateDynamic("Di")(Di.asInstanceOf[js.Any])
    if (Do != null) __obj.updateDynamic("Do")(Do.asInstanceOf[js.Any])
    if (Fr != null) __obj.updateDynamic("Fr")(Fr.asInstanceOf[js.Any])
    if (Mi != null) __obj.updateDynamic("Mi")(Mi.asInstanceOf[js.Any])
    if (Mo != null) __obj.updateDynamic("Mo")(Mo.asInstanceOf[js.Any])
    if (Sa != null) __obj.updateDynamic("Sa")(Sa.asInstanceOf[js.Any])
    if (So != null) __obj.updateDynamic("So")(So.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReisezentrumOpeningHours]
  }
}

