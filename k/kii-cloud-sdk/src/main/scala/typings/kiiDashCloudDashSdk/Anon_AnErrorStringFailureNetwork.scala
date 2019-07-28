package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiSocialNetworkName
import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureNetwork extends js.Object {
  def failure(user: KiiUser, network: KiiSocialNetworkName, anErrorString: String): js.Any
  def success(user: KiiUser, network: KiiSocialNetworkName): js.Any
}

object Anon_AnErrorStringFailureNetwork {
  @scala.inline
  def apply(
    failure: (KiiUser, KiiSocialNetworkName, String) => js.Any,
    success: (KiiUser, KiiSocialNetworkName) => js.Any
  ): Anon_AnErrorStringFailureNetwork = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureNetwork]
  }
}

