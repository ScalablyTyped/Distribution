package typings.jimp.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jimp.jimpStrings.`before-change`
import typings.jimp.jimpStrings.changed
import typings.jimp.mod.ListenableName
import typings.jimp.mod.ListenerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey[T /* <: ListenableName */]
  extends /* key */ StringDictionary[js.Any]
     with ListenerData[T] {
  
  var eventName: `before-change` | changed = js.native
  
  var methodName: T = js.native
}
object Dictkey {
  
  @scala.inline
  def apply[T /* <: ListenableName */](eventName: `before-change` | changed, methodName: T): Dictkey[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey[T]]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey[_], T /* <: ListenableName */] (val x: Self with Dictkey[T]) extends AnyVal {
    
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
    def setEventName(value: `before-change` | changed): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodName(value: T): Self = this.set("methodName", value.asInstanceOf[js.Any])
  }
}
