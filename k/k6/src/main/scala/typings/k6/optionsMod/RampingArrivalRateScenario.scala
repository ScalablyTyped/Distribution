package typings.k6.optionsMod

import typings.k6.k6Strings.`ramping-arrival-rate`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RampingArrivalRateScenario
  extends BaseScenario
     with Scenario {
  
  @JSName("executor")
  var executor_RampingArrivalRateScenario: `ramping-arrival-rate` = js.native
  
  /** Maximum number of VUs to allow during the test run. */
  var maxVUs: js.UndefOr[Double] = js.native
  
  /** Number of VUs to pre-allocate before test start in order to preserve runtime resources. */
  var preAllocatedVUs: Double = js.native
  
  /** Array of objects that specify the number of iterations to ramp up or down to. */
  var stages: js.Array[Stage] = js.native
  
  /** Number of iterations to execute each `timeUnit` period at test start. */
  var startRate: js.UndefOr[Double] = js.native
  
  /**
    * Period of time to apply the `startRate` the `stages` target value..
    *
    * The default value is 1s.
    */
  var timeUnit: js.UndefOr[String] = js.native
}
