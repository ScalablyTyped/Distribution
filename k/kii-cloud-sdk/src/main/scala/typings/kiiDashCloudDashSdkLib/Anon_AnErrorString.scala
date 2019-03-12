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
    failure: java.lang.String => js.Any,
    success: (js.Array[kiiDashCloudDashSdkLib.KiiCloudNs.KiiTopic], java.lang.String) => js.Any
  ): Anon_AnErrorString = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[Anon_AnErrorString]
  }
}

