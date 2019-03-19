package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollNameRetainDirtyFlags
  extends /* collName */ org.scalablytyped.runtime.StringDictionary[js.Any | Anon_Dest] {
  var retainDirtyFlags: js.UndefOr[scala.Boolean] = js.undefined
  var throttledSaves: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CollNameRetainDirtyFlags {
  @scala.inline
  def apply(
    StringDictionary: /* collName */ org.scalablytyped.runtime.StringDictionary[js.Any | Anon_Dest] = null,
    retainDirtyFlags: js.UndefOr[scala.Boolean] = js.undefined,
    throttledSaves: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CollNameRetainDirtyFlags = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(retainDirtyFlags)) __obj.updateDynamic("retainDirtyFlags")(retainDirtyFlags)
    if (!js.isUndefined(throttledSaves)) __obj.updateDynamic("throttledSaves")(throttledSaves)
    __obj.asInstanceOf[Anon_CollNameRetainDirtyFlags]
  }
}

