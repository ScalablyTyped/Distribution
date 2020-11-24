package typings.k6.optionsMod

import typings.k6.k6Strings.`constant-arrival-rate`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstantArrivalRateScenario
  extends BaseScenario
     with Scenario {
  
  /** Total scenario duration (excluding `gracefulStop`) */
  var duration: String = js.native
  
  @JSName("executor")
  var executor_ConstantArrivalRateScenario: `constant-arrival-rate` = js.native
  
  /**
    * Maximum number of VUs to allow during the test run.
    *
    * The default value is the value of the `preAllocatedVUs` option.
    */
  var maxVUs: js.UndefOr[Double] = js.native
  
  /** Number of VUs to pre-allocate before test start in order to preserve runtime resources. */
  var preAllocatedVUs: Double = js.native
  
  /** Number of iterations to execute each `timeUnit` period. */
  var rate: Double = js.native
  
  /**
    * Period of time to apply the `rate` value.
    *
    * The default value is 1s.
    */
  var timeUnit: js.UndefOr[String] = js.native
}
