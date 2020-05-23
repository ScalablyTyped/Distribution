package typings.hapiAddress.mod.uri.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends Query {
  /**
    * Allow relative URIs.
    * 
    * @default false
    */
  val allowRelative: js.UndefOr[Boolean] = js.undefined
  /**
    * Capture domain segment ($1).
    * 
    * @default false
    */
  val domain: js.UndefOr[Boolean] = js.undefined
  /**
    * The allowed URI schemes.
    */
  val scheme: js.UndefOr[Scheme | js.Array[Scheme]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowQuerySquareBrackets: js.UndefOr[Boolean] = js.undefined,
    allowRelative: js.UndefOr[Boolean] = js.undefined,
    domain: js.UndefOr[Boolean] = js.undefined,
    scheme: Scheme | js.Array[Scheme] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowQuerySquareBrackets)) __obj.updateDynamic("allowQuerySquareBrackets")(allowQuerySquareBrackets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRelative)) __obj.updateDynamic("allowRelative")(allowRelative.get.asInstanceOf[js.Any])
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain.get.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

