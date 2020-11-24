package typings.intercomjs

import typings.intercomjs.intercom.Intercom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntercomStatic extends js.Object {
  
  /**
    * Removes all data associated with intercom from localStorage.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns an instance of Intercom. If one doesn't exist, it will be instantiated.
    * @return an instance of Intercom.
    */
  def getInstance(): Intercom = js.native
}
object IntercomStatic {
  
  @scala.inline
  def apply(destroy: () => Unit, getInstance: () => Intercom): IntercomStatic = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getInstance = js.Any.fromFunction0(getInstance))
    __obj.asInstanceOf[IntercomStatic]
  }
  
  @scala.inline
  implicit class IntercomStaticOps[Self <: IntercomStatic] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInstance(value: () => Intercom): Self = this.set("getInstance", js.Any.fromFunction0(value))
  }
}
