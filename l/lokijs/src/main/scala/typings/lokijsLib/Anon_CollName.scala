package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollName
  extends /* collName */ org.scalablytyped.runtime.StringDictionary[js.Any | Anon_Dest] {
  var retainDirtyFlags: js.UndefOr[scala.Boolean] = js.undefined
  var serializationMethod: js.UndefOr[
    lokijsLib.lokijsLibStrings.normal | lokijsLib.lokijsLibStrings.pretty | lokijsLib.lokijsLibStrings.destructured | scala.Null
  ] = js.undefined
  var throttledSaves: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CollName {
  @scala.inline
  def apply(
    StringDictionary: /* collName */ org.scalablytyped.runtime.StringDictionary[js.Any | Anon_Dest] = null,
    retainDirtyFlags: js.UndefOr[scala.Boolean] = js.undefined,
    serializationMethod: lokijsLib.lokijsLibStrings.normal | lokijsLib.lokijsLibStrings.pretty | lokijsLib.lokijsLibStrings.destructured = null,
    throttledSaves: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CollName = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(retainDirtyFlags)) __obj.updateDynamic("retainDirtyFlags")(retainDirtyFlags)
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(throttledSaves)) __obj.updateDynamic("throttledSaves")(throttledSaves)
    __obj.asInstanceOf[Anon_CollName]
  }
}

