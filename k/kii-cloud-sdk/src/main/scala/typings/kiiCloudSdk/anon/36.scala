package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiSocialNetworkName
import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `36` extends js.Object {
  def failure(user: KiiUser, network: KiiSocialNetworkName, anErrorString: String): js.Any = js.native
  def success(user: KiiUser, network: KiiSocialNetworkName): js.Any = js.native
}

object `36` {
  @scala.inline
  def apply(
    failure: (KiiUser, KiiSocialNetworkName, String) => js.Any,
    success: (KiiUser, KiiSocialNetworkName) => js.Any
  ): `36` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`36`]
  }
  @scala.inline
  implicit class `36Ops`[Self <: `36`] (val x: Self) extends AnyVal {
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
    def setFailure(value: (KiiUser, KiiSocialNetworkName, String) => js.Any): Self = this.set("failure", js.Any.fromFunction3(value))
    @scala.inline
    def setSuccess(value: (KiiUser, KiiSocialNetworkName) => js.Any): Self = this.set("success", js.Any.fromFunction2(value))
  }
  
}

