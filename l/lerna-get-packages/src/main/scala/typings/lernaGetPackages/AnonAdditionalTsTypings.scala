package typings.lernaGetPackages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionalTsTypings extends js.Object {
  var additionalTsTypings: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonAdditionalTsTypings {
  @scala.inline
  def apply(additionalTsTypings: js.Array[String] = null): AnonAdditionalTsTypings = {
    val __obj = js.Dynamic.literal()
    if (additionalTsTypings != null) __obj.updateDynamic("additionalTsTypings")(additionalTsTypings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalTsTypings]
  }
}

