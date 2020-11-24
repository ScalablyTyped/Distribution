package typings.mathjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Simplify extends js.Object {
  
  var simplify: Boolean = js.native
}
object Simplify {
  
  @scala.inline
  def apply(simplify: Boolean): Simplify = {
    val __obj = js.Dynamic.literal(simplify = simplify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Simplify]
  }
  
  @scala.inline
  implicit class SimplifyOps[Self <: Simplify] (val x: Self) extends AnyVal {
    
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
    def setSimplify(value: Boolean): Self = this.set("simplify", value.asInstanceOf[js.Any])
  }
}
