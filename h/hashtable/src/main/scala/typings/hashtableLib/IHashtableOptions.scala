package typings
package hashtableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashtableOptions[TKey] extends js.Object {
  @JSName("equals")
  var equals_FIHashtableOptions: js.UndefOr[js.Function2[/* key1 */ TKey, /* key2 */ TKey, scala.Boolean]] = js.undefined
  @JSName("hashCode")
  var hashCode_FIHashtableOptions: js.UndefOr[js.Function1[/* key */ TKey, _]] = js.undefined
  var replaceDuplicateKey: js.UndefOr[scala.Boolean] = js.undefined
}

object IHashtableOptions {
  @scala.inline
  def apply[TKey](
    equals: js.Function2[/* key1 */ TKey, /* key2 */ TKey, scala.Boolean] = null,
    hashCode: js.Function1[/* key */ TKey, _] = null,
    replaceDuplicateKey: js.UndefOr[scala.Boolean] = js.undefined
  ): IHashtableOptions[TKey] = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(equals)
    if (hashCode != null) __obj.updateDynamic("hashCode")(hashCode)
    if (!js.isUndefined(replaceDuplicateKey)) __obj.updateDynamic("replaceDuplicateKey")(replaceDuplicateKey)
    __obj.asInstanceOf[IHashtableOptions[TKey]]
  }
}

