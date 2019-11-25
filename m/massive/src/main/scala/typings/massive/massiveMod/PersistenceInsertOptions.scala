package typings.massive.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceInsertOptions extends js.Object {
  var deepInsert: js.UndefOr[Boolean] = js.undefined
  var onConflictIgnore: js.UndefOr[Boolean] = js.undefined
}

object PersistenceInsertOptions {
  @scala.inline
  def apply(
    deepInsert: js.UndefOr[Boolean] = js.undefined,
    onConflictIgnore: js.UndefOr[Boolean] = js.undefined
  ): PersistenceInsertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deepInsert)) __obj.updateDynamic("deepInsert")(deepInsert.asInstanceOf[js.Any])
    if (!js.isUndefined(onConflictIgnore)) __obj.updateDynamic("onConflictIgnore")(onConflictIgnore.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceInsertOptions]
  }
}

