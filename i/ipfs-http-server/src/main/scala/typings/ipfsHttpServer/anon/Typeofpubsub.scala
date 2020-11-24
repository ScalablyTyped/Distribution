package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpubsub extends js.Object {
  
  val cancel: Typeofcancel = js.native
  
  val state: Typeofstate = js.native
  
  val subs: Typeofsubs = js.native
}
object Typeofpubsub {
  
  @scala.inline
  def apply(cancel: Typeofcancel, state: Typeofstate, subs: Typeofsubs): Typeofpubsub = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subs = subs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpubsub]
  }
  
  @scala.inline
  implicit class TypeofpubsubOps[Self <: Typeofpubsub] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Typeofcancel): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Typeofstate): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubs(value: Typeofsubs): Self = this.set("subs", value.asInstanceOf[js.Any])
  }
}
