package typings.lokijs

import org.scalablytyped.runtime.StringDictionary
import typings.lokijs.lokijsStrings.destructured
import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictcollName
  extends /* collName */ StringDictionary[js.Any | AnonInflate] {
  var retainDirtyFlags: js.UndefOr[Boolean] = js.undefined
  var serializationMethod: js.UndefOr[normal | pretty | destructured | Null] = js.undefined
  var throttledSaves: js.UndefOr[Boolean] = js.undefined
}

object AnonDictcollName {
  @scala.inline
  def apply(
    StringDictionary: /* collName */ StringDictionary[js.Any | AnonInflate] = null,
    retainDirtyFlags: js.UndefOr[Boolean] = js.undefined,
    serializationMethod: normal | pretty | destructured = null,
    throttledSaves: js.UndefOr[Boolean] = js.undefined
  ): AnonDictcollName = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(retainDirtyFlags)) __obj.updateDynamic("retainDirtyFlags")(retainDirtyFlags.asInstanceOf[js.Any])
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(throttledSaves)) __obj.updateDynamic("throttledSaves")(throttledSaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictcollName]
  }
}

