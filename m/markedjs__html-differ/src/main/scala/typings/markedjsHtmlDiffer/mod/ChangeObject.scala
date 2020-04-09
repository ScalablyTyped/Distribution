package typings.markedjsHtmlDiffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeObject extends js.Object {
  /** True if the value was inserted into the new string */
  val added: js.UndefOr[Boolean] = js.undefined
  /** True if the value was removed from the old string */
  val removed: js.UndefOr[Boolean] = js.undefined
  /** Text content */
  val value: js.UndefOr[String] = js.undefined
}

object ChangeObject {
  @scala.inline
  def apply(
    added: js.UndefOr[Boolean] = js.undefined,
    removed: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): ChangeObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(added)) __obj.updateDynamic("added")(added.asInstanceOf[js.Any])
    if (!js.isUndefined(removed)) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeObject]
  }
}

