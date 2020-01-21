package typings.libraCore.eventsPbMod.EventsForVersions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventsForVersionList: js.Array[typings.libraCore.eventsPbMod.EventsList.AsObject]
}

object AsObject {
  @scala.inline
  def apply(eventsForVersionList: js.Array[typings.libraCore.eventsPbMod.EventsList.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(eventsForVersionList = eventsForVersionList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

