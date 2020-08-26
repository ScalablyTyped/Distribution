package typings.hapiInert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * inert accepts the following registration options
  * @see {@link https://github.com/hapijs/inert#registration-options}
  */
@js.native
trait OptionalRegistrationOptions extends js.Object {
  /**
    * sets the maximum number of file etag hash values stored in the etags cache. Defaults to 10000.
    */
  var etagsCacheMaxSize: js.UndefOr[Double] = js.native
}

object OptionalRegistrationOptions {
  @scala.inline
  def apply(): OptionalRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalRegistrationOptions]
  }
  @scala.inline
  implicit class OptionalRegistrationOptionsOps[Self <: OptionalRegistrationOptions] (val x: Self) extends AnyVal {
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
    def setEtagsCacheMaxSize(value: Double): Self = this.set("etagsCacheMaxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtagsCacheMaxSize: Self = this.set("etagsCacheMaxSize", js.undefined)
  }
  
}

