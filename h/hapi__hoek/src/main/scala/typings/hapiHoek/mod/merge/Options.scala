package typings.hapiHoek.mod.merge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * When true, array value from `source` is merged with the existing value in `target`.
    *
    * @default false
    */
  val mergeArrays: js.UndefOr[Boolean] = js.native
  /**
    * When true, null value from `source` overrides existing value in `target`.
    *
    * @default true
    */
  val nullOverride: js.UndefOr[Boolean] = js.native
  /**
    * Compare symbol properties.
    *
    * @default true
    */
  val symbols: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setMergeArrays(value: Boolean): Self = this.set("mergeArrays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeArrays: Self = this.set("mergeArrays", js.undefined)
    @scala.inline
    def setNullOverride(value: Boolean): Self = this.set("nullOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullOverride: Self = this.set("nullOverride", js.undefined)
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
  
}

