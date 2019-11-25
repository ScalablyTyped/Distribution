package typings.lokijs

import typings.lokijs.lokijsStrings.`jquery-extend-deep`
import typings.lokijs.lokijsStrings.`parse-stringify`
import typings.lokijs.lokijsStrings.`shallow-assign`
import typings.lokijs.lokijsStrings.`shallow-recurse-objects`
import typings.lokijs.lokijsStrings.shallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataOptions extends js.Object {
  var forceCloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` | Null
  var forceClones: Boolean
  var removeMeta: Boolean
}

object GetDataOptions {
  @scala.inline
  def apply(
    forceClones: Boolean,
    removeMeta: Boolean,
    forceCloneMethod: `parse-stringify` | `jquery-extend-deep` | shallow | `shallow-assign` | `shallow-recurse-objects` = null
  ): GetDataOptions = {
    val __obj = js.Dynamic.literal(forceClones = forceClones.asInstanceOf[js.Any], removeMeta = removeMeta.asInstanceOf[js.Any])
    if (forceCloneMethod != null) __obj.updateDynamic("forceCloneMethod")(forceCloneMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataOptions]
  }
}

