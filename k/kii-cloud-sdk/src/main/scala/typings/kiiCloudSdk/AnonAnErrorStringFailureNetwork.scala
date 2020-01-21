package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiSocialNetworkName
import typings.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorStringFailureNetwork extends js.Object {
  def failure(user: KiiUser, network: KiiSocialNetworkName, anErrorString: String): js.Any
  def success(user: KiiUser, network: KiiSocialNetworkName): js.Any
}

object AnonAnErrorStringFailureNetwork {
  @scala.inline
  def apply(
    failure: (KiiUser, KiiSocialNetworkName, String) => js.Any,
    success: (KiiUser, KiiSocialNetworkName) => js.Any
  ): AnonAnErrorStringFailureNetwork = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[AnonAnErrorStringFailureNetwork]
  }
}

