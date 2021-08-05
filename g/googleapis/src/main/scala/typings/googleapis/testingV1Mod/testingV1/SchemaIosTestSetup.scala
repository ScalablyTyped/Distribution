package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of how to set up an iOS device prior to a test.
  */
trait SchemaIosTestSetup extends StObject {
  
  /**
    * The network traffic profile used for running the test. Available network
    * profiles can be queried by using the NETWORK_CONFIGURATION environment
    * type when calling
    * TestEnvironmentDiscoveryService.GetTestEnvironmentCatalog.
    */
  var networkProfile: js.UndefOr[String] = js.undefined
}
object SchemaIosTestSetup {
  
  inline def apply(): SchemaIosTestSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosTestSetup]
  }
  
  extension [Self <: SchemaIosTestSetup](x: Self) {
    
    inline def setNetworkProfile(value: String): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
  }
}
