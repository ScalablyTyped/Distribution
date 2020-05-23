package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiTopic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `4` extends js.Object {
  def failure(anErrorString: String): js.Any
  def success(topicList: js.Array[KiiTopic], nextPaginationKey: String): js.Any
}

object `4` {
  @scala.inline
  def apply(failure: String => js.Any, success: (js.Array[KiiTopic], String) => js.Any): `4` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[`4`]
  }
}

