package typings.jsData.simpleStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var usePendingFind: js.UndefOr[Boolean | js.Function] = js.native
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
  var usePendingFindAll: js.UndefOr[Boolean | js.Function] = js.native
}

object SimpleStoreOpts {
  @scala.inline
  def apply(): SimpleStoreOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleStoreOpts]
  }
  @scala.inline
  implicit class SimpleStoreOptsOps[Self <: SimpleStoreOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUsePendingFind(value: Boolean | js.Function): Self = this.set("usePendingFind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePendingFind: Self = this.set("usePendingFind", js.undefined)
    @scala.inline
    def setUsePendingFindAll(value: Boolean | js.Function): Self = this.set("usePendingFindAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePendingFindAll: Self = this.set("usePendingFindAll", js.undefined)
  }
  
}

