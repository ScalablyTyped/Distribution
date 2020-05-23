package typings.lokijs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.lokijs.lokijsStrings.destructured
import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictcollName
  extends /* collName */ StringDictionary[js.Any | Inflate] {
  var retainDirtyFlags: js.UndefOr[Boolean] = js.undefined
  var serializationMethod: js.UndefOr[normal | pretty | destructured | Null] = js.undefined
  var throttledSaves: js.UndefOr[Boolean] = js.undefined
}

object DictcollName {
  @scala.inline
  def apply(
    StringDictionary: /* collName */ StringDictionary[js.Any | Inflate] = null,
    retainDirtyFlags: js.UndefOr[Boolean] = js.undefined,
    serializationMethod: js.UndefOr[Null | normal | pretty | destructured] = js.undefined,
    throttledSaves: js.UndefOr[Boolean] = js.undefined
  ): DictcollName = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(retainDirtyFlags)) __obj.updateDynamic("retainDirtyFlags")(retainDirtyFlags.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serializationMethod)) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(throttledSaves)) __obj.updateDynamic("throttledSaves")(throttledSaves.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictcollName]
  }
}

