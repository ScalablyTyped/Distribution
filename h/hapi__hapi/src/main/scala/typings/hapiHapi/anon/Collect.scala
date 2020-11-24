package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collect extends js.Object {
  
  var collect: Boolean = js.native
}
object Collect {
  
  @scala.inline
  def apply(collect: Boolean): Collect = {
    val __obj = js.Dynamic.literal(collect = collect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collect]
  }
  
  @scala.inline
  implicit class CollectOps[Self <: Collect] (val x: Self) extends AnyVal {
    
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
    def setCollect(value: Boolean): Self = this.set("collect", value.asInstanceOf[js.Any])
  }
}
