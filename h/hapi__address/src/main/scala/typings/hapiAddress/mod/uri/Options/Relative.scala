package typings.hapiAddress.mod.uri.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Relative extends Query {
  /**
    * Requires the URI to be relative.
    * 
    * @default false
    */
  val relativeOnly: js.UndefOr[Boolean] = js.undefined
}

object Relative {
  @scala.inline
  def apply(
    allowQuerySquareBrackets: js.UndefOr[Boolean] = js.undefined,
    relativeOnly: js.UndefOr[Boolean] = js.undefined
  ): Relative = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowQuerySquareBrackets)) __obj.updateDynamic("allowQuerySquareBrackets")(allowQuerySquareBrackets.asInstanceOf[js.Any])
    if (!js.isUndefined(relativeOnly)) __obj.updateDynamic("relativeOnly")(relativeOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Relative]
  }
}

