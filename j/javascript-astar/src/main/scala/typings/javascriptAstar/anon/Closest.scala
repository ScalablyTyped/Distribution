package typings.javascriptAstar.anon

import typings.javascriptAstar.Heuristic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Closest extends js.Object {
  
  var closest: js.UndefOr[Boolean] = js.native
  
  var heuristic: js.UndefOr[Heuristic] = js.native
}
object Closest {
  
  @scala.inline
  def apply(): Closest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Closest]
  }
  
  @scala.inline
  implicit class ClosestOps[Self <: Closest] (val x: Self) extends AnyVal {
    
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
    def setClosest(value: Boolean): Self = this.set("closest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosest: Self = this.set("closest", js.undefined)
    
    @scala.inline
    def setHeuristic(value: (/* pos0 */ X, /* pos1 */ X) => Double): Self = this.set("heuristic", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeuristic: Self = this.set("heuristic", js.undefined)
  }
}
