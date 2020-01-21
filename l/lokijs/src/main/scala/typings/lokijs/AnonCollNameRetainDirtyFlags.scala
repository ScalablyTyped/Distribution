package typings.lokijs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollNameRetainDirtyFlags
  extends /* collName */ StringDictionary[js.Any | AnonDest] {
  var retainDirtyFlags: js.UndefOr[Boolean] = js.undefined
  var throttledSaves: js.UndefOr[Boolean] = js.undefined
}

object AnonCollNameRetainDirtyFlags {
  @scala.inline
  def apply(
    StringDictionary: /* collName */ StringDictionary[js.Any | AnonDest] = null,
    retainDirtyFlags: js.UndefOr[Boolean] = js.undefined,
    throttledSaves: js.UndefOr[Boolean] = js.undefined
  ): AnonCollNameRetainDirtyFlags = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(retainDirtyFlags)) __obj.updateDynamic("retainDirtyFlags")(retainDirtyFlags.asInstanceOf[js.Any])
    if (!js.isUndefined(throttledSaves)) __obj.updateDynamic("throttledSaves")(throttledSaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollNameRetainDirtyFlags]
  }
}

