package typings.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewsRepositoryInboxResponsePartition extends js.Object {
  var time_bucket: NewsRepositoryInboxResponseTimeBucket
}

object NewsRepositoryInboxResponsePartition {
  @scala.inline
  def apply(time_bucket: NewsRepositoryInboxResponseTimeBucket): NewsRepositoryInboxResponsePartition = {
    val __obj = js.Dynamic.literal(time_bucket = time_bucket.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NewsRepositoryInboxResponsePartition]
  }
}

