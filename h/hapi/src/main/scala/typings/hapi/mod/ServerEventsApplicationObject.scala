package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerEventsApplicationObject extends js.Object {
  /** a string or array of strings specifying the event channels available. Defaults to no channel restrictions (event updates can specify a channel or not). */
  var channels: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * if true, the data object passed to server.events.emit() is cloned before it is passed to the listeners (unless an override specified by each listener). Defaults to false (data is passed as-is).
    */
  @JSName("clone")
  var clone_FServerEventsApplicationObject: js.UndefOr[Boolean] = js.native
  /** the event name string (required). */
  var name: String = js.native
  /**
    * if true, the same event name can be registered multiple times where the second registration is ignored. Note that if the registration config is changed between registrations, only the first
    * configuration is used. Defaults to false (a duplicate registration will throw an error).
    */
  var shared: js.UndefOr[Boolean] = js.native
  /**
    * if true, the data object passed to server.event.emit() must be an array and the listener method is called with each array element passed as a separate argument (unless an override specified
    * by each listener). This should only be used when the emitted data structure is known and predictable. Defaults to false (data is emitted as a single argument regardless of its type).
    */
  var spread: js.UndefOr[Boolean] = js.native
  /**
    * if true and the criteria object passed to server.event.emit() includes tags, the tags are mapped to an object (where each tag string is the key and the value is true) which is appended to
    * the arguments list at the end. A configuration override can be set by each listener. Defaults to false.
    */
  var tags: js.UndefOr[Boolean] = js.native
}

object ServerEventsApplicationObject {
  @scala.inline
  def apply(name: String): ServerEventsApplicationObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEventsApplicationObject]
  }
  @scala.inline
  implicit class ServerEventsApplicationObjectOps[Self <: ServerEventsApplicationObject] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    @scala.inline
    def setChannels(value: String | js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    @scala.inline
    def setSpread(value: Boolean): Self = this.set("spread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpread: Self = this.set("spread", js.undefined)
    @scala.inline
    def setTags(value: Boolean): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

