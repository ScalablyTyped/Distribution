package typings.instagramPrivateApi.mediaConfigureStoryOptionsMod

import typings.instagramPrivateApi.AnonWebUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryCta extends js.Object {
  var links: js.Array[AnonWebUri]
}

object StoryCta {
  @scala.inline
  def apply(links: js.Array[AnonWebUri]): StoryCta = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StoryCta]
  }
}

