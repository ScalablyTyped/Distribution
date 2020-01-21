package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponseTimeBucket extends js.Object {
  var headers: js.Array[String]
  var indices: js.Array[Double]
}

object NewsRepositoryInboxResponseTimeBucket {
  @scala.inline
  def apply(headers: js.Array[String], indices: js.Array[Double]): NewsRepositoryInboxResponseTimeBucket = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NewsRepositoryInboxResponseTimeBucket]
  }
}

