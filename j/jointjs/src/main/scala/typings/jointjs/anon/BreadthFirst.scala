package typings.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadthFirst extends js.Object {
  
  var breadthFirst: js.UndefOr[Boolean] = js.native
  
  var deep: js.UndefOr[Boolean] = js.native
}
object BreadthFirst {
  
  @scala.inline
  def apply(): BreadthFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadthFirst]
  }
  
  @scala.inline
  implicit class BreadthFirstOps[Self <: BreadthFirst] (val x: Self) extends AnyVal {
    
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
    def setBreadthFirst(value: Boolean): Self = this.set("breadthFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreadthFirst: Self = this.set("breadthFirst", js.undefined)
    
    @scala.inline
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
  }
}
