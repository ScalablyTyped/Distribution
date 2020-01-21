package typings.jestMessageUtil.mod

import typings.jestMessageUtil.jestMessageUtilStrings.rootDir
import typings.jestMessageUtil.jestMessageUtilStrings.testMatch
import typings.jestTestResult.typesMod.SerializableError
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Error
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-message-util", "formatExecError")
@js.native
object formatExecError extends js.Object {
  def apply(
    error: js.UndefOr[scala.Nothing],
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions
  ): String = js.native
  def apply(
    error: js.UndefOr[scala.Nothing],
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: js.UndefOr[scala.Nothing],
    reuseMessage: Boolean
  ): String = js.native
  def apply(
    error: js.UndefOr[scala.Nothing],
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String
  ): String = js.native
  def apply(
    error: js.UndefOr[scala.Nothing],
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
  def apply(error: String, config: Pick[ProjectConfig, rootDir | testMatch], options: StackTraceOptions): String = js.native
  def apply(
    error: String,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: js.UndefOr[scala.Nothing],
    reuseMessage: Boolean
  ): String = js.native
  def apply(
    error: String,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String
  ): String = js.native
  def apply(
    error: String,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
  def apply(
    error: SerializableError,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions
  ): String = js.native
  def apply(
    error: SerializableError,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: js.UndefOr[scala.Nothing],
    reuseMessage: Boolean
  ): String = js.native
  def apply(
    error: SerializableError,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String
  ): String = js.native
  def apply(
    error: SerializableError,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
  def apply(error: Error, config: Pick[ProjectConfig, rootDir | testMatch], options: StackTraceOptions): String = js.native
  def apply(
    error: Error,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: js.UndefOr[scala.Nothing],
    reuseMessage: Boolean
  ): String = js.native
  def apply(
    error: Error,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String
  ): String = js.native
  def apply(
    error: Error,
    config: Pick[ProjectConfig, rootDir | testMatch],
    options: StackTraceOptions,
    testPath: String,
    reuseMessage: Boolean
  ): String = js.native
}

