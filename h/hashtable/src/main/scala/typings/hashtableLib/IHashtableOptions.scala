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

