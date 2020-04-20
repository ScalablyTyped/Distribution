package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuccess extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(topicList: js.Array[KiiTopic], nextPaginationKey: String): js.Any
}

object AnonSuccess {
  @scala.inline
  def apply(failure: String => js.Any, success: (js.Array[KiiTopic], String) => js.Any): AnonSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[AnonSuccess]
  }
}

