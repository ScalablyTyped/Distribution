package typings.jestImageSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixelmatchOptions extends js.Object {
  /**
    * If true, disables detecting and ignoring anti-aliased pixels.
    * @default false
    */
  val includeAA: js.UndefOr[Boolean] = js.native
  /**
    * Matching threshold, ranges from 0 to 1.
    * Smaller values make the comparison more sensitive.
    * @default 0.1
    */
  val threshold: js.UndefOr[Double] = js.native
}

object PixelmatchOptions {
  @scala.inline
  def apply(): PixelmatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelmatchOptions]
  }
  @scala.inline
  implicit class PixelmatchOptionsOps[Self <: PixelmatchOptions] (val x: Self) extends AnyVal {
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
    def setIncludeAA(value: Boolean): Self = this.set("includeAA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAA: Self = this.set("includeAA", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

