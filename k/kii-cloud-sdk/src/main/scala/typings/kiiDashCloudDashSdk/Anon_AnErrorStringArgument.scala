package typings.kiiDashCloudDashSdk

import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiServerCodeEntry
import typings.kiiDashCloudDashSdk.KiiCloudNs.KiiServerCodeExecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringArgument[T] extends js.Object {
  def failure(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult, anErrorString: String): js.Any
  def success(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult): js.Any
}

object Anon_AnErrorStringArgument {
  @scala.inline
  def apply[T](
    failure: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => js.Any,
    success: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => js.Any
  ): Anon_AnErrorStringArgument[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringArgument[T]]
  }
}

