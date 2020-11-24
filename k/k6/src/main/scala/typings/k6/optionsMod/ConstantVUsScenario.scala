package typings.k6.optionsMod

import typings.k6.k6Strings.`constant-vus`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstantVUsScenario
  extends BaseScenario
     with Scenario {
  
  /**
    * Total scenario duration (excluding `gracefulStop`)
    */
  var duration: String = js.native
  
  @JSName("executor")
  var executor_ConstantVUsScenario: `constant-vus` = js.native
  
  /**
    * Number of VUs to run concurrently.
    *
    * The default value is 1.
    */
  var vus: js.UndefOr[Double] = js.native
}
