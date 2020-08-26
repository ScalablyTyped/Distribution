package typings.luminoWidgets.layoutMod.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a layout.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The fit policy for the layout.
    *
    * The default is `'set-min-size'`.
    */
  var fitPolicy: js.UndefOr[FitPolicy] = js.native
}

object IOptions {
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setFitPolicy(value: FitPolicy): Self = this.set("fitPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFitPolicy: Self = this.set("fitPolicy", js.undefined)
  }
  
}

