package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiServerCodeEntry
import typings.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `24`[T] extends js.Object {
  def failure(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult, anErrorString: String): js.Any
  def success(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult): js.Any
}

object `24` {
  @scala.inline
  def apply[T](
    failure: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => js.Any,
    success: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => js.Any
  ): `24`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`24`[T]]
  }
}

