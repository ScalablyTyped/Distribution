package typings.jestCore

import typings.jestRunner.mod.Test
import typings.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/core/build/testSchedulerHelper", JSImport.Namespace)
@js.native
object testSchedulerHelperMod extends js.Object {
  
  def shouldRunInBand(
    tests: js.Array[Test],
    timings: js.Array[Double],
    hasDetectOpenHandlesMaxWorkersWatchWatchAll: GlobalConfig
  ): Boolean = js.native
}
