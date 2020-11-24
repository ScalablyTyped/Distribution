package typings.jimpPluginPrint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignmentX extends js.Object {
  
  var alignmentX: Double = js.native
  
  var alignmentY: Double = js.native
  
  var text: String = js.native
}
object AlignmentX {
  
  @scala.inline
  def apply(alignmentX: Double, alignmentY: Double, text: String): AlignmentX = {
    val __obj = js.Dynamic.literal(alignmentX = alignmentX.asInstanceOf[js.Any], alignmentY = alignmentY.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignmentX]
  }
  
  @scala.inline
  implicit class AlignmentXOps[Self <: AlignmentX] (val x: Self) extends AnyVal {
    
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
    def setAlignmentX(value: Double): Self = this.set("alignmentX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentY(value: Double): Self = this.set("alignmentY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
