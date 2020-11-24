package typings.k6.optionsMod

import typings.k6.k6Strings.`ramping-vus`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RampingVUsScenario
  extends BaseScenario
     with Scenario {
  
  @JSName("executor")
  var executor_RampingVUsScenario: `ramping-vus` = js.native
  
  /**
    * Time to wait for an already started iteration to finish before stopping it during a ramp down.
    *
    * The default value is 30s.
    */
  var gracefulRampDown: js.UndefOr[String] = js.native
  
  /** Array of objects that specify the number of VUs to ramp up or down to. */
  var stages: js.Array[Stage] = js.native
  
  /**
    * Number of VUs to run at test start.
    *
    * The default value is 1.
    */
  var startVUs: js.UndefOr[Double] = js.native
}
