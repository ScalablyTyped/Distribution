package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringArgument[T] extends js.Object {
  def failure(
    entry: kiiDashCloudDashSdkLib.KiiCloudNs.KiiServerCodeEntry,
    argument: T,
    execResult: kiiDashCloudDashSdkLib.KiiCloudNs.KiiServerCodeExecResult,
    anErrorString: java.lang.String
  ): js.Any
  def success(
    entry: kiiDashCloudDashSdkLib.KiiCloudNs.KiiServerCodeEntry,
    argument: T,
    execResult: kiiDashCloudDashSdkLib.KiiCloudNs.KiiServerCodeExecResult
  ): js.Any
}

object Anon_AnErrorStringArgument {
  @scala.inline
  def apply[T](
    failure: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiServerCodeEntry, T, kiiDashCloudDashSdkLib.KiiCloudNs.KiiServerCodeExecResult, java.lang.String) => js.Any,
    success: (kiiDashCloudDashSdkLib.KiiCloudNs.KiiServerCodeEntry, T, kiiDashCloudDashSdkLib.KiiCloudNs.KiiServerCodeExecResult) => js.Any
  ): Anon_AnErrorStringArgument[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction3(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringArgument[T]]
  }
}

