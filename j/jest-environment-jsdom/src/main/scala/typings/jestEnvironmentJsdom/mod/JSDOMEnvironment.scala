package typings.jestEnvironmentJsdom.mod

import typings.jestEnvironment.mod.JestEnvironment
import typings.jestEnvironmentJsdom.AnonError1603833299
import typings.jestFakeTimers.mod.JestFakeTimers
import typings.jsdom.mod.JSDOM
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSDOMEnvironment extends JestEnvironment {
  var dom: JSDOM | Null = js.native
  var errorEventListener: (js.Function1[/* event */ Event_ with AnonError1603833299, Unit]) | Null = js.native
  @JSName("fakeTimers")
  var fakeTimers_JSDOMEnvironment: JestFakeTimers[Double] | Null = js.native
  @JSName("global")
  var global_JSDOMEnvironment: Win = js.native
}

