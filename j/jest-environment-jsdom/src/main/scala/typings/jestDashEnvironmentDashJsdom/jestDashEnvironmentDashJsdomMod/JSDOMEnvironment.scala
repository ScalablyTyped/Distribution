package typings.jestDashEnvironmentDashJsdom.jestDashEnvironmentDashJsdomMod

import typings.atJestEnvironment.atJestEnvironmentMod.JestEnvironment
import typings.atJestFakeDashTimers.atJestFakeDashTimersMod.JestFakeTimers
import typings.jestDashEnvironmentDashJsdom.Anon_Error_1933525888
import typings.jsdom.jsdomMod.JSDOM
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDOMEnvironment extends JestEnvironment {
  var dom: JSDOM | Null = js.native
  var errorEventListener: (js.Function1[/* event */ Event with Anon_Error_1933525888, Unit]) | Null = js.native
  @JSName("fakeTimers")
  var fakeTimers_JSDOMEnvironment: JestFakeTimers[Double] | Null = js.native
  @JSName("global")
  var global_JSDOMEnvironment: Win = js.native
}

