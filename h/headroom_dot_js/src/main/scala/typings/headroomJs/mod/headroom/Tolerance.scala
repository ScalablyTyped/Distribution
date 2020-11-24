package typings.headroomJs.mod.headroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tolerance extends js.Object {
  
  /** @default 0 */
  var down: js.UndefOr[Double] = js.native
  
  /** @default 0 */
  var up: js.UndefOr[Double] = js.native
}
object Tolerance {
  
  @scala.inline
  def apply(): Tolerance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tolerance]
  }
  
  @scala.inline
  implicit class ToleranceOps[Self <: Tolerance] (val x: Self) extends AnyVal {
    
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
    def setDown(value: Double): Self = this.set("down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDown: Self = this.set("down", js.undefined)
    
    @scala.inline
    def setUp(value: Double): Self = this.set("up", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUp: Self = this.set("up", js.undefined)
  }
}
