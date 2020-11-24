package typings.koaSessionMinimal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegenerateId extends js.Object {
  
  def regenerateId(): Unit = js.native
}
object RegenerateId {
  
  @scala.inline
  def apply(regenerateId: () => Unit): RegenerateId = {
    val __obj = js.Dynamic.literal(regenerateId = js.Any.fromFunction0(regenerateId))
    __obj.asInstanceOf[RegenerateId]
  }
  
  @scala.inline
  implicit class RegenerateIdOps[Self <: RegenerateId] (val x: Self) extends AnyVal {
    
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
    def setRegenerateId(value: () => Unit): Self = this.set("regenerateId", js.Any.fromFunction0(value))
  }
}
