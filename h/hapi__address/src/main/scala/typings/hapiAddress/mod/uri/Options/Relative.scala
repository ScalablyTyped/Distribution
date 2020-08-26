package typings.hapiAddress.mod.uri.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relative extends Query {
  /**
    * Requires the URI to be relative.
    * 
    * @default false
    */
  val relativeOnly: js.UndefOr[Boolean] = js.native
}

object Relative {
  @scala.inline
  def apply(): Relative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relative]
  }
  @scala.inline
  implicit class RelativeOps[Self <: Relative] (val x: Self) extends AnyVal {
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
    def setRelativeOnly(value: Boolean): Self = this.set("relativeOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeOnly: Self = this.set("relativeOnly", js.undefined)
  }
  
}

