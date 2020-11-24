package typings.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMessageID extends js.Object {
  
  def getMessageID(): js.Promise[String] = js.native
  
  def getThreadID(): js.Promise[String] = js.native
}
object GetMessageID {
  
  @scala.inline
  def apply(getMessageID: () => js.Promise[String], getThreadID: () => js.Promise[String]): GetMessageID = {
    val __obj = js.Dynamic.literal(getMessageID = js.Any.fromFunction0(getMessageID), getThreadID = js.Any.fromFunction0(getThreadID))
    __obj.asInstanceOf[GetMessageID]
  }
  
  @scala.inline
  implicit class GetMessageIDOps[Self <: GetMessageID] (val x: Self) extends AnyVal {
    
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
    def setGetMessageID(value: () => js.Promise[String]): Self = this.set("getMessageID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThreadID(value: () => js.Promise[String]): Self = this.set("getThreadID", js.Any.fromFunction0(value))
  }
}
