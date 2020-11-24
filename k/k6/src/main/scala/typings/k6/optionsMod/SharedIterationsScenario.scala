package typings.k6.optionsMod

import typings.k6.k6Strings.`shared-iterations`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedIterationsScenario
  extends BaseScenario
     with Scenario {
  
  @JSName("executor")
  var executor_SharedIterationsScenario: `shared-iterations` = js.native
  
  /**
    * Number of iterations to execute across all VUs.
    *
    * The default value is 1.
    */
  var iterations: js.UndefOr[Double] = js.native
  
  /**
    * Maximum scenario duration before it's forcibly stopped (excluding gracefulStop).
    *
    * The default value is 10m.
    */
  var maxDuration: js.UndefOr[String] = js.native
  
  /**
    * Number of VUs to run concurrently.
    *
    * The default value is 1.
    */
  var vus: js.UndefOr[Double] = js.native
}
