package typings.k6.optionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/options", "BaseScenario")
@js.native
abstract class BaseScenario () extends js.Object {
  
  /** Environment variables specific to this scenario.  */
  var env: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Name of exported JS function to execute.
    *
    * The default value is "default".
    */
  var exec: js.UndefOr[String] = js.native
  
  /**
    * Executor type.  Options available:
    * - `shared-iterations`
    * - `per-vu-iterations`
    * - `constant-vus`
    * - `ramping-vus`
    * - `constant-arrival-rate`
    * - `ramping-arrival-rate`
    * - `externally-controlled`
    */
  var executor: ExecutorOptions = js.native
  
  /**
    * Time to wait for iterations to finish executing before stopping them forcefully.
    * See https://k6.io/docs/using-k6/scenarios#graceful-stop-and-ramp-down
    *
    * Default value is 30s
    */
  var gracefulStop: js.UndefOr[String] = js.native
  
  /**
    * Time offset since the start of the test, at which point this scenario should begin execution.
    *
    * Default value is 0s.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /** Tags specific to this scenario. */
  var tags: js.UndefOr[StringDictionary[String]] = js.native
}
