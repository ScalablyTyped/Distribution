package typings.lokijs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetainDirtyFlags
  extends /* collName */ StringDictionary[js.Any | Inflate] {
  var retainDirtyFlags: js.UndefOr[Boolean] = js.undefined
  var throttledSaves: js.UndefOr[Boolean] = js.undefined
}

object RetainDirtyFlags {
  @scala.inline
  def apply(
    StringDictionary: /* collName */ StringDictionary[js.Any | Inflate] = null,
    retainDirtyFlags: js.UndefOr[Boolean] = js.undefined,
    throttledSaves: js.UndefOr[Boolean] = js.undefined
  ): RetainDirtyFlags = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(retainDirtyFlags)) __obj.updateDynamic("retainDirtyFlags")(retainDirtyFlags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttledSaves)) __obj.updateDynamic("throttledSaves")(throttledSaves.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetainDirtyFlags]
  }
}

