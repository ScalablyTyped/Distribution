package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceInsertOptions extends js.Object {
  var deepInsert: js.UndefOr[scala.Boolean] = js.undefined
  var onConflictIgnore: js.UndefOr[scala.Boolean] = js.undefined
}

object PersistenceInsertOptions {
  @scala.inline
  def apply(
    deepInsert: js.UndefOr[scala.Boolean] = js.undefined,
    onConflictIgnore: js.UndefOr[scala.Boolean] = js.undefined
  ): PersistenceInsertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deepInsert)) __obj.updateDynamic("deepInsert")(deepInsert)
    if (!js.isUndefined(onConflictIgnore)) __obj.updateDynamic("onConflictIgnore")(onConflictIgnore)
    __obj.asInstanceOf[PersistenceInsertOptions]
  }
}

