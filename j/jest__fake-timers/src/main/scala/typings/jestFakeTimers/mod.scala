package typings.jestFakeTimers

import typings.jestFakeTimers.anon.Config
import typings.jestFakeTimers.jestFakeTimersMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/fake-timers", "JestFakeTimers")
  @js.native
  class JestFakeTimers[TimerRef] protected () extends default[TimerRef] {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: Config[TimerRef]) = this()
  }
}
