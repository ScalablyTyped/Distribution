package typings.lokijs.anon

import typings.lokijs.lokijsStrings.`jquery-extend-deep`
import typings.lokijs.lokijsStrings.`parse-stringify`
import typings.lokijs.lokijsStrings.`shallow-assign`
import typings.lokijs.lokijsStrings.`shallow-recurse-objects`
import typings.lokijs.lokijsStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.GetDataOptions> */
trait PartialGetDataOptions extends js.Object {
  var forceCloneMethod: js.UndefOr[
    `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects`
  ] = js.undefined
  var forceClones: js.UndefOr[Boolean] = js.undefined
  var removeMeta: js.UndefOr[Boolean] = js.undefined
}

object PartialGetDataOptions {
  @scala.inline
  def apply(
    forceCloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` = null,
    forceClones: js.UndefOr[Boolean] = js.undefined,
    removeMeta: js.UndefOr[Boolean] = js.undefined
  ): PartialGetDataOptions = {
    val __obj = js.Dynamic.literal()
    if (forceCloneMethod != null) __obj.updateDynamic("forceCloneMethod")(forceCloneMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(forceClones)) __obj.updateDynamic("forceClones")(forceClones.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeMeta)) __obj.updateDynamic("removeMeta")(removeMeta.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGetDataOptions]
  }
}

