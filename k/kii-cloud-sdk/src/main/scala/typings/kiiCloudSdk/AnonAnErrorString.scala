package typings.kiiCloudSdk

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnErrorString extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(topicList: js.Array[KiiTopic], nextPaginationKey: String): js.Any
}

object AnonAnErrorString {
  @scala.inline
  def apply(failure: String => js.Any, success: (js.Array[KiiTopic], String) => js.Any): AnonAnErrorString = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
  
    __obj.asInstanceOf[AnonAnErrorString]
  }
}

