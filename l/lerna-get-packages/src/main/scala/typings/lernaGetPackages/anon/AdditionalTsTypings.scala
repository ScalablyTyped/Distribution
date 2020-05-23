package typings.lernaGetPackages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalTsTypings extends js.Object {
  var additionalTsTypings: js.UndefOr[js.Array[String]] = js.undefined
}

object AdditionalTsTypings {
  @scala.inline
  def apply(additionalTsTypings: js.Array[String] = null): AdditionalTsTypings = {
    val __obj = js.Dynamic.literal()
    if (additionalTsTypings != null) __obj.updateDynamic("additionalTsTypings")(additionalTsTypings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalTsTypings]
  }
}

