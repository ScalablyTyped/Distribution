package typings.ionicDiscover.publisherMod

import typings.ionicDiscover.ionicDiscoverStrings.error
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPublisherEventEmitter extends js.Object {
  
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
}
object IPublisherEventEmitter {
  
  @scala.inline
  def apply(on: (error, js.Function1[/* err */ Error, Unit]) => IPublisherEventEmitter): IPublisherEventEmitter = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[IPublisherEventEmitter]
  }
  
  @scala.inline
  implicit class IPublisherEventEmitterOps[Self <: IPublisherEventEmitter] (val x: Self) extends AnyVal {
    
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
    def setOn(value: (error, js.Function1[/* err */ Error, Unit]) => IPublisherEventEmitter): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
