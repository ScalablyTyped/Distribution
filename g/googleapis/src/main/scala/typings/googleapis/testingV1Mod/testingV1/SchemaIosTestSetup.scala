package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of how to set up an iOS device prior to a test.
  */
@js.native
trait SchemaIosTestSetup extends js.Object {
  /**
    * The network traffic profile used for running the test. Available network
    * profiles can be queried by using the NETWORK_CONFIGURATION environment
    * type when calling
    * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String] = js.native
}

object SchemaIosTestSetup {
  @scala.inline
  def apply(networkProfile: String = null): SchemaIosTestSetup = {
    val __obj = js.Dynamic.literal()
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIosTestSetup]
  }
}

