package typings.istanbulReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextOptions extends FileOptions {
  
  var maxCols: Double = js.native
  
  var skipEmpty: Boolean = js.native
  
  var skipFull: Boolean = js.native
}
object TextOptions {
  
  @scala.inline
  def apply(file: String, maxCols: Double, skipEmpty: Boolean, skipFull: Boolean): TextOptions = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], maxCols = maxCols.asInstanceOf[js.Any], skipEmpty = skipEmpty.asInstanceOf[js.Any], skipFull = skipFull.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextOptions]
  }
  
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxCols(value: Double): Self = this.set("maxCols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipEmpty(value: Boolean): Self = this.set("skipEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFull(value: Boolean): Self = this.set("skipFull", value.asInstanceOf[js.Any])
  }
}
