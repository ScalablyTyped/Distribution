package typings.ldclientJs.mod

import typings.ldclientJsCommon.mod.LDOptionsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LDOptions extends LDOptionsBase {
  /**
    * Whether the client should make a request to LaunchDarkly for A/B testing goals.
    *
    * This is true by default, meaning that this request will be made on every page load.
    * Set it to false if you are not using A/B testing and want to skip the request.
    */
  var fetchGoals: js.UndefOr[Boolean] = js.native
  /**
    * The signed user key for Secure Mode.
    *
    * For more information, see the JavaScript SDK Reference Guide on
    * [Secure mode](https://github.com/launchdarkly/js-client#secure-mode).
    */
  var hash: js.UndefOr[String] = js.native
}

object LDOptions {
  @scala.inline
  def apply(): LDOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LDOptions]
  }
  @scala.inline
  implicit class LDOptionsOps[Self <: LDOptions] (val x: Self) extends AnyVal {
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
    def setFetchGoals(value: Boolean): Self = this.set("fetchGoals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchGoals: Self = this.set("fetchGoals", js.undefined)
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
  }
  
}

