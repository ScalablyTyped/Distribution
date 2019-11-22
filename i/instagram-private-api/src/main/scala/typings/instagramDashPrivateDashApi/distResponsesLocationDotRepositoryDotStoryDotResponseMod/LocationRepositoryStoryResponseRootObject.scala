package typings.instagramDashPrivateDashApi.distResponsesLocationDotRepositoryDotStoryDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRepositoryStoryResponseRootObject extends js.Object {
  var status: String
  var story: LocationRepositoryStoryResponseStory
}

object LocationRepositoryStoryResponseRootObject {
  @scala.inline
  def apply(status: String, story: LocationRepositoryStoryResponseStory): LocationRepositoryStoryResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status, story = story)
  
    __obj.asInstanceOf[LocationRepositoryStoryResponseRootObject]
  }
}

