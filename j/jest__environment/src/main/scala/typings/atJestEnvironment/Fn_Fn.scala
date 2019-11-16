package typings.atJestEnvironment

import typings.atJestTypes.buildGlobalMod.TestFn
import typings.atJestTypes.buildGlobalMod.TestName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Fn extends js.Object {
  def apply(testName: TestName, fn: TestFn): Unit = js.native
  def apply(testName: TestName, fn: TestFn, timeout: Double): Unit = js.native
}

