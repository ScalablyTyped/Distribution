package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryPositionOptions extends js.Object {
  
  var at: js.UndefOr[String] = js.native
  
  var collision: js.UndefOr[String] = js.native
  
  var my: js.UndefOr[String] = js.native
  
  var of: js.UndefOr[js.Any] = js.native
  
  var using: js.UndefOr[js.Function] = js.native
  
  var within: js.UndefOr[js.Any] = js.native
}
object JQueryPositionOptions {
  
  @scala.inline
  def apply(): JQueryPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryPositionOptions]
  }
  
  @scala.inline
  implicit class JQueryPositionOptionsOps[Self <: JQueryPositionOptions] (val x: Self) extends AnyVal {
    
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
    def setAt(value: String): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAt: Self = this.set("at", js.undefined)
    
    @scala.inline
    def setCollision(value: String): Self = this.set("collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollision: Self = this.set("collision", js.undefined)
    
    @scala.inline
    def setMy(value: String): Self = this.set("my", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMy: Self = this.set("my", js.undefined)
    
    @scala.inline
    def setOf(value: js.Any): Self = this.set("of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOf: Self = this.set("of", js.undefined)
    
    @scala.inline
    def setUsing(value: js.Function): Self = this.set("using", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsing: Self = this.set("using", js.undefined)
    
    @scala.inline
    def setWithin(value: js.Any): Self = this.set("within", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithin: Self = this.set("within", js.undefined)
  }
}
