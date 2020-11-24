package typings.lyricParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineNum extends js.Object {
  
  var lineNum: Double = js.native
  
  var txt: String = js.native
}
object LineNum {
  
  @scala.inline
  def apply(lineNum: Double, txt: String): LineNum = {
    val __obj = js.Dynamic.literal(lineNum = lineNum.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNum]
  }
  
  @scala.inline
  implicit class LineNumOps[Self <: LineNum] (val x: Self) extends AnyVal {
    
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
    def setLineNum(value: Double): Self = this.set("lineNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTxt(value: String): Self = this.set("txt", value.asInstanceOf[js.Any])
  }
}
