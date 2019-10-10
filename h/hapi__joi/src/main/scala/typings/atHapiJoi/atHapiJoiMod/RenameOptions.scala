package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameOptions extends js.Object {
  /**
    * if true, does not delete the old key name, keeping both the new and old keys in place.
    *
    * @default false
    */
  var alias: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, skip renaming of a key if it's undefined.
    *
    * @default false
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, allows renaming multiple keys to the same destination where the last rename wins.
    *
    * @default false
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * if true, allows renaming a key over an existing key.
    *
    * @default false
    */
  var `override`: js.UndefOr[Boolean] = js.undefined
}

object RenameOptions {
  @scala.inline
  def apply(
    alias: js.UndefOr[Boolean] = js.undefined,
    ignoreUndefined: js.UndefOr[Boolean] = js.undefined,
    multiple: js.UndefOr[Boolean] = js.undefined,
    `override`: js.UndefOr[Boolean] = js.undefined
  ): RenameOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(ignoreUndefined)) __obj.updateDynamic("ignoreUndefined")(ignoreUndefined)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (!js.isUndefined(`override`)) __obj.updateDynamic("override")(`override`)
    __obj.asInstanceOf[RenameOptions]
  }
}

