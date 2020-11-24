package typings.kBucket.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contact extends js.Object {
  
  var id: Uint8Array = js.native
  
  var vectorClock: Double = js.native
}
object Contact {
  
  @scala.inline
  def apply(id: Uint8Array, vectorClock: Double): Contact = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], vectorClock = vectorClock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contact]
  }
  
  @scala.inline
  implicit class ContactOps[Self <: Contact] (val x: Self) extends AnyVal {
    
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
    def setId(value: Uint8Array): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorClock(value: Double): Self = this.set("vectorClock", value.asInstanceOf[js.Any])
  }
}
