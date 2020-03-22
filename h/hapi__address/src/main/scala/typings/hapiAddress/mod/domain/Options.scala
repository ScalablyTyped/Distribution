package typings.hapiAddress.mod.domain

import typings.hapiAddress.mod.domain.Tlds.Allow
import typings.hapiAddress.mod.domain.Tlds.Deny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Determines whether Unicode characters are allowed.
    * 
    * @default true
    */
  val allowUnicode: js.UndefOr[Boolean] = js.undefined
  /**
    * The minimum number of domain segments (e.g. `x.y.z` has 3 segments) required.
    * 
    * @default 2
    */
  val minDomainSegments: js.UndefOr[Double] = js.undefined
  /**
    * Top-level-domain options
    * 
    * @default true
    */
  val tlds: js.UndefOr[Allow | Deny | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowUnicode: js.UndefOr[Boolean] = js.undefined,
    minDomainSegments: Int | Double = null,
    tlds: Allow | Deny | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnicode)) __obj.updateDynamic("allowUnicode")(allowUnicode.asInstanceOf[js.Any])
    if (minDomainSegments != null) __obj.updateDynamic("minDomainSegments")(minDomainSegments.asInstanceOf[js.Any])
    if (tlds != null) __obj.updateDynamic("tlds")(tlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

