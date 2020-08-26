package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderCreatedEventUIParam extends js.Object {
  /**
    * Gets reference to the igZoombar.
    */
  var owner: js.UndefOr[js.Any] = js.native
  /**
    * Gets a reference to the created provider.
    */
  var provider: js.UndefOr[js.Any] = js.native
}

object ProviderCreatedEventUIParam {
  @scala.inline
  def apply(): ProviderCreatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderCreatedEventUIParam]
  }
  @scala.inline
  implicit class ProviderCreatedEventUIParamOps[Self <: ProviderCreatedEventUIParam] (val x: Self) extends AnyVal {
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
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setProvider(value: js.Any): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
  }
  
}

