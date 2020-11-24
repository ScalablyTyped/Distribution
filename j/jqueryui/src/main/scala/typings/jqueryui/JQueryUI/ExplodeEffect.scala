package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplodeEffect extends js.Object {
  
  var pieces: js.UndefOr[Double] = js.native
}
object ExplodeEffect {
  
  @scala.inline
  def apply(): ExplodeEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplodeEffect]
  }
  
  @scala.inline
  implicit class ExplodeEffectOps[Self <: ExplodeEffect] (val x: Self) extends AnyVal {
    
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
    def setPieces(value: Double): Self = this.set("pieces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePieces: Self = this.set("pieces", js.undefined)
  }
}
