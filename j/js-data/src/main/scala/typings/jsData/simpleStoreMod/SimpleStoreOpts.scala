package typings.jsData.simpleStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleStoreOpts extends js.Object {
  /**
    * Whether to use the pending query if a `find` request for the specified
    * record is currently underway. Can be set to `true`, `false`, or to a
    * function that returns `true` or `false`.
    *
    * @default true
    * @name SimpleStore#usePendingFind
    * @since 3.0.0
    * @type {boolean|Function}
    */
  var usePendingFind: js.UndefOr[Boolean | js.Function] = js.undefined
  /**
    * Whether to use the pending query if a `findAll` request for the given query
    * is currently underway. Can be set to `true`, `false`, or to a function that
    * returns `true` or `false`.
    *
    * @default true
    * @name SimpleStore#usePendingFindAll
    * @since 3.0.0
    * @type {boolean|Function}
    */
  var usePendingFindAll: js.UndefOr[Boolean | js.Function] = js.undefined
}

object SimpleStoreOpts {
  @scala.inline
  def apply(usePendingFind: Boolean | js.Function = null, usePendingFindAll: Boolean | js.Function = null): SimpleStoreOpts = {
    val __obj = js.Dynamic.literal()
    if (usePendingFind != null) __obj.updateDynamic("usePendingFind")(usePendingFind.asInstanceOf[js.Any])
    if (usePendingFindAll != null) __obj.updateDynamic("usePendingFindAll")(usePendingFindAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleStoreOpts]
  }
}

