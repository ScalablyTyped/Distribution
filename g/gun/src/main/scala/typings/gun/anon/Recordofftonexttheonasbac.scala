package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'off' | 'to' | 'next' | 'the' | 'on' | 'as' | 'back' | 'rid' | 'id', any> */
@js.native
trait Recordofftonexttheonasbac extends js.Object {
  
  var as: js.Any = js.native
  
  var back: js.Any = js.native
  
  var id: js.Any = js.native
  
  var next: js.Any = js.native
  
  var off: js.Any = js.native
  
  var on: js.Any = js.native
  
  var rid: js.Any = js.native
  
  var the: js.Any = js.native
  
  var to: js.Any = js.native
}
object Recordofftonexttheonasbac {
  
  @scala.inline
  def apply(
    as: js.Any,
    back: js.Any,
    id: js.Any,
    next: js.Any,
    off: js.Any,
    on: js.Any,
    rid: js.Any,
    the: js.Any,
    to: js.Any
  ): Recordofftonexttheonasbac = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], back = back.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], rid = rid.asInstanceOf[js.Any], the = the.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordofftonexttheonasbac]
  }
  
  @scala.inline
  implicit class RecordofftonexttheonasbacOps[Self <: Recordofftonexttheonasbac] (val x: Self) extends AnyVal {
    
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBack(value: js.Any): Self = this.set("back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: js.Any): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff(value: js.Any): Self = this.set("off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: js.Any): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRid(value: js.Any): Self = this.set("rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThe(value: js.Any): Self = this.set("the", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: js.Any): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
