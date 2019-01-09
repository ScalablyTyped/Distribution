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

