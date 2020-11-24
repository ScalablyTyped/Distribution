package typings.k6.optionsMod

import typings.k6.k6Strings.`externally-controlled`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternallyControlledScenario
  extends BaseScenario
     with Scenario {
  
  /** Total scenario duration (excluding `gracefulStop`) */
  var duration: String = js.native
  
  @JSName("executor")
  var executor_ExternallyControlledScenario: `externally-controlled` = js.native
  
  /** Maximum number of VUs to allow during the test run. */
  var maxVUs: js.UndefOr[Double] = js.native
  
  /**
    * Number of VUs to run concurrently.
    *
    * The default value is 1.
    */
  var vus: js.UndefOr[Double] = js.native
}
