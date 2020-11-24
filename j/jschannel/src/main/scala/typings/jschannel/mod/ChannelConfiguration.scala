package typings.jschannel.mod

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelConfiguration extends js.Object {
  
  var debugOutput: js.UndefOr[Boolean] = js.native
  
  var gotMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.native
  
  var onReady: js.UndefOr[js.Function1[/* channel */ MessagingChannel, Unit]] = js.native
  
  var origin: String = js.native
  
  var postMessageObserver: js.UndefOr[js.Function2[/* origin */ String, /* message */ Message, Unit]] = js.native
  
  var publish: js.UndefOr[Boolean] = js.native
  
  var reconnect: js.UndefOr[Boolean] = js.native
  
  var remote: js.UndefOr[String | js.Array[String]] = js.native
  
  var scope: String = js.native
  
  var window: Window = js.native
}
object ChannelConfiguration {
  
  @scala.inline
  def apply(origin: String, scope: String, window: Window): ChannelConfiguration = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelConfiguration]
  }
  
  @scala.inline
  implicit class ChannelConfigurationOps[Self <: ChannelConfiguration] (val x: Self) extends AnyVal {
    
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
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Window): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugOutput(value: Boolean): Self = this.set("debugOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugOutput: Self = this.set("debugOutput", js.undefined)
    
    @scala.inline
    def setGotMessageObserver(value: (/* origin */ String, /* message */ Message) => Unit): Self = this.set("gotMessageObserver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGotMessageObserver: Self = this.set("gotMessageObserver", js.undefined)
    
    @scala.inline
    def setOnReady(value: /* channel */ MessagingChannel => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setPostMessageObserver(value: (/* origin */ String, /* message */ Message) => Unit): Self = this.set("postMessageObserver", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostMessageObserver: Self = this.set("postMessageObserver", js.undefined)
    
    @scala.inline
    def setPublish(value: Boolean): Self = this.set("publish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublish: Self = this.set("publish", js.undefined)
    
    @scala.inline
    def setReconnect(value: Boolean): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    
    @scala.inline
    def setRemoteVarargs(value: String*): Self = this.set("remote", js.Array(value :_*))
    
    @scala.inline
    def setRemote(value: String | js.Array[String]): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
  }
}
