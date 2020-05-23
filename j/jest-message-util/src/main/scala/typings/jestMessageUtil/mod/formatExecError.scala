package typings.jestMessageUtil.mod

import typings.jestMessageUtil.anon.PickProjectConfigrootDirt
import typings.jestTestResult.typesMod.SerializableError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-message-util", "formatExecError")
@js.native
object formatExecError extends js.Object {
  def apply(
    error: js.UndefOr[Error | SerializableError | String],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions
  ): String = js.native
  def apply(
    error: js.UndefOr[Error | SerializableError | String],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String
  ): String = js.native
  def apply(
    error: js.UndefOr[Error | SerializableError | String],
    config: PickProjectConfigrootDirt,
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
}

