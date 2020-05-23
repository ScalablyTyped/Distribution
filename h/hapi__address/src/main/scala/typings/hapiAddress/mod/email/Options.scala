package typings.hapiAddress.mod.email

import typings.hapiAddress.mod.domain.Tlds.Allow
import typings.hapiAddress.mod.domain.Tlds.Deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.hapiAddress.mod.domain.Options {
  /**
    * Determines whether to ignore the standards maximum email length limit.
    * 
    * @default false
    */
  val ignoreLength: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowUnicode: js.UndefOr[Boolean] = js.undefined,
    ignoreLength: js.UndefOr[Boolean] = js.undefined,
    minDomainSegments: js.UndefOr[Double] = js.undefined,
    tlds: Allow | Deny | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnicode)) __obj.updateDynamic("allowUnicode")(allowUnicode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreLength)) __obj.updateDynamic("ignoreLength")(ignoreLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDomainSegments)) __obj.updateDynamic("minDomainSegments")(minDomainSegments.get.asInstanceOf[js.Any])
    if (tlds != null) __obj.updateDynamic("tlds")(tlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

