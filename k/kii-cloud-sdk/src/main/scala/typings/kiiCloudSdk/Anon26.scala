package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiServerCodeEntry
import typings.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon26[T] extends js.Object {
  def failure(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult, anErrorString: String): js.Any
  def success(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult): js.Any
}

object Anon26 {
  @scala.inline
  def apply[T](
    failure: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => js.Any,
    success: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => js.Any
  ): Anon26[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon26[T]]
  }
}

