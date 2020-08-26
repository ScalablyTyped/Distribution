package typings.lernaGetPackages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalTsTypings extends js.Object {
  var additionalTsTypings: js.UndefOr[js.Array[String]] = js.native
}

object AdditionalTsTypings {
  @scala.inline
  def apply(): AdditionalTsTypings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalTsTypings]
  }
  @scala.inline
  implicit class AdditionalTsTypingsOps[Self <: AdditionalTsTypings] (val x: Self) extends AnyVal {
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
    def setAdditionalTsTypingsVarargs(value: String*): Self = this.set("additionalTsTypings", js.Array(value :_*))
    @scala.inline
    def setAdditionalTsTypings(value: js.Array[String]): Self = this.set("additionalTsTypings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalTsTypings: Self = this.set("additionalTsTypings", js.undefined)
  }
  
}

