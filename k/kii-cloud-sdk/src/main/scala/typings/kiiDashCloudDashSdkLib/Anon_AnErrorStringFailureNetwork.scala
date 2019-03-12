package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureNetwork extends js.Object {
  def failure(
    user: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser,
    network: kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName,
    anErrorString: java.lang.String
  ): js.Any
  def success(
    user: kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser,
    network: kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName
  ): js.Any
}

object Anon_AnErrorStringFailureNetwork {
  @scala.inline
  def apply(
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName, java.lang.String) => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiUser, kiiDashCloudDashSdkLib.KiiCloudNs.KiiSocialNetworkName) => js.Any
  ): Anon_AnErrorStringFailureNetwork = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction3(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureNetwork]
  }
}

