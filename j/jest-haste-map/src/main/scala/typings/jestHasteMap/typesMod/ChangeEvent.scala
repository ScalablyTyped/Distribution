package typings.jestHasteMap.typesMod

import typings.jestHasteMap.anon.FilePath
import typings.jestHasteMap.hasteFSMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeEvent extends js.Object {
  var eventsQueue: EventsQueue = js.native
  var hasteFS: default = js.native
  var moduleMap: typings.jestHasteMap.moduleMapMod.default = js.native
}

object ChangeEvent {
  @scala.inline
  def apply(eventsQueue: EventsQueue, hasteFS: default, moduleMap: typings.jestHasteMap.moduleMapMod.default): ChangeEvent = {
    val __obj = js.Dynamic.literal(eventsQueue = eventsQueue.asInstanceOf[js.Any], hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEvent]
  }
  @scala.inline
  implicit class ChangeEventOps[Self <: ChangeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventsQueueVarargs(value: FilePath*): Self = this.set("eventsQueue", js.Array(value :_*))
    @scala.inline
    def setEventsQueue(value: EventsQueue): Self = this.set("eventsQueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasteFS(value: default): Self = this.set("hasteFS", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleMap(value: typings.jestHasteMap.moduleMapMod.default): Self = this.set("moduleMap", value.asInstanceOf[js.Any])
  }
  
}

