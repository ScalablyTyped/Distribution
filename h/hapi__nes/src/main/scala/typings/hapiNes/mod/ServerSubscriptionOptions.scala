package typings.hapiNes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerSubscriptionOptions extends js.Object {
  
  var auth: js.UndefOr[Boolean | ServerSubscriptionOptionsAuthOptions] = js.native
  
  var filter: js.UndefOr[
    js.Function4[
      /* path */ String, 
      /* message */ js.Any, 
      /* options */ ServerSubscriptionOptionsFilterOptions, 
      /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
  
  var onSubscribe: js.UndefOr[ServerOnSubscribe] = js.native
  
  var onUnsubscribe: js.UndefOr[ServerOnUnSubscribe] = js.native
}
object ServerSubscriptionOptions {
  
  @scala.inline
  def apply(): ServerSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSubscriptionOptions]
  }
  
  @scala.inline
  implicit class ServerSubscriptionOptionsOps[Self <: ServerSubscriptionOptions] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: Boolean | ServerSubscriptionOptionsAuthOptions): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setFilter(
      value: (/* path */ String, /* message */ js.Any, /* options */ ServerSubscriptionOptionsFilterOptions, /* next */ js.Function2[/* isMatch */ Boolean, /* override */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = this.set("filter", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setOnSubscribeFunction2(value: (/* socket */ Socket, /* path */ String) => js.Promise[js.Any]): Self = this.set("onSubscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSubscribeFunction3(value: (/* socket */ Socket, /* path */ String, /* params */ js.Any) => js.Promise[js.Any]): Self = this.set("onSubscribe", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnSubscribe(value: ServerOnSubscribe): Self = this.set("onSubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnSubscribe: Self = this.set("onSubscribe", js.undefined)
    
    @scala.inline
    def setOnUnsubscribeFunction2(value: (/* socket */ Socket, /* path */ String) => Unit): Self = this.set("onUnsubscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUnsubscribeFunction3(value: (/* socket */ Socket, /* path */ String, /* params */ js.Any) => Unit): Self = this.set("onUnsubscribe", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnUnsubscribe(value: ServerOnUnSubscribe): Self = this.set("onUnsubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUnsubscribe: Self = this.set("onUnsubscribe", js.undefined)
  }
}
