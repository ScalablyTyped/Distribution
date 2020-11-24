package typings.leveldown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LevelDownClearOptions extends js.Object {
  
  var gt: js.UndefOr[Bytes] = js.native
  
  var gte: js.UndefOr[Bytes] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var lt: js.UndefOr[Bytes] = js.native
  
  var lte: js.UndefOr[Bytes] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
}
object LevelDownClearOptions {
  
  @scala.inline
  def apply(): LevelDownClearOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelDownClearOptions]
  }
  
  @scala.inline
  implicit class LevelDownClearOptionsOps[Self <: LevelDownClearOptions] (val x: Self) extends AnyVal {
    
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
    def setGt(value: Bytes): Self = this.set("gt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGt: Self = this.set("gt", js.undefined)
    
    @scala.inline
    def setGte(value: Bytes): Self = this.set("gte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGte: Self = this.set("gte", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLt(value: Bytes): Self = this.set("lt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLt: Self = this.set("lt", js.undefined)
    
    @scala.inline
    def setLte(value: Bytes): Self = this.set("lte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLte: Self = this.set("lte", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
  }
}
