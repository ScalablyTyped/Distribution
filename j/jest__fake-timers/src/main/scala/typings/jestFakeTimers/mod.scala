package typings.jestFakeTimers

import typings.jestFakeTimers.anon.Config
import typings.jestFakeTimers.jestFakeTimersMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/fake-timers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class JestFakeTimers[TimerRef] protected () extends default[TimerRef] {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[TimerRef]) = this()
  }
}
