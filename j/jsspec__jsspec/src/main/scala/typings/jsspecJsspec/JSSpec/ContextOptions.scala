package typings.jsspecJsspec.JSSpec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextOptions extends js.Object {
  /**
    * Run the contained Examples/Contexts in random order?
    * - Run in random order if `true`
    * - Run in definition order if `false`
    */
  var random: js.UndefOr[Boolean] = js.native
  /**
    * fail the test after _timeout_ milliseconds
    */
  var timeout: js.UndefOr[Double] = js.native
}

object ContextOptions {
  @scala.inline
  def apply(): ContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextOptions]
  }
  @scala.inline
  implicit class ContextOptionsOps[Self <: ContextOptions] (val x: Self) extends AnyVal {
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
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

