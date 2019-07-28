package typings.lokijs

import org.scalablytyped.runtime.StringDictionary
import typings.lokijs.lokijsStrings.destructured
import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollName
  extends /* collName */ StringDictionary[js.Any | Anon_Dest] {
  var retainDirtyFlags: js.UndefOr[Boolean] = js.undefined
  var serializationMethod: js.UndefOr[normal | pretty | destructured | Null] = js.undefined
  var throttledSaves: js.UndefOr[Boolean] = js.undefined
}

object Anon_CollName {
  @scala.inline
  def apply(
    StringDictionary: /* collName */ StringDictionary[js.Any | Anon_Dest] = null,
    retainDirtyFlags: js.UndefOr[Boolean] = js.undefined,
    serializationMethod: normal | pretty | destructured = null,
    throttledSaves: js.UndefOr[Boolean] = js.undefined
  ): Anon_CollName = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(retainDirtyFlags)) __obj.updateDynamic("retainDirtyFlags")(retainDirtyFlags)
    if (serializationMethod != null) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(throttledSaves)) __obj.updateDynamic("throttledSaves")(throttledSaves)
    __obj.asInstanceOf[Anon_CollName]
  }
}

