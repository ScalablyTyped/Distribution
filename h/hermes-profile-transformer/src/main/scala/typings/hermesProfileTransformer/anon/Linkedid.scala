package typings.hermesProfileTransformer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Linkedid extends js.Object {
  
  var linked_id: Double = js.native
}
object Linkedid {
  
  @scala.inline
  def apply(linked_id: Double): Linkedid = {
    val __obj = js.Dynamic.literal(linked_id = linked_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linkedid]
  }
  
  @scala.inline
  implicit class LinkedidOps[Self <: Linkedid] (val x: Self) extends AnyVal {
    
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
    def setLinked_id(value: Double): Self = this.set("linked_id", value.asInstanceOf[js.Any])
  }
}
