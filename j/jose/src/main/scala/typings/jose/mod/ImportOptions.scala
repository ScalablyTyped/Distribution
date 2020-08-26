package typings.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportOptions extends js.Object {
  var calculateMissingRSAPrimes: js.UndefOr[Boolean] = js.native
}

object ImportOptions {
  @scala.inline
  def apply(): ImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportOptions]
  }
  @scala.inline
  implicit class ImportOptionsOps[Self <: ImportOptions] (val x: Self) extends AnyVal {
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
    def setCalculateMissingRSAPrimes(value: Boolean): Self = this.set("calculateMissingRSAPrimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalculateMissingRSAPrimes: Self = this.set("calculateMissingRSAPrimes", js.undefined)
  }
  
}

