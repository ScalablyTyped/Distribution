package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorString extends js.Object {
  def failure(anErrorString: java.lang.String): js.Any
  def success(
    topicList: js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic],
    nextPaginationKey: java.lang.String
  ): js.Any
}

object Anon_AnErrorString {
  @scala.inline
  def apply(
    failure: js.Function1[java.lang.String, js.Any],
    success: js.Function2[js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic], java.lang.String, js.Any]
  ): Anon_AnErrorString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failure")(failure)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[Anon_AnErrorString]
  }
}

